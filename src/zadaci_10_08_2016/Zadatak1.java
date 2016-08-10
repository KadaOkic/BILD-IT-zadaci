/**
 * Napisati metodu koja vraæa broj dana u godini.
 * Metoda koristi sljedeæi header: public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
 */
package zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter a start year : ");
				int startYear = input.nextInt();

				System.out.print("Enter a final year : ");
				int finalYear = input.nextInt();

				for (int i = startYear; i <= finalYear; i++) {
					System.out.printf("%-4d%10d\n", i, numberOfDaysInAYear(i));
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

	public static int numberOfDaysInAYear(int year) {
		// calculate a leap year
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			// number of days in leap year
			return 366;
		}
		return 365;
	}

}
