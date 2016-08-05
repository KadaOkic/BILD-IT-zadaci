/**
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */
package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {

				int[] number = new int[10];

				System.out.print("Enter 10 integers:");
				// passing input values to array
				for (int i = 0; i < number.length; i++) {
					number[i] = input.nextInt();
				}
				// with for loop go from the end index and decrease i by one and
				// displaying in reverse order
				for (int i = number.length - 1; i >= 0; i--) {
					System.out.print(number[i] + " ");
				}

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
		// Scanner closed
		input.close();

	}

}
