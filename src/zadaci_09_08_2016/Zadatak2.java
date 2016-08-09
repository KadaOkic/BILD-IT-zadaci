/**
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke. 
 * Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom formulom:
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
 * Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije taèke na površini zemlje te mu ispisuje great circle distance.
 * Prosjeèni radius zemlje je 6.371.01 km. 
 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
 * Širina i dužina u ovoj formuli se odnose na zapad i sjever.
 * Koristimo negativne vrijednosti da oznaèimo istok i jug. 
 */
package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// Getting (x1 y1) (x2 y2) from user
				System.out.print("Enter point 1 (x1 y1) in degrees: ");
				double x1 = Math.toRadians(input.nextDouble());
				double y1 = Math.toRadians(input.nextDouble());

				System.out.print("Enter point 2 (x2 y2) in degrees: ");
				double x2 = Math.toRadians(input.nextDouble());
				double y2 = Math.toRadians(input.nextDouble());

				// Solving formula for the distance between the two points on
				// the surface sphere
				// Formula: d = radius * arccos(sin(x1) * sin(x2) + cos(x1) *
				// cos(x2) * cos(y1 - y2))

				double radius = 6371.01;

				double distance = radius
						* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
								* Math.cos(x2) * Math.cos(y1 - y2));

				System.out
						.printf("The distance between the two points (great circle) is "
								+ distance + " km");
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Try again : ");
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
