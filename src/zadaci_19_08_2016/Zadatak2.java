/**
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. 
 * The header of the method is:
 * public static double[][]multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays
 * their product.
 */
package zadaci_19_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {
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

				double[][] productMatrix = multiplyMatrix(matrix1, matrix2);
				System.out.println("The product of the matrices is ");
				printResult(matrix1, matrix2, productMatrix);

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

	// product of  elements at the same index of 2 matrices
	 public static double[][]multiplyMatrix(double[][] m1, double[][] m2) {
		double[][] product = new double[m1.length][m1[0].length];
		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[0].length; j++)
				product[i][j] = m1[i][j] * m2[i][j];
		}
		return product;
	}

	// printing double values matrix1 * matrix2 = matrix3
	public static void printResult(double[][] m1, double[][] m2, double[][] m3) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(" " + m1[i][j]);
			}
			if (i == m1.length / 2)
				System.out.print(" * ");
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
