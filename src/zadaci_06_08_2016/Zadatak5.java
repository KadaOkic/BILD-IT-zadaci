/**
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlije�e v, 
 * mo�emo izra�unati minimalnu du�inu piste potrebne da avion uzleti koriste�i se sljede�om formulom:
 * du�ina = v * v / 2a. 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/(s*s) te ispisuje korisniku minimalnu du�inu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje du�ina piste je 514.286).
 */
package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter speed and acceleration : ");
				double speed = input.nextDouble();
				double acceleration = input.nextDouble();
				// calculate the minumum length of the runway with this formula
				double length = (speed * speed) / (2 * acceleration);
				System.out
						.print("The minimum runway length for this airplane is "
								+ length);

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
