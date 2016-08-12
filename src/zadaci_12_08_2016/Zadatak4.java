/**
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem redosljedu.
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu. 
 */
package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Create Scanner

		// ask the user to enter three numbers
		System.out.print("Enter three numbers: ");
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {

				double number1 = input.nextDouble();
				double number2 = input.nextDouble();
				double number3 = input.nextDouble();

				// Display numbers in increasing order
				displaySortedNumbers(number1, number2, number3);

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

	// displaySortedNumbers method displays three numbers in increasing order
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		double temp; // Hold number to swap

		if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		// Display result
		System.out.println(num1 + " " + num2 + " " + num3);

	}

}
