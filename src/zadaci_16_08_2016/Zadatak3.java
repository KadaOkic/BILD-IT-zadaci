/**
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj.
 * Program treba da provjerava da li je broj unesešen u ispravnom formatu. 
 * Ukoliko nije, program pita korisnika da pokuša ponovo. 
 * Ukoliko jeste unešen u pravom formatu, program završava sa radom.
 */
package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Format SSNa: DDD-DD-DDDD(D- is a number)");

		boolean validNumber = false;
		String str = "";
		// loop is circling until the user enters valid number
		while (!validNumber) {
			System.out.print("Enter SSN: ");
			str = input.nextLine();
			validNumber = true;
			// if string is not equal to 11 SSN is false
			if (str.length() != 11) {
				validNumber = false;
				System.out.println(str + " is not valid SSN");
				continue;
			}
			for (int i = 0; i < str.length(); i++) {
				// if this conditions are true valid number is false
				if (((i == 3 || i == 6) && str.charAt(i) != '-')
						|| (i != 3 && i != 6)
						&& !Character.isDigit(str.charAt(i))) {
					validNumber = false;
					System.out.println(str + " is not valid SSN");
					break;
				}
			}
		}
		System.out.println(str + " is valid SSN number");
		input.close();
	}
}
