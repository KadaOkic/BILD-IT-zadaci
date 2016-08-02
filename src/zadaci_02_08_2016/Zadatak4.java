/**Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
 * public static void printMatrix(int n)
 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno.
 *  Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.*/
package zadaci_02_08_2016;

import java.util.InputMismatchException;

public class Zadatak4 {
	// Main class
	public static void main(String[] args) {
		// importing and creating Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// ask the user to enter a number
				System.out.print("Enter number n: ");
				// assign a variable amount which the user enters
				int n = input.nextInt();
				printMatrix(n);

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

	// Method for printing the matrix
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// printing random 0 and 1 with space between
				System.out.print(intRandom(0, 1) + " ");
			}
			System.out.println();
		}

	}

	// shuffle where will be placed 0 an 1 and returns a double value with a
	// positive sign, greater than or equal to 0.0 and less than 1.0
	public static int intRandom(int lowerBound, int upperBound) {
		return (int) (lowerBound + Math.random()
				* (upperBound - lowerBound + 1));
	}

}
