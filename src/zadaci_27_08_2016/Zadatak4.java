/**
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays
 * the distinct integers separated by exactly one space.
 */
package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter 10 integers:");
				// creating array list where we will store numbers
				ArrayList<Integer> list = new ArrayList<>();
				// taking numbers from user
				for (int i = 0; i < 10; i++) {
					list.add(input.nextInt());
				}
				// invoking method
				removeDuplicate(list);

			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter integers: ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
			input.close();
		}

	}

	/*
	 * method that removes duplicate numbers(leaves only 1 occurance of each
	 * number) - array list we pass to the method
	 */
	public static void removeDuplicate(ArrayList<Integer> list) {
		// creating new array list where we will store numbers
		ArrayList<Integer> unique = new ArrayList<Integer>();
		// loop will check every element of the list
		for (int i = 0; i < list.size(); i++) {
			// if unique list doesn't contain the element loop is at it adds it
			// to the unique list
			if (!unique.contains(list.get(i))) {
				unique.add(list.get(i));
			}
		}
		// printing out old and new lists
		System.out.println("Numbers you entered are: " + list
				+ "\nUnique numbers are: " + unique);

	}

}
