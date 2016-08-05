/**
 * Napisati program koji u�itava neodre�eni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih une�enih brojeva
 *  a koliko je bilo brojeva ispod prosjeka. 
 *  Pretpostavimo da je maksimalan niz brojeva koje korisnik mo�e unijeti 100.
 */
package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		final int MAX_NUMBER_OF_ENTRY = 100;

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				int[] entry = new int[MAX_NUMBER_OF_ENTRY];
				int sum = 0, avg = 0, n = 0;
				System.out
						.print("Enter array of numbers (End input with a zero):");
				for (int i = 1; i < entry.length; i++) {

					entry[i] = input.nextInt();
					if (entry[i] < 1) {
						avg = sum / i;
						break;
					} else {
						sum += entry[i];
						n++;
					}
				}

				int equal = 0, above = 0, below = 0;
				for (int i = 1; i < n; i++) {
					if (entry[i] == avg) {
						equal++;
					} else if (entry[i] > avg) {
						above++;
					} else {
						below++;
					}

				}

				System.out.println("The number of entry equal to average is "
						+ equal);
				System.out.println("The number of entry above average is "
						+ above);
				System.out.println("The number of entry below average is "
						+ below);
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		input.close();
	}
}
