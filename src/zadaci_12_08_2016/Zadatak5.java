/**
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. 
 * Pretpostavimo da nula prekida unos brojeva. 
 * Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 
 * program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 */
package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		int[] counts = new int[100]; // Counts the occurrences of numbers

		// Prompt the user to enter integers between 1 and 100
		System.out
				.print("Enter the integers between 1 and 100(0 ends the input): ");

		// Count occurrence of numbers
		count(counts);

		// Display results
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + " occurs " + counts[i] + " time"
						+ (counts[i] > 1 ? "s" : ""));
		}
	}

	// Method count reads integers between 1 and 100 and counts the occurrences
	// of each

	public static void count(int[] counts) {
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				int num; // holds user input
				do {
					num = input.nextInt();
					if (num >= 1 && num <= 100)
						counts[num - 1]++;
				} while (num != 0);
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
