/**
 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
 * BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.*/

package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {
	// Main method
	public static void main(String[] args) {
		// create a Scanner
		Scanner input = new Scanner(System.in);
		// if it isGood it will work, when isGood=false it will catch the
		// exception and the user can enter again
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out
						.println("Enter a start number, final number and number of prime numbers per line: ");
				// declaration and initialization
				int startNumber = input.nextInt();
				int finalNumber = input.nextInt();
				int numPerLine = input.nextInt();
				printPrime(startNumber, finalNumber, numPerLine);
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
		// close Scanner
		input.close();
	}

	// method to print prime numbers between the numbers that user enters and
	// how much he want in one line
	public static void printPrime(int startNumber, int finalNumber,
			int numberPerLine) {
		int countPrimes = 0;
		for (int i = startNumber; i < finalNumber; i++) {
			// Repeatedly find prime numbers

			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?

			// Test if number is prime
			for (int divisor = 2; divisor <= i / 2; divisor++) {
				if (i % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
			// Print the prime number and increase the count
			if (isPrime) {
				System.out.print(i + " ");
				countPrimes++; // Increase the count
			}
			if (countPrimes % numberPerLine == 0 && isPrime) {
				// Print the number and advance to the new line
				System.out.println();
			}

		}
	}
}
