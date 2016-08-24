package zadaci_23_08_2016;

public class MyPoint {
	double x;
	double y;

	// default constructor that sets values of x and y to 0
	public MyPoint() {
		x = 0;
		y = 0;
	}

	// x sets value for the x coordinate
	// y sets value for the y coordinate

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// get method for x data field
	public double getX() {
		return x;
	}

	// set method for x data field
	public void setX(double x) {
		this.x = x;
	}

	// get method for y data field
	public double getY() {
		return y;
	}

	// set method for y data field
	public void setY(double y) {
		this.y = y;
	}

	// object of My point class that we pass to the method,method returns
	// distance between two objects of MyPoint class as double value

	public double distance(MyPoint a) {
		return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y)
				* (this.y - a.y));
	}
}
