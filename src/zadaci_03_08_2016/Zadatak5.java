/**
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * Napisati testni program koji pita korisnika da unese 3x3 matricu
 *  (ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima -
 *  od najmanjeg broja do najveæeg.
 */
package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {
	// Main class
	public static void main(String[] args) {
		// create a matrix 3x3
		double[][] m = new double[3][3];
		// create a scanner
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// ask user to enter a matrix 3x3 row by row
				System.out.println("Enter a 3-by-3 matrix row by row: ");
				for (int i = 0; i < m.length; i++)
					for (int j = 0; j < m[i].length; j++)
						// assign double variable to the numbers in the matrix
						m[i][j] = input.nextDouble();
				// call methods for sorting and display matrix
				double[][] sorted = sortRows(m);
				displayMatrix(sorted);
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

	// method to display matrix
	public static void displayMatrix(double[][] m) {
		// for loop to go through rows and columns and print them with one
		// decimal and separate them with space
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.1f ", m[i][j]);
			}
			System.out.println("");
		}
	}

	// method to sort rows from the smallest to the biggest
	public static double[][] sortRows(double[][] m) {

		double[][] sortedRows = new double[m.length][m[0].length];

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				sortedRows[i][j] = m[i][j];

		// sort only rows
		for (int i = 0; i < sortedRows.length; i++) {

			for (int j = 0; j < sortedRows[0].length - 1; j++) {

				double currentMin = sortedRows[i][j];
				int minIndex = j;
				for (int column = j + 1; column < sortedRows[0].length; column++) {

					if (currentMin > sortedRows[i][column]) {
						currentMin = sortedRows[i][column];
						minIndex = column;
					}
				}

				if (minIndex != j) {
					sortedRows[i][minIndex] = sortedRows[i][j];
					sortedRows[i][j] = currentMin;
				}
			}
		}

		return sortedRows;

	}

}
