/**
 * (Enable GeometricObject comparable) Modify the GeometricObject class
 * to implement the Comparable interface, and define a static max method in the
 * GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class. Write
 * a test program that uses the max method to find the larger of two circles and the
 * larger of two rectangles.
 */
package zadaci_02_09_2016;

public abstract class GeometricObject implements Comparable<GeometricObject> {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// default constructor
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// constructor that creates object with new values
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// get method for color
	public String getColor() {
		return color;
	}

	// set method for color
	public void setColor(String color) {
		this.color = color;
	}

	// get method for isFilled
	public boolean isFilled() {
		return filled;
	}

	// set method for isFilled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// get method for dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "Created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}

	public abstract double getArea();

	// implemented method compareTo that compares two objects
	public int compareTo(GeometricObject go) {
		if (this.getArea() > go.getArea())
			return 1;
		else if (this.getArea() < go.getArea())
			return -1;
		else
			return 0;
	}

	// method that compares two objects by area and returns bigger one
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) == 1)
			return o1;
		else
			return o2;
	}

}
