/**Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, 
 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. 
 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
 */
package zadaci_02_08_2016;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak2 {
	// Main method
	public static void main(String[] args) {
		// import and create Scanner
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// ask user to enter a number
				System.out.println(" Enter a number od questions : ");
				// assign a variable amount which the user enters
				int number = input.nextInt();
				numberOfQuestions(number);
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();

			}
		}
		input.close();

	}

	public static void numberOfQuestions(int n) {
		int correctCount = 0; // Count the number of correct answers
		int wrongCount = 0; // count the number od incorrect answers
		int count = 0; // Count the number of question
		java.util.Scanner input = new java.util.Scanner(System.in);
		while (count < n) {
			// 1. Generate two random digit integers
			int number1 = (int) (Math.random() * 16);
			int number2 = (int) (Math.random() * 16);
			count++;
			// 3. Prompt the student to answer “What is number1 + number2?”
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			// 4. Grade the answer and display the result
			if ((number1 + number2) == answer) {
				correctCount++;
			} else
				wrongCount++;

		}
		System.out.println("Number of correct answers is " + correctCount
				+ " and number od incorrect answers is " + wrongCount);
		input.close();
	}
}