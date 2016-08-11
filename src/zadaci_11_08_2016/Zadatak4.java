/**
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) 
 * te ispiše korisniku koliko je to u godinama i danima. 
 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
 */
package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		double minutesInYear = 60 * 24 * 365;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {

				double minutes = input.nextDouble();
				// we get years as we devide the number that we enter by minutes
				// in a year
				long years = (long) (minutes / minutesInYear);
				/**
				 * days-number of minutes that we enter divide by minutes and
				 * hours i a day and all that modulo (it produces the remainder
				 * of dividing the first value by the second value)with number
				 * of days in a year
				 */

				int days = (int) (minutes / 60 / 24) % 365;

				System.out.println((int) minutes + " minutes is approximately "
						+ years + " years and " + days + " days");

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

}
