package zadaci_22_08_2016;

public class QuadraticEquation {
	// Private data fields a, b, and c that represent three coefficients
	private double coeffA;
	private double coeffB;
	private double coeffC;
	double discriminant;

	// constructor for the arguments for coefficientA, coefficientB, and
	// coefficientC.

	public QuadraticEquation(double coefficientA, double coefficientB,
			double coefficientC) {
		coeffA = coefficientA;
		coeffB = coefficientB;
		coeffC = coefficientC;
		getDiscriminant();
	}

	// A method named getDiscriminant() that returns the discriminant
	public double getDiscriminant() {
		return discriminant = (Math.pow(coeffB, 2) - 4 * coeffA * coeffC);
	}

	// metod calculate root1
	public double getRoot1() {
		return (-coeffB + Math.sqrt(discriminant)) / (2 * coeffA);

	}

	// metod calculate root2
	public double getRoot2() {

		return (-coeffB - Math.sqrt(discriminant)) / (2 * coeffA);

	}
}