/**
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical.
 */
package zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// create two lists and prompt user to enter values
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter list1: ");
				for (int i = 0; i < m1.length; i++)
					for (int j = 0; j < m1[i].length; j++)
						m1[i][j] = input.nextInt();
				System.out.print("Enter list2: ");
				for (int i = 0; i < m2.length; i++)
					for (int j = 0; j < m2[i].length; j++)
						m2[i][j] = input.nextInt();
				// if equal print message
				if (equals(m1, m2)) {
					System.out
							.println("The two arrays are strictly identical.");
					// if not equal-print this message
				} else {
					System.out
							.println("The two arrays are not strictly identical");
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
		input.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {

		if (m1.length != m2.length || m1[0].length != m2[0].length)
			return false;

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				// if elements of both list at the same index are not the same
				// value
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		// not identical
		return true;

	}

}
