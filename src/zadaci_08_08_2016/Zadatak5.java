/**
 * Neke web stranice forsiraju odreðena pravila za passworde.
 * Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeæa: 
 *  1. Password mora biti saèinjen od najmanje 8 karaktera. 
 *  2. Password smije da se sastoji samo od slova i brojeva. 
 *  3. Password mora sadržati najmanje 2 broja.
 *  Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
 */
package zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("A password must have at least eight characters.\n"
				+ "A password consists of only letters and digits.\n"
				+ "A password must contain at least two digits \n"
				+ "Enter a password meeting the requirements above: ");
		String s = input.nextLine();

		if (isValidPassword(s)) {
			System.out.println("Password is VALID: " + s);
		} else {
			System.out.println("NOT VALID PASSWORD: " + s);
		}
		input.close();
	}

	public static boolean isValidPassword(String password) {
		// A password must have at least eight characters.
		if (password.length() < 8)
			return false;

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);
			// A password consists of only letters and digits.
			if (isDigit(ch))
				numCount++;
			else if (isLetter(ch))
				charCount++;
			// if a char in the password is not a letter or a
			// digit, return false
			else
				return false;
		}
		// A password must contain at least two
		// digits.
		return (charCount >= 2 && numCount >= 2);
	}

	// method to check if is a letter
	public static boolean isLetter(char ch) {
		return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
	}

	// method to check if it is a digit
	public static boolean isDigit(char ch) {

		return (ch >= '0' && ch <= '9');

	}

}
