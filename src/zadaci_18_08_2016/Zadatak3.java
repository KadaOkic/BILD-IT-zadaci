/**
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. 
 * Your program should first prompt the user to enter the input size—i.e., 
 * the number of values in the series. 
 */
package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		int noOfValues = takeInput("Enter a number of values:");
		// number of values becomes array length
		int[] array = new int[noOfValues];
		array[i] = takeInput("Enter " + noOfValues + " values: ");
		for (i = 0; i < array.length; i++) {

		}

		if (isConsecutiveFour(array)) {
			System.out.println("The list has consecutive fours");
		} else
			System.out.println("The list has no consecutive fours");

	}

	// method to check array for sequance of 4 numbers
	public static boolean isConsecutiveFour(int[] values) {
		// counts the same and set to 0
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			// if 4 in a row same return true
			try {
				// if the value i is the same as the next increment count
				if (values[i] == values[i + 1]) {
					count++;
					if (count == 3)
						return true;
				} else
					// if number is different reset count
					count = 0;
			} catch (ArrayIndexOutOfBoundsException ex) {
				continue;
			}

		}
		return false;
	}

	public static int takeInput(String message) {
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				if (userInput > 0) {
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