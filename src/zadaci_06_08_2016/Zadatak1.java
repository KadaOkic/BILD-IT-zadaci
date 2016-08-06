/**
 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12.
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */
package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter investment amount: ");
				double investmentAmount = input.nextDouble();

				System.out.print("Enter annual interest rate in percentage: ");
				double annualInterestRate = input.nextDouble() / 12;

				System.out.print("Enter number of years: ");
				double years = input.nextDouble();
				// calculate future investment value
				double futureInvestmentValue = investmentAmount
						* Math.pow((1 + (annualInterestRate / 100)),
								(years * 12));

				System.out.print("Accumulated value is "
						+ futureInvestmentValue + " $ ");

			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer: ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		// Scanner closed
		input.close();

	}

}
