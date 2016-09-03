package zadaci_02_09_2016;

public class Rectangle extends GeometricObject {

	private double width;
	private double height;
	//default constructor
	public Rectangle() {
	}
	//constructor that creates object with new values
	public Rectangle(double Width, double Height) {
		this.width = Width;
		this.height = Height;
	}
	//constructor that sets datafields from superclass
	public Rectangle(double Width, double Height, String Color, boolean Filled) {
		this.width = Width;
		this.height = Height;
		setColor(Color);
		setFilled(Filled);
	}
	//get method for width
	public double getWidth() {
		return width;
	}
	//get method for height
	public double getHeight() {
		return height;
	}
	//set method for height
	public void setHeight(double Height) {
		this.height = Height;
	}
	//method that returns area of the rectangle
	public double getArea() {
		return width * height;
	}
	//method that returns perimeter of rectangle
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return "Bigger object is recatangle with height " + this.height
				+ " and width " + this.width;
	}

}
