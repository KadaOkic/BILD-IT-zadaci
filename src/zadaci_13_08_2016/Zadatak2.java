/**
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeðen kao argument: 
 * public static void reverse(int number). Na primjer, reverse(3456) treba da vrati 6543. 
 * Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. 
 */
package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		int number = takeInput("Enter an integer :");
		reverse(number);

	}

	public static void reverse(int number) {
		// while there is no rest for dividing with 10
		while (number % 10 != 0) {
			// printing out last digit
			System.out.print(number % 10);
			// removing the last digit
			number = number / 10;
		}

	}

	// taking input from the user and controling with try i catch
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				isGood = true;
				userInput = input.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer: )");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;

	}

}
