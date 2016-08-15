/**
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: 
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana.
 * Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.

 */
package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		int number = takeInput(" Enter a number for matrix n x n :");
		printMatrix(number);

	}

	public static void printMatrix(int n) {
		// number of columns goes from 0 to the users input number incrementing
		// by one
		for (int column = 0; column < n; column++) {

			for (int row = 0; row < n; row++) {
				// Each element is 0 or 1, which is generated randomly
				// print a signed integer, with a minimum width of 1 character.
				System.out.printf("%1d ", (int) (Math.random() * 2));
			}
			System.out.println("");
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
				if (userInput > 0) {
					isGood = true;
				} else {
					System.out.println("Enter number greater then 0: ");
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
