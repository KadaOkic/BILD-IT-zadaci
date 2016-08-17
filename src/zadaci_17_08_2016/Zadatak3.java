/**
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj. 
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
 */
package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		int number = takeInput("Enter a short number: ");

		System.out.print("The 16 bits are ");

		System.out.println(String.format("%016d", Integer.parseInt(Integer.toBinaryString(number))));

	}

	// taking input from the user and checking it
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		short userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextShort();
				if (userInput >= 0) {
					isGood = true;
				} else {
					System.out
							.println("Enter numbers greater then 0 : ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter a short number) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}
