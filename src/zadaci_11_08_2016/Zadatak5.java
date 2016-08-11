/**
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva korisnik unijeo, 
 * koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, 
 * negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */
package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		// Creating variables to hold pos/neg/average/sum
		int positive = 0;
		int negative = 0;
		int sum = 0;
		double average = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				for (int entry = -1; entry != 0;) {
					entry = input.nextInt();

					if (entry > 0)
						positive++;
					else if (entry < 0)
						negative++;
					// add to sum every entry
					sum += entry;
				}
				if (positive + negative == 0) {
					System.out.println("No numbers are entered except 0");
					System.exit(0);
				}
				average = sum / (double) (positive + negative);
				System.out.println("The number of positives is " + positive);
				System.out.println("The number of negatives is " + negative);
				System.out.println("The sum is " + sum);
				System.out.println("The average is " + average);
			} catch (InputMismatchException ex) {
				System.out
						.println("Try again. ("
								+ "Invalid input: Enter an integer and a 0 at the end : ");
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
