/*
 * (The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
 A no-arg constructor that creates a default triangle.
 A constructor that creates a triangle with the specified side1, side2, and
side3.
 The accessor methods for all three data fields.
 A method named getArea() that returns the area of this triangle.
 A method named getPerimeter() that returns the perimeter of this triangle.
 A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
package zadaci_26_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of triangle: ");
		 double[] sides = new double[3];
	        for (int i = 0; i < sides.length; i++) {
	        	sides[i] = input.nextDouble();
	        }
		System.out
				.println("Enter true if triangle is filled and false if it isn't");
		// taking filled value from user
		String isFilledString = input.next();
		boolean isFilled = (isFilledString.equals("true"));
		System.out.println("Enter the color of triangle: ");
		// taking color value from user
		String color = input.next();

		// constructor that creates triangle object and takes side values
		// from
		// user
		Triangle t1 = new Triangle(sides[0], sides[1], sides[2]);
		t1.setColor(color);
		t1.setFilled(isFilled);
		System.out.println("Triangle 1:");
		System.out.println("Area = " + t1.getArea());
		System.out.println("Perimeter = " + t1.getPerimeter());
		System.out.println("Color = " + t1.getColor());
		System.out.println("Is filled? " + t1.isFilled());

	}

}
