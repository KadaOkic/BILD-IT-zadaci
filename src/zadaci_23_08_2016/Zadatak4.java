/**
 * (Displaying the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order.
 *  For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 *  Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 *  retrieve and display them in reverse order.
 */
package zadaci_23_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		int user = takeInput("Enter integer you want prime factors of:");
		int temp = user;
		// creating object of StackOfIntegers class
		StackOfIntegers stack = new StackOfIntegers();
		int i = 2;
		// loop we use to find lowest factors of a number
		while (temp != 1) {
			if (temp % i == 0) {
				// every time we find new factor we push(add) it to the stack
				stack.push(i);
				temp = temp / i;
			} else {
				i++;
			}
		}
		// printing out the elements of the stack, by using "pop" method that
		// returns last element of the stack
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	// cheking input from the user
	private static int takeInput(String message) {

		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int user = 0;
		while (!isGood) {
			try {
				user = input.nextInt();
				if (user > 1) {
					isGood = true;
				} else {
					System.out
							.println("Enter numbers greater then 1 : ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter a pozitive integer value) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}
		return user;
	}

}