/**
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1 +
 * 1/2 + 1/3 + c + 1/i
Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
package zadaci_06_09_2016;

public class SumSeries {

	public static void main(String[] args) {

		System.out.printf("%.2f", sum(10));

	}

	// recursive method that returns sums series of numbers stated in assignment
	public static double sum(double n) {
		// base case
		if (n <= 1)
			return n;
		return 1 / n + sum(n - 1);

	}

}
