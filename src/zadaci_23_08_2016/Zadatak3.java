/**
 * (The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
The data fields x and y that represent the coordinates with getter
methods. A no-arg constructor that creates a point (0, 0).
A constructor that constructs a point with specified coordinates.
A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.
 */
package zadaci_23_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		// object of MyPoint class created with default constructor
		MyPoint pointA = new MyPoint();
		// object of MyPoint class created with constructor that allows that
		// user sets values for x and y data field
		MyPoint pointB = new MyPoint(10, 30.5);
		// result of distance method that calculates distance between two
		// objects
		System.out.printf("Distance between two points is %.2f",
				pointA.distance(pointB));

	}

}
