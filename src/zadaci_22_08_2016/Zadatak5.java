/**
 * (Geometry: intersecting point) Suppose two line segments intersect. 
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) 
 * and for the second line segment are (x3, y3) and (x4, y4). 
 * Write a program that prompts the user to enter these four endpoints 
 * and displays the intersecting point. 
 * As discussed in ProgrammingExercise 3.25, the intersecting point can be found
 *  by solving a linear equation.Use the LinearEquation class in Programming Exercise 9.11 
 *  to solve this equation.
 */
package zadaci_22_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		// Declare 2D array a fill it with the values user enters
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++)
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = input.nextDouble();
		// creating new object linear and its
		LinearEquation linear = LinearEquation.getIntersectingPoint(points);
		// if isSolvable get point where x i y are intersecting
		if (linear.isSolvable()) {
			System.out.println("The intersecting point is at (" + linear.getX()
					+ ", " + linear.getY() + ")");
			// If ad - bc is 0, no solution
		} else {
			System.out.println("The two lines are parallel");
		}

		input.close();
	}

}
