/**
 * (Financial: credit card number validation) Credit card numbers follow certain patterns.
 * A credit card number must have between 13 and 16 digits. It must start with:
 * 4 for Visa cards
 * 5 for Master cards
 * 37 for American Express cards
 * 6 for Discover cards
 * Credit card numbers are generated following this validity check, commonly known as the
 * Luhn check or the Mod 10 check, which can be described as follows 
 * (for illustration,consider the card number 4388576018402626):
 * 
 *    1. Double every second digit from right to left. If doubling of a digit results in a
 * two-digit number, add up the two digits to get a single-digit number.
 *    2. Now add all single-digit numbers from Step 1. 
 *    4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 *    3. Add all digits in the odd places from right to left in the card number.
 *    6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 *    4. Sum the results from Step 2 and Step 3.
 *    37 + 38 = 75
 *    5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
 *    it is invalid. For example, the number 4388576018402626 is invalid, but the
 *    number 4388576018410707 is valid.
 * Write a program that prompts the user to enter a credit card number as a long
 * integer. Display whether the number is valid or invalid.
 */
package miniProjekat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCardValidation {

	public static final int PREFIX_VISA = 4;
	public static final int PREFIX_MASTER = 5;
	public static final int PREFIX_AMERICAN_EXPRESS = 37;
	public static final int PREFIX_DISCOVER = 6;

	public static void main(String[] args) {

		long number = takeInput(" Please enter the number of your credit card :");
		if (isValid(number)) {
			System.out.println("Number is valid.");
		} else {
			System.out.println("Number is invalid.");
		}

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

	// Return true if the card number is valid
	public static boolean isValid(long number) {
		// we are checking prefix with known card prefixes
		if ((getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, PREFIX_VISA)
						|| prefixMatched(number, PREFIX_MASTER)
						|| prefixMatched(number, PREFIX_AMERICAN_EXPRESS) || prefixMatched(
							number, PREFIX_DISCOVER))) {
			// if complete sum is divisible with 10 return true
			if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
				return true;
			}
		}
		return false;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		// converting long into the string
		String num = Long.toString(number);
		// taking even numbers from the right side
		for (int i = num.length() - 2; i >= 0; i -= 2) {
			// adding to the sum value of the method getDigit to which we are
			// passing double value of current number
			sum += getDigit(2 * Character.getNumericValue(num.charAt(i)));
		}
		return sum;

	}

	// Return this number if it is a single digit, otherwise, return the sum of
	// the two digits

	public static int getDigit(int number) {
		if (number > 9) {
			return (number % 10 + number / 10);
		}

		return number;
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = Long.toString(number);
		// taking odd numbers from the right side
		for (int i = num.length() - 1; i >= 0; i -= 2) {
			// adding to the sum value of the current number
			sum += Character.getNumericValue(num.charAt(i));
		}
		return sum;

	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {

		long prefix = getPrefix(number, getSize(d));
		return prefix == d;

	}

	// Return the number of digits in number d
	public static int getSize(long d) {
		String number = Long.toString(d);
		return number.length();

	}

	// Return the first k number of digits from number. If the number of digits
	// in number is less than k, return number.

	public static long getPrefix(long number, int k) {
		String num = Long.toString(number);
		if (num.length() < k) {
			return number;
		}
		return Long.valueOf(num.substring(0, k));
	}

}
