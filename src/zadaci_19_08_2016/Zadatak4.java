/**
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header:
 * public static void sort(int m[][])
 * The method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * will be sorted to
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
package zadaci_19_08_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 },
				{ 1, 1 }, { 4, 1 } };
		sort(matrix);
		displayMatrix(matrix);
	}

	// sorting in the increasing order
	public static void sort(int m[][]) {
		// find minimum row and column
		for (int i = 0; i < m.length - 1; i++) {
			int currentIndex = i;
			int[] current = m[i];
			for (int j = i + 1; j < m.length; j++) {
				if (current[0] > m[j][0] || current[0] == m[j][0]
						&& current[1] > m[j][1]) {
					current = m[j];
					currentIndex = j;
				}
			}
			// Swap list[i] with list[currentIndex] min if necessary
			if (currentIndex != i) {
				m[currentIndex] = m[i];
				m[i] = current;
			}
		}

	}

	// Display sorted array
	public static void displayMatrix(int[][] m) {
		System.out.println("The sorted array:");
		for (int i = 0; i < m.length; i++) {
			System.out.print("{" + m[i][0] + ", " + m[i][1] + "}");

		}
	}
}