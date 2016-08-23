/**
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
cx + dy = f
x =ed - bf/ad - bc
y = af - ec/ad - bc
The class contains:
Private data fields a, b, c, d, e, and f.
 A constructor with the arguments for a, b, c, d, e, and f.
Six getter methods for a, b, c, d, e, and f.
A method named isSolvable() that returns true if ad - bc is not 0.
Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.”
 */
package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// prompt the user to enter a, b, c, d, e, and f with takeInput method
		double a = takeInput("Enter an integer for varibale a:");
		double b = takeInput("Enter an integer for varibale b:");
		double c = takeInput("Enter an integer for varibale c:");
		double d = takeInput("Enter an integer for varibale d:");
		double e = takeInput("Enter an integer for varibale e:");
		double f = takeInput("Enter an integer for varibale f:");
		// creating new object equation and its properties a b c d e f
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);

		if (linear.isSolvable()) {
			System.out.println("x is " + linear.getX() + " and y is "
					+ linear.getY());
			// If ad - bc is 0, “The equation has no solution.”
		} else {
			System.out.println("The equation has no solution.");
		}
	}

	// checking input user enters
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				if (userInput >= 1) {
					isGood = true;
				} else {
					System.out.println(message);
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;

	}

}
