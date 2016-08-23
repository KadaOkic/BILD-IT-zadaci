package zadaci_22_08_2016;

public class RegularPolygon {

	private int n; // number of sides of the polygon
	private double side; // store the length of the side
	private double x; // x coordinate
	private double y; // y coordinate

	// no-arg constructor that creates a regular polygon with default values
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;

	}

	// constructor that creates a regular polygon with the specified number of
	// sides
	// and length of side, centered at (0, 0).
	public RegularPolygon(int n, int side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}

	// A constructor that creates a regular polygon with the specified number of
	// sides,
	// length of side, and x- and y-coordinates.
	public RegularPolygon(int n, int side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;

	}

	// The accessor and mutator methods for all data fields.
	public void setN(int then) {
		n = then;
	}

	public int getN() {
		return n;
	}

	public void setSide(double theside) {
		side = theside;
	}

	public double getSide() {
		return side;
	}

	public void setX(int thex) {
		x = thex;
	}

	public double getX() {
		return x;
	}

	public void setY(int they) {
		y = they;
	}

	public double getY() {
		return y;
	}

	// The method getPerimeter() that returns calculate perimeter of the polygon
	public double getPerimeter() {
		return n * side;
	}

	// The method getArea() that returns the area of the polygon.calculate area
	public double getArea() {
		double s2 = side * side;
		double pin = Math.PI / n;
		double tangent = Math.tan(pin);
		return (n * s2) / (4 * tangent);

	}

}
