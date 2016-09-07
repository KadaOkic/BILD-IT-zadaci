/**
 * (Sum the digits in an integer using recursion) Write a recursive method that
 * computes the sum of the digits in an integer. Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
 * that prompts the user to enter an integer and displays its sum.
 */
package zadaci_07_09_2016;

import java.util.Scanner;

public class RecursiveSumDigit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer:");
		// taking number from user
		int num = input.nextInt();
		input.close();
		// invoking method
		System.out.println(sumDigits(num));

	}

	// method that adds all digits of number to the sum which is returned
	public static int sumDigits(long n) {
		// if it's single digit number we return that number
		if (n < 10)
			return (int) n;
		// else we return sum of last digis and invoke recursion to remove last
		// digit of current number
		else {
			return (int) (n % 10) + sumDigits(n / 10);
		}

	}

}
