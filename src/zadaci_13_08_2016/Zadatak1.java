/**
 * (Izraèunavanje napojnice)Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti
 *  kao i procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu.
 *  Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu 
 *  program treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5. 
 */
package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// taking input from the user
		double bill = takeInput("Enter an amount of the bill :");
		double tip = takeInput("Enter amount of the tip in percentege : ");
		// calculating the amount of the tip
		double tipAmount = (bill * tip) / 100;
		// total amount of the bill
		double totalBill = bill + tipAmount;
		System.out.println("The total bill to pay is " + totalBill
				+ " \nand a tip is: " + tipAmount);
	}

	// taking input from the user and controling with try i catch
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				isGood = true;
				userInput = input.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer: )");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}
