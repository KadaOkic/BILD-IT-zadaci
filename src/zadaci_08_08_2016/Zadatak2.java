/**
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu.
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana.
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. 
 */
package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter month and year :");
				// assign int to a month and days variable
				int month = input.nextInt();
				int year = input.nextInt();
				// declaration and initialisation od days as 31 because most of
				// the months has 31 days
				int days = 31;
				// declaration of a monthString
				String monthString;
				// for February we check if is a leap year then is 29 days
				// otherwise is 28 days
				switch (month) {
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						days = 29;
						break;
					}
					days = 28;
					break;
				// for this four cases it is 30 days
				case 4:
				case 6:
				case 9:
				case 11:
					days = 30;

				}
				// we assign to every number(1-12) name of the month and when
				// user enters 1 we print to him name of the month and how many
				// days he has
				switch (month) {
				case 1:
					monthString = "January";
					break;
				case 2:
					monthString = "February";
					break;
				case 3:
					monthString = "March";
					break;
				case 4:
					monthString = "April";
					break;
				case 5:
					monthString = "May";
					break;
				case 6:
					monthString = "June";
					break;
				case 7:
					monthString = "July";
					break;
				case 8:
					monthString = "August";
					break;
				case 9:
					monthString = "September";
					break;
				case 10:
					monthString = "October";
					break;
				case 11:
					monthString = "November";
					break;
				case 12:
					monthString = "December";
					break;
				// when user enters out of range(1-12) print this and break
				default:
					monthString = "Invalid month";
					days = 0;
					break;
				}

				System.out.println(monthString + " " + year + " had " + days
						+ " days");
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
