/**
 * (The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * area = (2 + 4/22)* side * side
 * Draw the UML diagram that involves Octagon, GeometricObject,
 * Comparable, and Cloneable. Write a test program that creates an Octagon
 * object with side value 5 and displays its area and perimeter. Create a new object
 * using the clone method and compare the two objects using the compareTo
 * method.
 */
package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

public class OctagonComparableClonable {

	public static void main(String[] args) {

		// first octagon object
		Octagon o1 = new Octagon(5);
		// area of octagon
		System.out.println(o1.getArea());
		// perimeter of octagon
		System.out.println(o1.getPerimeter());
		// second octagon object
		Octagon o2 = new Octagon();
		// we assign value to second object of the first one(cloned)
		o2 = o1.clone();
		// printing out result of compare method
		if (o1.compareTo(o2) > 0)
			System.out.println("First octagon is bigger");
		else if (o1.compareTo(o2) < 0)
			System.out.println("Second octagon is bigger");
		else
			System.out.println("Octagons are equal");

	}

}

class Octagon extends GeometricObject implements Cloneable,
		Comparable<GeometricObject> {
	// only 1 side data field since we assume they're equal
	private double side;

	// default constructor
	public Octagon() {

	}

	// constructor that creates Octagon object with new side value
	public Octagon(double side) {
		this.side = side;

	}

	@Override
	// method that calculates area of the octagon
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * side * side);
	}

	// method that calculates perimeter of octagon
	public double getPerimeter() {
		return 8 * side;
	}

	// overriden clone method that returns new octagon object which is clone of
	// original one
	public Octagon clone() {
		Octagon clone = new Octagon(this.side);
		return clone;
	}

	// compare method that uses area to compare which object is bigger
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;

	}

}
