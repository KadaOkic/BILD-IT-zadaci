/**
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or
 * number of years is less than or equal to zero.
 */
package zadaci_29_08_2016;

public class Zadatak5 {

	public static void main(String[] args) {

		try {
			Loan loan = new Loan(4.5, 2, -25);
		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException: " + ex.getMessage());
		}
	}
}
