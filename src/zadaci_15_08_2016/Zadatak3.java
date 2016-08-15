/**
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 */
package zadaci_15_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		double total = 0.0;
		// serie from 1 to 97 incrementing i by 2
		for (int i = 1; i <= 97; i += 2) {
			// adding to the sum i devided by incremented i by 2
			total += (double) i / (i + 2);
		}
		System.out.println("Total is: " + total);

	}

}
