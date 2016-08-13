/**
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja.
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu. 
 */
package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		double firstWeight = takeInput("Enter the weight of the first package :");
		double firstPrice = takeInput("Enter the price of the first package :");
		double secondWeight = takeInput("Enter the weight of the second package :");
		double secondPrice = takeInput("Enter the price of the second package :");
		// if price weight ratio of the first package is less then the second
		// price of the first package better
		if (firstPrice / firstWeight < secondPrice / secondWeight) {
			System.out.println("First package has better price.");

		} else if (firstPrice / firstWeight == secondPrice / secondWeight) {
			System.out.println("Price ratio is the same.");

		} else {
			System.out.println("Second package has better price.");
		}

	}

	// taking input from the user and controling with try i catch
	public static double takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		double userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextDouble();
				if (userInput > 0) {
					isGood = true;
				} else {
					System.out.println("Enter number greater then zero :");
				}
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
