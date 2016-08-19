/**
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 */
package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double[][] matrix = new double[3][4];
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter a 3-by-4 matrix row by row: ");
				for (int row = 0; row < matrix.length; row++) {
					for (int column = 0; column < matrix[row].length; column++) {
						matrix[row][column] = input.nextDouble();
					}
				}
				//to print sum from 0 column index
				for (int i = 0; i < 4; i++) {
					System.out.println("Sum of the elements at column " + i
							+ " is " + sumColumns(matrix, i));
				}
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

	public static double sumColumns(double[][] m, int columnIndex) {
		double total = 0;
		for (int row = 0; row < m.length; row++) {
			// adds numbers in same column to the total
			total += m[row][columnIndex];

		}
		return total;
	}

}