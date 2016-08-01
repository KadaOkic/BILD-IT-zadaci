/** Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi zajednièki djelilac za ta dva broja.
 */

package zadaci_01_08_2016;

import java.util.InputMismatchException;

public class Zadatak3 {

	/** Main method */
	public static void main(String[] args) {
		// import and create Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// Ask user to input two integers
				System.out.print("Enter the first number : ");
				// assign a variable amount which the user enters
				int n1 = input.nextInt();
				System.out.print("Enter the second number : ");
				int n2 = input.nextInt();
				/**
				 * This is printed to the user who is the greatest common
				 * divisor For the two numbers he entered
				 */

				System.out.println("Najveci zajednicki djelilac za " + n1
						+ " i " + n2 + " is " + gcd(n1, n2));
				/**
				 * With try and catch we " catch " possible exceptions if the
				 * user enters something else then integer
				 */
			} catch (InputMismatchException | ArithmeticException ex) {
				System.out.println("Pokusajte ponovo. ("
						+ "Pogresan unos: Cijeli broj se trazi ");
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

	/** We create method which returns the greatest common divisor (gcd ) */
	public static int gcd(int n1, int n2) {
		if (n1 <= 0 || n2 <= 0) {
			throw new ArithmeticException();
		}
		int gcd = 1;// the default is 1
		int k = 2; // greatest common divisor possible

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;//
			k++;
		}
		// Returns the greatest common divisor
		return gcd;
	}

}
