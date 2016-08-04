package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter a 3 integers: ");
				double num1 = input.nextDouble();
				double num2 = input.nextDouble();
				double num3 = input.nextDouble();

				displaySortedNumbers(num1, num2, num3);

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

	// method for display double sorted numbers
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// create a temp to swap the values with the temp if the first number is bigger of the second and so on and sort them in
		// increasing order and then print them
		double temp;
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);

	}

}
