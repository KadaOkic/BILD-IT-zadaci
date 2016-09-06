/**
 * (Demonstrate the benefits of encapsulation) Rewrite the Rational class in
 * Listing 13.13 using a new internal representation for the numerator and denominator.
 * Create an array of two integers as follows:
 * private long[] r = new long[2];
 * Use r[0] to represent the numerator and r[1] to represent the denominator.
 * The signatures of the methods in the Rational class are not changed, so a client
 * application that uses the previous Rational class can continue to use this new
 * Rational class without being recompiled.
 */
package zadaci_05_09_2016;

public class BenefitEncapsulation {

	public static void main(String[] args) {

		// creating first rational number
		Rational r1 = new Rational(2, 5);
		// creating second rational number
		Rational r2 = new Rational(5, 4);
		// testing addition method
		System.out.println(r1.add(r2));
		// testing subtraction method
		System.out.println(r1.subtract(r2));
		// testing multiplication method
		System.out.println(r1.multiply(r2));
		// testing division method
		System.out.println(r1.divide(r2));

	}

}

class Rational extends Number implements Comparable<Rational> {
	// first element of array is numerator and second is denominator
	private long[] r = new long[2];

	// default constructor
	public Rational() {
		this(0, 1);
	}

	// constructor that creates object with new values
	public Rational(long numerator, long deonminator) {
		long gcd = gcd(numerator, deonminator);
		this.r[0] = ((deonminator > 0) ? 1 : -1) * numerator / gcd;
		this.r[1] = Math.abs(deonminator) / gcd;
	}

	/**
	 * method that finds greatest common divisor n- first number we pass to
	 * method d - second number we pass to method returns- largest common
	 * divisor
	 */
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		return gcd;
	}

	// getter method for numerator
	public long getNumerator() {
		return r[0];
	}

	// getter method for denominator
	public long getDenominator() {
		return r[1];
	}

	// method that adds two ration numbers
	public Rational add(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() + r[1]
				* secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// method for subtracting two ration numbers
	public Rational subtract(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() - r[1]
				* secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// method for multiplying two rational numbers
	public Rational multiply(Rational secondRational) {
		long n = r[0] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// method for dividing two rational numbers
	public Rational divide(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator();
		long d = r[1] * secondRational.getNumerator();
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		return r[1] == 1 ? r[0] + "" : r[0] + "/" + r[1];
	}

	// implementations of equals method
	@Override
	public boolean equals(Object other) {
		return (this.subtract((Rational) (other))).getNumerator() == 0;
	}

	// method that retruns value of numbers as double
	@Override
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}

	// method that returns value as float
	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	// method that returns value as integer
	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	// method that returns value as long
	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	// implemented compareTo method
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;

	}

}
