/**
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva
 *  a koliko je bilo brojeva ispod prosjeka. 
 *  Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */
package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		final int MAX_NUMBER_OF_SCORE = 100;

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				int[] score = new int[MAX_NUMBER_OF_SCORE];
				int sum = 0, avg = 0, n = 0;
				System.out
						.print("Enter array of numbers (End input with a zero):");
				for (int i = 1; i < score.length; i++) {

					score[i] = input.nextInt();
					if (score[i] < 1) {
						avg = sum / i;
						break;
					} else {
						sum += score[i];
						n++;
					}
				}

				int equal = 0, above = 0, below = 0;
				for (int i = 1; i < n; i++) {
					if (score[i] == avg) {
						equal++;
					} else if (score[i] > avg) {
						above++;
					} else {
						below++;
					}

				}

				System.out.println("The number of scores equal to average is "
						+ equal);
				System.out.println("The number of scores above average is "
						+ above);
				System.out.println("The number of scores below average is "
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
