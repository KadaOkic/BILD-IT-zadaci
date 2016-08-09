/**
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
 * Metoda treba da koristi sljedeæi header: public static String convertMillis(long millis).
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */
package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out
						.print("Enter the number of milliseconds (enter 0 to stop):");
				while (true) {
					long number = input.nextLong();
					// if user enters 0 program stops
					if (number == 0)
						break;
					// calling method for coverting
					System.out.println("Converted time is "
							+ convertMillis(number));
				}

				System.out.println("Program stops!!!");

			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer : ");
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

	public static String convertMillis(long millis) {
		long totalMilliseconds = millis;

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		return totalHours + ":" + currentMinute + ":" + currentSecond;
	}

}
