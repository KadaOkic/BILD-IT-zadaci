package zadaci_22_08_2016;

public class LinearEquation {
	// Private data fields a, b, c, d, e, and f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// A constructor with the arguments for a, b, c, d, e, and f.
	LinearEquation(double myA, double myB, double myC, double myD, double myE,
			double myF) {
		a = myA;
		b = myB;
		c = myC;
		d = myD;
		e = myE;
		f = myF;
	}

	// method isSolvable() returns true if ad - bc is not 0.
	// If there is no solution the lines are parallel
	boolean isSolvable() {
		if (a * d - b * c != 0)
			return true;
		else
			return false;
	}

	// Methods getX() return the solution x
	double getX() {
		double x = ((e * d - b * f) / (a * d - b * c));
		return x;
	}

	// Methods getY() return the solution y
	double getY() {
		double y = ((a * f - e * c) / (a * d - b * c));
		return y;
	}

	// Six getter methods for a, b, c, d, e, and f.
	double getA() {
		return a;
	}

	void setA(double newA) {
		a = newA;
	}

	double getB() {
		return b;
	}

	void setB(double newB) {
		b = newB;
	}

	double getC() {
		return c;
	}

	void setC(double newC) {
		c = newC;
	}

	double getD() {
		return d;
	}

	void setD(double newD) {
		d = newD;
	}

	double getE() {
		return e;
	}

	void setE(double newE) {
		e = newE;
	}

	double getF() {
		return f;
	}

	void setF(double newF) {
		f = newF;
	}

	// method getIntersectiongPoint with double values returns updateed and
	// calculated new LinearEquation properties
	public static LinearEquation getIntersectingPoint(double x1, double y1,
			double x2, double y2, double x3, double y3, double x4, double y4) {
		double a = (y1 - y2);
		double b = (-x1 + x2);
		double c = (y3 - y4);
		double d = (-x3 + x4);
		double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
		double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

		return new LinearEquation(a, b, c, d, e, f);

	}
	//method getIntersectiongPoint double 2D array points and returns intersection points coordinate
	public static LinearEquation getIntersectingPoint(double[][] points) {
		return getIntersectingPoint(points[0][0], points[0][1], points[1][0],
				points[1][1], points[2][0], points[2][1], points[3][0],
				points[3][1]);
	}
}