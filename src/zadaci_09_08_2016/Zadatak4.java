/**
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio. 
 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta. 
 */
package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers(Note:0 ends the input) : ");
		int i;
		int max = 0;// max stores the current max number
		int count = 0;// count stores its occurrences
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				while ((i = input.nextInt()) != 0) {
					// Compare each next number with max. If the number is
					// greater
					// than max, assign it to max and reset count to 1
					if (i > max) {
						max = i;// assign the first number to max
						count = 1;
						// If the number is equal to max, increment count by 1
					} else if (i == max) {
						count++;
					}
				}

				System.out.println("The largest number is " + max);
				System.out
						.println("The occurrence count of the largest number is "
								+ count);
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer : ");
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
