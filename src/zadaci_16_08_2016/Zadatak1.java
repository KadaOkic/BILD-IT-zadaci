/**
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */
package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		int number = takeInput(" Enter a three digit integer: ");

		// Extracting digits first and last
		int first = number / 100;
		int last = number % 10;
		if (last == first) {
			System.out.print(number + " is a palindrome");
		} else {
			System.out.print(number + " is not a palindrome");
		}

	}

	// taking input from the user and checking it
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				if (userInput > 99 && userInput < 1000) {
					isGood = true;
				} else {
					System.out
							.println("Enter numbers greater then 100 and smaller then 1000 : ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter a three digit integer) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}
