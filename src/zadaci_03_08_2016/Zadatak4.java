/**
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeæi header:
 * public static int[ ] locateLargest(double[ ][ ] a)
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
 */
package zadaci_03_08_2016;

//import za exception i scanner
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {
	// Main class
	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// ask user to enter number of rows and columns of the array
				System.out
						.printf("Enter the number of rows and columns of the array: ");
				// assign the variable
				int row = input.nextInt();
				int column = input.nextInt();
				// create new 2D array
				double[][] m = new double[row][column];
				// enter an array
				System.out.println("Enter the array of " + row + " rows and "
						+ column + " columns below: ");
				for (int i = 0; i < row; i++)
					for (int k = 0; k < column; k++)
						// assign a variable to the numbers within
						m[i][k] = input.nextDouble();
				// call a method for locating the largest element in the array
				int[] location = locateLargest(m);
				// print the location of the largest element
				System.out.printf(
						"The location of the largest element is at (%d, %d)\n",
						location[0], location[1]);
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

	public static int[] locateLargest(double[][] a) {

		int[] location = new int[] { 0, 0 };
		double largest = a[0][0];
		// finding the largest element with for loop and if
		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {

				if (a[i][k] > largest) {
					location[0] = i; // row
					location[1] = k; // column
					largest = a[i][k];
				}

			}
		}

		return location;

	}

}
