/**
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header:
 * public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
 */
package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();
		// call method and display number of letters
		System.out.println("The number of letters is " + countLetters(s));

		// Scanner closed
		input.close();
	}

	public static int countLetters(String s) {

		int countLetter = 0;
		// counting letters with for loop
		for (int i = 0; i < s.length(); i++) {
			// if Character.isLetter (method) in the string,check every index
			// and
			// increase counter
			if (Character.isLetter(s.charAt(i))) {
				countLetter++;
			}
		}

		return countLetter;
	}

}
