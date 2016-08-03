/**
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se sljedeæim headerom:
 * public static double min(double[ ] array)
 * Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
 */
package zadaci_03_08_2016;

//import Scanner
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {
	// Main class
	public static void main(String[] args) {
		// create Scanner
		Scanner input = new Scanner(System.in);
		// while loop if it is false that the user has the new chance to
		// re-enter
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// Ask the user to enter ten numbers
				System.out.print("Enter ten numbers:");
				// create an array of ten numbers
				double[] numbers = new double[10];
				// with for loop go number by number increasing
				for (int i = 0; i < numbers.length; i++) {
					// assign a variable amount which the user enters
					numbers[i] = input.nextDouble();
				}
				// print the minimum number in the array as we call the method
				System.out.println("The minimum number is: " + min(numbers));
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
		// close Scanner
		input.close();

	}

	// method to find the minimum number in array
	public static double min(double[] array) {
		// index of minimum number
		double min = array[0];
		// for loop to find minimum number
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;

	}

}
