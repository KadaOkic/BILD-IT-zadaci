/**
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 */
package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter 5 numbers: ");
				// creating array list with double data type
				ArrayList<Double> list = new ArrayList<>();
				// taking numbers from user and adding them to array list
				for (int i = 0; i < 5; i++) {
					list.add(input.nextDouble());
				}
				// printing the list and the result of sum method
				System.out.println("Numbers you entered are: " + list
						+ "\nSum is: " + sum(list));
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter double vaules or integers: ");
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

	/*
	 * method that calculates sum of all elements in arrayList list - array
	 * list passed to method value of the sum
	 */
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;

	}

}
