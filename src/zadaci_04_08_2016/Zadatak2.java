/**
 *  ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10.
 *   Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom: 
 *   (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 *   Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom.
 *    Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. 
 *    (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
 *   Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */
package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {
	/**
	 * static means "associated with the class"; without it, the variable is
	 * associated with each instance of the class. Declaring the field as
	 * 'final' will ensure that the field is a constant and cannot change.
	 */
	static final int ISBN = 10;

	public static void main(String[] args) {
		// Getting user input
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out
						.print("Enter the first 9 digits of an ISBN as integer: ");
				int nineDigitISBN = input.nextInt();

				// Splitting the nineDigitISBN into an array and counting the
				// digit sum
				char[] tenDigitISBN = new char[ISBN];

				int nineDigitSum = 0;
				for (int i = ISBN - 2; i >= 0; i--) {
					int digit = nineDigitISBN % 10;
					tenDigitISBN[i] = Integer.toString(digit).charAt(0);

					digit = digit * (i + 1);
					nineDigitSum += digit;
					nineDigitISBN /= 10;
				}

				// Placing correct format for digit 10
				int lastDigit = nineDigitSum % 11;
				if (lastDigit == 10) {
					tenDigitISBN[ISBN - 1] = 'X';
				} else {
					tenDigitISBN[ISBN - 1] = Integer.toString(lastDigit)
							.charAt(0);
				}
				System.out.println("The ISBN-10 number is "
						+ new String(tenDigitISBN));

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
