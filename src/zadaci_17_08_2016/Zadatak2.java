/**
 * Napisati program koji prima karakter te vra�a njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vra�a 69 kao unicode za taj karakter.
 */
package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter one character: ");
		// takes just one character as an input
		char character = input.next().charAt(0);
		input.close();

		System.out.println("The Unicode for the character " + character
				+ " is " + (int) character);

	}

}
