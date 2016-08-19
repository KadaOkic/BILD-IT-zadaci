/**
 * (Algebra: add two matrices) Write a method to add two matrices. 
 * The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements.
 *  Let c be the resulting matrix. Each element cij is aij + bij.
 *  Write a test program that prompts the user to enter two 3 * 3 matrices and
 *  displays their sum.
 */
package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter matrix 3x3: ");
				double[][] matrix1 = new double[3][3];
				for (int i = 0; i < matrix1.length; i++) {
					for (int j = 0; j < matrix1[i].length; j++) {
						matrix1[i][j] = input.nextDouble();
					}
				}

				System.out.println("Enter matrix2 3x3: ");
				double[][] matrix2 = new double[3][3];
				for (int i = 0; i < matrix1.length; i++) {
					for (int j = 0; j < matrix1[i].length; j++) {
						matrix2[i][j] = input.nextDouble();
					}
				}

				double[][] resultMatrix = addMatrix(matrix1, matrix2);
				System.out.println("The addition of the matrices is ");
				printResult(matrix1, matrix2, resultMatrix);

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

	}

	// sum elements at the same index of 2 matrices
	public static double[][] addMatrix(double[][] m1, double[][] m2) {
		double[][] result = new double[m1.length][m1[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++)
				result[i][j] = m1[i][j] + m2[i][j];
		}
		return result;
	}

	// printing double values matrix1 + matrix2 = matrix3
	public static void printResult(double[][] m1, double[][] m2, double[][] m3) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(" " + m1[i][j]);
			}
			if (i == m1.length / 2)
				System.out.print(" + ");
			else {
				System.out.print("   ");
			}

			for (int j = 0; j < m2[0].length; j++) {
				System.out.print(" " + m2[i][j]);
			}
			if (i == m2.length / 2)
				System.out.print(" = ");
			else {
				System.out.print("   ");
			}

			for (int j = 0; j < m3[0].length; j++) {
				System.out.print(" " + m3[i][j]);
			}

			System.out.println();
		}
	}
}