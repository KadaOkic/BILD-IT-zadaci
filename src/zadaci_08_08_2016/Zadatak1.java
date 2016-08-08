/**
 * Napisati program koji ispisuje tri nasumi�na cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogrije�i, program ispisuje pitanje ponovo sve sa porukom da poku�a ponovo.
 * Ukoliko korisnik unese ta�an odgovor, program mu �estita i zavr�ava sa radom. 
 */
package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// 1. Generate three random single-digit integers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		// 3. Prompt the student to answer �what is number1 + number2 + number3
		// ?�
		System.out.print("What is " + number1 + " + " + number2 + " + "
				+ number3 + " ? ");
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {

				int answer = input.nextInt();

				// 4. Grade the answer and display the result
				while (answer != (number1 + number2 + number3)) {
					System.out
							.println("Answer you entered it is not correct. Please try again : ");
					System.out.print("What is " + number1 + " + " + number2
							+ " + " + number3 + "?:");
					answer = input.nextInt();
				}

				// if the answer is correct, print a message
				System.out
						.println("Congratulation, you entered a correct answer!");

			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer: ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		// Scanner closed
		input.close();
	}

}
