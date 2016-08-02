/**Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine 101 do 2100, odvojene jednim spaceom.
 *  Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
 */
package zadaci_02_08_2016;

public class Zadatak1 {
	// Main mathod
	public static void main(String[] args) {
		// Declaration and initialization
		int startYear = 101;
		int finalYear = 2100;
		int counter = 0;
		/**
		 * with for loop we are going from start year and checking this boolean
		 * expression and increasing until we come to the final year
		 */

		for (int year = startYear; year <= finalYear; year++) {
			boolean leapYear = (year % 4 == 0 && year % 100 != 0)
					|| (year % 400 == 0);
			// with if and boolean we are checking is the leap year and if it is
			// we are increasing the counter
			if (leapYear) {
				counter++;
				// printing the years we the one space in between and 10 in one
				// row
				System.out.print(year + " ");
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
		// Printing the years between and the number of leap years
		System.out.println("\nNumber of leap years between " + startYear
				+ " and " + finalYear + " is: " + counter);

	}

}
