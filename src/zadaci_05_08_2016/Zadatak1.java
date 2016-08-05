/**
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252.
 *  Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna. 
 */
package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// Enter saving amount
				System.out.print("Enter monthly saving:");
				double saving = input.nextDouble();

				System.out.print("Enter annual interest rate:");
				double interest = input.nextDouble();
				interest /= 12 * 100; // convert interest rate from annual to
										// monthly

				System.out.print("Enter number of months:");
				int noOfMonths = input.nextInt();
				double TotalSaving = 0;
				// calculate the total saving for month that user enters
				for (int i = 1; i <= noOfMonths; i++) {
					TotalSaving = (TotalSaving + saving) * (1 + interest);
				}

				System.out.println("Total saving is " + TotalSaving);

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
