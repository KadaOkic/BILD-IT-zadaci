/**
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override
 * the equals method in the Object class. Two Rectangle objects are equal
 * if their areas are the same. Draw the UML diagram that involves Rectangle,
 * GeometricObject, and Comparable.
 */
package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

public class RectangleComparable {

	public static void main(String[] args) {

		// first rectangle object
		Rectangle rec1 = new Rectangle(2, 8);
		// second rectangle object
		Rectangle rec2 = new Rectangle(4, 4);
		// result of comparition
		System.out.println(rec1.equals(rec2));
	}

}

class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
	private double width;
	private double height;

	// default constructor
	public Rectangle() {
	}

	// constructor that creates object with new values
	public Rectangle(double Width, double Height) {
		this.width = Width;
		this.height = Height;
	}

	// constructor that sets datafields from superclass
	public Rectangle(double Width, double Height, String Color, boolean Filled) {
		this.width = Width;
		this.height = Height;
		setColor(Color);
		setFilled(Filled);
	}

	// get method for width
	public double getWidth() {
		return width;
	}

	// get method for height
	public double getHeight() {
		return height;
	}

	// set method for height
	public void setHeight(double Height) {
		this.height = Height;
	}

	// method that returns area of the rectangle
	public double getArea() {
		return width * height;
	}

	// method that returns perimeter of rectangle
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return "Bigger object is recatangle with height " + this.height
				+ " and width " + this.width;
	}

	// method that compares areas of two objects and returns true if they're
	// equal and false if they're not
	public boolean equals(Object rec) {
		if (this.getArea() == ((GeometricObject) rec).getArea())
			return true;
		else
			return false;

	}

}
