/**
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
Private data fields a, b, and c that represent three coefficients.
 A constructor for the arguments for a, b, and c.
Three getter methods for a, b, and c.
A method named getDiscriminant() that returns the discriminant, which is
(b*b) - 4ac.
The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1 =-b + 2b2 - 4ac/2a
and r2 =-b - 2b2 - 4ac/2a
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.”

 */
package zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		double a = 0;
		do {
			// if we enter 0 it will not be quadratic equation(one root would be
			// infinity and second NaN)
			a = takeInput("Enter coefficient a, that is not 0:");
		} while (a == 0);

		double b = takeInput("Enter coefficient b:");
		double c = takeInput("Enter coefficient c:");
		// creating new object equation and its properties
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		double discriminant = equation.getDiscriminant();
		// If the discriminant is positive, display the two roots
		if (discriminant > 0) {
			System.out.println("The roots are " + equation.getRoot1() + " and "
					+ equation.getRoot2());
			// if the discriminant is 0, display the one root
		} else if (discriminant == 0) {
			System.out.println("The root is " + equation.getRoot1());
			// Otherwise, display “The equation has no roots.”
		} else {
			System.out.println("The equation has no roots");

		}

	}

	// cheking input from the user
	private static double takeInput(String message) {

		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		double userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextDouble();
				isGood = true;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter a double value) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}
		return userInput;
	}

}
