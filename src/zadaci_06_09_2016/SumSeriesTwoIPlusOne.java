/**
 * (Sum series) Write a recursive method to compute the following series:
m(i) =1/3 + 2/5 + 3/7 + 4/9 + 5/11 + 6/13 + ... + i/2i + 1
 */
package zadaci_06_09_2016;

public class SumSeriesTwoIPlusOne {

	public static void main(String[] args) {

		System.out.printf("%.2f", sum(10));

	}

	// recursive method that returns sums number of the series stated in
	// assignment
	public static double sum(double n) {
		// base case
		if (n < 1)
			return n;
		return n / ((2 * n) + 1) + sum(n - 1);

	}

}
