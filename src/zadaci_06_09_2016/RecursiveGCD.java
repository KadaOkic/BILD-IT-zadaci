/**
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
 * be defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n.
 * Otherwise, gcd(m, n) is gcd(n, m % n).
 * Write a recursive method to find the GCD. Write a test program that prompts the
 * user to enter two integers and displays their GCD.
 */
package zadaci_06_09_2016;

import java.util.Scanner;

public class RecursiveGCD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter two integers you want to find greatest common divisor for:");
		System.out.println(gcd(input.nextInt(), input.nextInt()));
		input.close();
	}

	// Recoursive method that returns greatest common divisor for two integers

	public static int gcd(int a, int b) {
		// base case
		if (a == 0 || b == 0)
			return a + b;
		return gcd(b, a % b);

	}

}
