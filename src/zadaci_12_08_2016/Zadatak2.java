/**
 * Napisati program koji pita korisnika da unese dva cijela, 
 * pozitivna broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */
package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {

				System.out.print("Enter a first number: ");
				int number1 = input.nextInt();
				System.out.print("Enter a second number: ");
				int number2 = input.nextInt();
				int gcd = 1; // greatest common divisor
				int lcd = 1; // lowest common divisor
				// compare the numbers using the temp switch places 
				if (number1 > number2) {
					int temp = number1;
					number1 = number2;
					number2 = temp;
				}
				// finding the lowest common divisor
				for (int i = 2; i <= number1; i++) {
					if (number1 % i == 0 && number2 % i == 0) {
						lcd = i;
						break;
					}
				}
				// finding the greatest common divisor
				for (int j = 2; j <= number1; j++) {
					if (number1 % j == 0 && number2 % j == 0) {
						gcd = j;

					}
				}
				System.out.println("The lowest common divisor is: " + lcd);
				System.out.println("Greatest common divisor is: " + gcd);
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
