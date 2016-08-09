/**
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici 
 * (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu ispisuje da je danas utorak a dan u buduænosti je petak.) 
 */
package zadaci_09_08_2016;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak1 {

	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter today's day: ");
				int todayNumber = input.nextInt();

				System.out
						.print("Enter the number of days elapsed since today: ");
				int daysAfterNumber = input.nextInt();
				// calculate the future day
				int futureDayNumber = (todayNumber + daysAfterNumber) % 7;

				// Assigning date names to a string
				String todayDayString = findDate(todayNumber);
				String futureDayString = findDate(futureDayNumber);

				System.out.println("Today is " + todayDayString
						+ " and the future day is " + futureDayString);
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

	// method findDate is when we enter a number (0-6) it writes down name of
	// specific day
	public static String findDate(int date) {

		String todayString;

		switch (date) {
		case 0:
			todayString = "Sunday";
			break;
		case 1:
			todayString = "Monday";
			break;
		case 2:
			todayString = "Tuesday";
			break;
		case 3:
			todayString = "Wednesday";
			break;
		case 4:
			todayString = "Thursday";
			break;
		case 5:
			todayString = "Friday";
			break;
		case 6:
			todayString = "Saturday";
			break;
		default:
			todayString = "Invalid Day";
		}

		return todayString;
	}

}
