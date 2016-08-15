/**
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
 * Koristite sljedeæi header: public static int sumDigits(long n).
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */
package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		long num = takeInput("Enter a number :");

		System.out.println("The sum of the digits is " + sumDigits(num));
	}

	public static int sumDigits(long n) {
		int sum = 0;

		while (n != 0) {
			// going digit by digit from right to left and adding to the sum
			// while number is different from zero
			sum += n % 10;
			n /= 10;
		}

		return sum;

	}

	// taking input from the user and controling with try i catch
	public static long takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		long userInput = 0;
		while (!isGood) {
			try {
				isGood = true;
				userInput = input.nextLong();
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter a number in long format: )");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}
