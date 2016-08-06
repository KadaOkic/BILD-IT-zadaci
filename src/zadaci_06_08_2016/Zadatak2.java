/**
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese.
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
 * Razmak izmeðu godina treba biti jedan space. 

 */
package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

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

				int counter = 1;
				// go through from the start year to the final with for loop and
				// check if is a leap year
				for (int year = startYear; year <= finalYear; year++) {
					// calculate a leap year
					if ((year % 400 == 0)
							|| ((year % 4 == 0) && (year % 100 != 0))) {
						System.out.print(year + " ");
						if (counter % 10 == 0) {
							System.out.println();
						}
						counter++;
					}

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

}
