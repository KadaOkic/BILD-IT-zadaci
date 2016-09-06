/**
 * (Convert decimals to fractions) Write a program that prompts the user to enter
 * a decimal number and displays the number in a fraction. Hint: read the decimal
 * number as a string, extract the integer part and fractional part from the string,
 * and use the BigInteger implementation of the Rational class in Programming
 * Exercise 13.15 to obtain a rational number for the decimal number.
 */
package zadaci_05_09_2016;

import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToFractions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number(dot separated): ");
		// creating string array from user input using dot as split statement
		String[] nums = input.nextLine().split("[.]");
		input.close();
		// if number is entered correctly array must have more than 1 element
		if (nums.length > 1) {
			// first part or the numerator
			RationalBig first = new RationalBig(new BigInteger(nums[0]),
					BigInteger.ONE);
			// int that shows how many decimal spaces denominator has
			int decimal = nums[1].length();
			// second part of the denominator created with second element of the
			// array and 10^decimal spaces
			RationalBig second = new RationalBig(new BigInteger(nums[1]),
					BigInteger.TEN.pow(decimal));
			// result is fraction version of the number
			RationalBig res = first.add(second);
			// printing out result
			System.out.println("The fraction number is: " + res.toString());

		} else {
			// informing user the number was entered in wrong format probably
			// without a dot
			System.out.println("You entered number in wrong format");
		}

	}

}
