/**
 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te ispisuje koliko se puta taj broj ponavlja. 
 * Pretpostavimo da se unos brojeva završava sa nulom.
 */
package zadaci_01_08_2016;

public class Zadatak5 {
	/** Main method */
	public static void main(String[] args) {
		// import and create Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Ask user to input random numbers
		System.out
				.print("Enter random numbers and when you enter zero ends input and it counts how many times is repeating the biggest integer:");
		// Declaration and initialization
		int i;
		// the smallest integer that Java supports
		int max = Integer.MIN_VALUE;

		int counter = 0;// // Declaration and initialization of counter
		// enter number until you enter 0, and with if we compare numbers that
		// user entered
		while ((i = input.nextInt()) != 0) {

			if (i > max) {
				max = i;
				counter = 1;
			} else if (i == max) {
				counter++;
			}
		}
		// Prints the biggest number and how many times is repeating
		System.out.println("The biggest number is: " + max);
		System.out.println(" Number of repeating the bigggest number is : "
				+ counter);

		input.close();

	}

}
