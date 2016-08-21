/**
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices in a 
 * two-dimensional array with row and column as int types and maxValue as a double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array
 */
package zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter number of rows and columns");
				double[][] nums = new double[input.nextInt()][input.nextInt()];
				System.out.println("Enter values for 2D array");
				for (int i = 0; i < nums.length; i++) { // adding values to the
														// 2D array
					for (int j = 0; j < nums[i].length; j++) {
						nums[i][j] = input.nextDouble();
					}
				}
				Location loc1 = locateLargest(nums); // creating object of
														// location class
				System.out.println("The largest elements is: " + loc1.maxValue
						+ "\nLocation is (" + loc1.row + "," + loc1.column
						+ ")");

			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer number: ");
				isGood = true;
				input.nextLine();
			}

			input.close();
		}
	}

	public static Location locateLargest(double[][] a) {
		// method that goes through the array, finds largest elements and it's
		// "coordinates" and than assign those values to location object
		Location location = new Location();

		int largestR = 0;
		int largestC = 0;
		double temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (temp < a[i][j]) {
					temp = a[i][j];
					largestR = i;
					largestC = j;
				}
			}
		}
		location.column = largestC;
		location.row = largestR;
		location.maxValue = temp;
		// returning as a result location object
		return location;
	}
}