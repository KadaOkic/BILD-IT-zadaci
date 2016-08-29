/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * Creates an array with 100 randomly chosen integers.
 * Prompts the user to enter the index of the array, then displays the corresponding
 * element value. If the specified index is out of bounds, display the message Out of Bounds.
 */
package zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// integer array with 100 capacity
		int[] nums = new int[100];
		// filling out the array with random numbers 0-99
		for (int i = 0; i < 100; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		// asking input from user
		System.out.println("Enter the value of index you want:");
		// if user enters valid index we print out value at that index
		try {
			System.out.println("Value at given index is: "
					+ nums[input.nextInt()]);
			// else we print out message that index is out of bounds
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds.");
		} catch (Exception ex) {
			System.out.println("INVALID INPUT");
		}
		input.close();

	}

}
