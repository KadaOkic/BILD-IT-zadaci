/**
 * (Square numbers) Find the first ten square numbers that are greater than
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example,
 * 4, 9, and 16 are square numbers. Find an efficient approach to run your
 * program fast.
 */
package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak2 {

	public static void main(String[] args) {

		// BigDecimal object with value of maximum value of long number
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		long start = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal n = new BigDecimal(start);
		int count = 0;
		// loop that will run until counte reaches 10, in the loop we check if
		// the current number is a square number
		while (count < 10) {

			BigDecimal squared = n.multiply(n);
			if (squared.compareTo(longMaxValue) >= 0) {
				count++;
				System.out.println(count + ": " + squared);
			}
			n = n.add(BigDecimal.ONE);
		}

	}

}
