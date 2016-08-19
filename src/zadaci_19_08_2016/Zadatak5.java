/**
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * every column have an even number of 1s.
 */
package zadaci_19_08_2016;

public class Zadatak5 {

	public static void main(String[] args) {

		int[][] m = generateMatrix(6, 6);

		displayMatrix(m);
		boolean rowHasEvenOnes = false;
		for (int i = 0; i < m.length; i++) {
			if (rowHasEvenOnes(m, i)) {
				rowHasEvenOnes = true;
				System.out.println("Row " + i + " has even sequence of ones");
			}
		}
		if (!rowHasEvenOnes) {
			System.out.println("No rows have an even sequence of ones");
		}
		boolean columnHasEvenOnes = false;
		for (int j = 0; j < m[0].length; j++) {
			if (columnHasEvenOnes(m, j)) {
				columnHasEvenOnes = true;
				System.out
						.println("Column " + j + " has even sequence of ones");

			}
		}
		if (!columnHasEvenOnes) {
			System.out.println("No Columns have an even sequence of ones");
		}

	}

	// display matrix
	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println("");
		}
	}

	// generate matrix 6x6 rows and columns with random 0s and 1s
	public static int[][] generateMatrix(int row, int columns) {

		int[][] m = new int[row][columns];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}

		return m;
	}

	// check in row for even number of 1s
	public static boolean rowHasEvenOnes(int[][] m, int row) {

		int count = 0;
		for (int j = 0; j < m[row].length; j++) {

			if (m[row][j] == 1)
				count++;
		}

		return (count % 2 == 0 && count != 0);
	}

	// check in column for even number of 1s
	public static boolean columnHasEvenOnes(int[][] m, int column) {

		int count = 0;
		for (int i = 0; i < m.length; i++) {

			if (m[i][column] == 1)
				// count 1s
				count++;
		}

		return (count % 2 == 0 && count != 0);
	}

}
