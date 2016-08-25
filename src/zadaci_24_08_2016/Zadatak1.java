/**
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
 * divisible by 2 or 3.
 */
package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak1 {

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
			BigDecimal remainder2 = hugeNum.remainder(new BigDecimal(2));
			BigDecimal remainder3 = hugeNum.remainder(new BigDecimal(3));
			// if both remainders are equal to zero print out the huge number and
						// increment hugeNumCount by 1
			if (remainder2.equals(BigDecimal.ZERO)
					|| remainder3.equals(BigDecimal.ZERO)) {
				hugeNumCount++;
				System.out.println(hugeNumCount + ": " + hugeNum);
			}
			hugeNum = hugeNum.add(BigDecimal.ONE);
		}
	}

}
