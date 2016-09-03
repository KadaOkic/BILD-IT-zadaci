/**
 * (The ComparableCircle class) Define a class named ComparableCircle
 * that extends Circle and implements Comparable. Draw the UML diagram and
 * implement the compareTo method to compare the circles on the basis of area.
 * Write a test class to find the larger of two instances of ComparableCircle objects.
 */
package zadaci_02_09_2016;

public class ComparableCircleTest {

	public static void main(String[] args) {

		// first ComparableCircle object
		ComparableCircle c1 = new ComparableCircle(2);
		// second ComparableCircle object
		ComparableCircle c2 = new ComparableCircle(5);
		// if result of method is bigger than 0 first object is bigger
		if (c1.compareTo(c2) > 0)
			System.out.println("First circle is bigger");
		// if result of method is less than 0 second object is bigger
		else if (c1.compareTo(c2) < 0)
			System.out.println("Second circle is bigger");
		// if result is 0 objects are equal
		else
			System.out.println("Circles are equal");

	}

}

/** Class circle that contains radius data field and methods related to circle */
class Circlee {
	private double radius;

	// default constructor
	public Circlee() {
	}

	// constructor that creates object with set radius
	public Circlee(double radius) {
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

	/**
	 * method that calculates area of the circle
	 * 
	 * @return - area of the circle as double
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * method that calculates perimeter of the circle
	 * 
	 * @return - perimeter value as a double
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Circle with radius of: " + this.radius;

	}
}

/**
 * ComparableCircle that extends class Circlee and impplements comparable
 * interface
 */
class ComparableCircle extends Circlee implements Comparable<ComparableCircle> {
	// default constructor that sets radius to 1
	public ComparableCircle() {
		super(1);
	}

	// constructor that creates object with set radius
	public ComparableCircle(double radius) {
		super(radius);
	}

	// overriden compareTO method

	public int compareTo(ComparableCircle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
}
