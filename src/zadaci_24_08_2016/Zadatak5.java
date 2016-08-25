/**
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 * that are divisible by 5 or 6.
 */
package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak5 {

	public static void main(String[] args) {

		String numString = "" + 1;
		// creating a 50 digit decimal number
		for (int i = 0; i < 49; i++) {

			numString += "0";
		}

		BigDecimal hugeNum = new BigDecimal(numString);
		int hugeNumCount = 0;
		while (hugeNumCount < 10) {

			// check if huge number if divisible by 2 of 3
			BigDecimal remainder5 = hugeNum.remainder(new BigDecimal(5));
			BigDecimal remainder6 = hugeNum.remainder(new BigDecimal(6));
			// if both remainders are equal to zero print out the huge number
			// and
			// increment hugeNumCount by 1
			if (remainder5.equals(BigDecimal.ZERO)
					|| remainder6.equals(BigDecimal.ZERO)) {
				hugeNumCount++;
				System.out.println(hugeNumCount + ": " + hugeNum);
			}
			hugeNum = hugeNum.add(BigDecimal.ONE);
		}

	}

}
