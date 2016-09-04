/**
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
 * GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Circle objects are equal if their radii
 * are the same. Draw the UML diagram that involves Circle, GeometricObject,
 * and Comparable.
 */
package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

public class CircleComparable {

	public static void main(String[] args) {

		// first circle object with radius 5
		Circle c1 = new Circle(5);
		// second circle object with radius 5
		Circle c2 = new Circle(5);
		// result of equals method
		System.out.println("Are circles equal? " + c1.equals(c2));

	}

}

class Circle extends GeometricObject implements Comparable<GeometricObject> {
	private double radius;

	// default constructor
	public Circle() {
	}

	// constructor that creates object with new radius
	public Circle(double radius) {
		this.radius = radius;
	}

	// get method for radius
	public double getRadius() {
		return radius;
	}

	// set method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// method that calcualtes area of the circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// method that calculates diameter
	public double getDiameter() {
		return 2 * radius;
	}

	// method that calculates perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Circle with radius of: " + this.radius;

	}

	// compareTo method that uses radius data field to compare two objects
	public int compareTo(Circle c1) {
		if (this.radius > c1.radius)
			return 1;
		else if (this.radius < c1.radius)
			return -1;
		else
			return 0;
	}

	// overriden method equals that compares radius of two objects
	public boolean equals(Object c1) {
		if (this.getRadius() == ((Circle) c1).getRadius())
			return true;
		else
			return false;

	}

}
