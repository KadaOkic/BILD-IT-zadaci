/**
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca 
 * (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu.
 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
 */
package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {

				System.out.print("Enter a year:");
				// assign int to the year variable
				int year = input.nextInt();

				System.out
						.print("Enter a month as a three letter word (Note:first letter uppercase Jan, Sep, Dec, ect) : ");
				// assign string to a month variable
				String month = input.next();
				// with switch we assign number of days to each month(Jan, Nov,
				// Jul) as well
				// when is a leap year
				int days = 0;
				switch (month) {
				// when is leap year February has 29 days so we check if is a
				// leap year or else has normally has 28
				case "Feb":
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						days = 29;
						break;
					}
					days = 28;
					break;
				// for this four cases is 30 days
				case "Apr":
				case "Jun":
				case "Sep":
				case "Nov":
					days = 30;
					break;
				// other months have 31 days
				case "Jan":
				case "Mar":
				case "May":
				case "Jul":
				case "Aug":
				case "Oct":
				case "Dec":
					days = 31;
					break;

				default:
					System.out.println("Invalid month.");
					System.exit(0);

				}

				System.out.println(month + " " + year + " has " + days
						+ " days.");

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
