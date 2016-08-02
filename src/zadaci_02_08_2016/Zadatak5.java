/**
 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta. 
  Nakon što se simulacija završi, program ispisuje koliko puta je novèiæ pokazao glavu a koliko puta pismo.
 */
package zadaci_02_08_2016;

import java.util.InputMismatchException;

public class Zadatak5 {

	public static void main(String[] args) {
		// importing and creating Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		// while loop is checking throw the try and catch if the input is good
		// continue and if not re-entry the input
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// ask the user to enter the number of simulation throwing the
				// coin
				System.out.println(" Enter the number of simualation : ");
				// assign a variable amount which the user enters
				int n = input.nextInt();
				numberOfSimulation(n);
			} catch (InputMismatchException | ArithmeticException ex) {
				System.out.println("Try again. ("
						+ "Invalid input:  Enter an integer: ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		input.close();
	}

	// method that we assign the number od simulation
	public static void numberOfSimulation(int num) {
		int head = 0;
		int tail = 0;
		// for loop for random 0 or 1(head or tail)
		for (int i = 0; i < num; i++) {
			// nasumicno generisanje 0 ili 1 za simulaciju bacanje novcica
			int random = (int) (Math.random() * 2);

			if (random == 0) {
				head++; // increase head variable by 1
			} else {
				tail++; // increase tail variable by 1
			}
		}

		// Print the result of the simulation
		System.out.println("The coin thrown " + num + " has fell " + head
				+ " times on the head and " + tail + " on the tail.");
	}
}
