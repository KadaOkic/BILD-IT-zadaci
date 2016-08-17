/**
 * Napisati metodu sa sljedeæim headerom: 
 * public static String format(int number, int width) koja vraæa string broja sa prefiksom od jedne ili više nula.
 * Velièina stringa je width argument.
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) metoda vraæa 00034. 
 * Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
 */
package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		int n = takeInput("Enter a number:");
		int width = takeInput("Enter a width :");
		// callin method format
		String s = format(n, width);
		System.out.println("The number formatted: " + s);
	}

	public static String format(int number, int width) {

		int size = getNumberSize(number);
		// if size of number is bigger the width return number
		if (size > width)
			return "" + number;

		StringBuilder s = new StringBuilder();
		// add string to a number
		s.append(number);
		// leading zeroes
		for (int i = 0; i < width - size; i++) {
			// insert 0 infront of the number
			s.insert(0, '0');
		}

		return s.toString();
	}

	public static int getNumberSize(int n) {

		int size = 0;
		// while size of the number is bigger then zero increment size
		while (n > 0) {
			size++;
			// devide number by 10
			n /= 10;
		}
		return size;

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
				if (userInput >= 1) {
					isGood = true;
				} else {
					System.out.println("Enter numbers greater then 0 : ");
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
