/**
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */
package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		int number = takeInput("Enter a number of lines : ");

		// Loop through the lines from 1 to number of lines
		for (int i = 1; i <= number; i++) {
			// printing spaces, 2 at a time from j=1 to j= n-i
			for (int j = 1; j <= (number - i); j++) {
				System.out.print("  ");
			}

			// Printing number decreamentally from j line number to 1
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// Printing number increamentally from 2 to line number j 
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

	// taking input from the user and checking it
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				if (userInput >= 1) {
					isGood = true;
				} else {
					System.out.println("Enter numbers greater then 0 : ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}
