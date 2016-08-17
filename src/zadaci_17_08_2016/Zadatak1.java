/**
 * Napisati program koji prima ASCII kod (cijeli broj izmeğu 0 i 127) te ispisuje koji je to karakter.
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 */
package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		int number = takeInput("Enter an ASCII code (an integer between 0 and 127): ");
		// number from 33 to 126 unicode has a character assign to that number
		System.out.println("The character for ASCII code " + number + " is "
				+ (char) number);

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
				if (userInput >= 0 && userInput <= 127) {
					isGood = true;
				} else {
					System.out
							.println("Enter numbers greater then 0 and smaller then 127: ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}
}