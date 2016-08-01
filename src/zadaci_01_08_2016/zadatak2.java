/**Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam)
 *  Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.
 */
package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Arrays;

public class zadatak2 {
	/** Main method */
	public static void main(String[] args) {
		// import and create Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Ask user to input a word or sentence
		System.out.print("Enter a string:");
		// assign a variable amount which the user enters
		String s = input.nextLine();
		// Declaration and initialization
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		/**
		 * create new ArrayList to put vowels and with for loop we determine the
		 * length od the string and with if and else if we check if is letter or
		 * contains a vowel
		 */
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A', 'E',
				'I', 'O', 'U'));
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.toUpperCase().charAt(i);
			if (Character.isLetter(ch) && vowels.contains(ch)) {
				numberOfVowels++;

			} else if (Character.isLetter(ch)) {
				numberOfConsonants++;
			}
		}
		// Prints the number of vowels and consonants to the user
		System.out.println("Number of vowels is : " + numberOfVowels);
		System.out.println("Number of consonants is :  " + numberOfConsonants);
		input.close();
	}

}
