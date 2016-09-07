/**
 * (Find the largest number in an array) Write a recursive method that returns the
 * largest integer in an array. Write a test program that prompts the user to enter a
 * list of eight integers and displays the largest element.
 */
package zadaci_07_09_2016;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 8 integers:");
		int[] nums = new int[8];
		// taking input from user
		for (int i = 0; i < 8; i++) {
			nums[i] = input.nextInt();
		}
		input.close();
		// invoking method
		System.out.println(findMax(nums, nums.length - 1));

	}

	// method that uses recursion to find and return largest number in array

	public static int findMax(int[] a, int index) {
		if (index > 0) {
			return Math.max(a[index], findMax(a, index - 1));
		}

		else {
			return a[0];
		}

	}

}
