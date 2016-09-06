/**
 * (Use BigInteger for the Rational class) Redesign and implement the
 * Rational class in Listing 13.13 using BigInteger for the numerator and
 * denominator.
 */
package zadaci_05_09_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerRational {

	public static void main(String[] args) {

		// creating first RationalBig number
		RationalBig r1 = new RationalBig(new BigInteger("2"), new BigInteger(
				"5"));
		// creating second RationalBig number
		RationalBig r2 = new RationalBig(new BigInteger("3"), new BigInteger(
				"4"));
		// testing addition method
		System.out.println(r1.add(r2));
		// testing subtract method
		System.out.println(r1.subtract(r2));
		// testing multiplication method
		System.out.println(r1.multiply(r2));
		// testing division method
		System.out.println(r1.divide(r2));
	}

}

class RationalBig extends Number implements Comparable<RationalBig> {
	private BigInteger numerator;
	private BigInteger denominator;

	// default constructor
	public RationalBig() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	// constructor that creates object with new values
	public RationalBig(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = numerator.gcd(denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}

	// method that finds greatest common divisor for two numbers
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0
				&& k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
			if (n1.remainder(k).equals(BigInteger.ZERO)
					&& n2.remainder(k).equals(BigInteger.ZERO)) {
				gcd = k;
			}
		}
		return gcd;
	}

	// get method for numerator
	public BigInteger getNumerator() {
		return numerator;
	}

	// get method for denominator
	public BigInteger getDenominator() {
		return denominator;
	}

	// method for adding rational numbers
	public RationalBig add(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBig(n, d);
	}

	// method for subtracting rational numbers
	public RationalBig subtract(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBig(n, d);
	}

	// method for multiplying rational numbers
	public RationalBig multiply(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBig(n, d);
	}

	// method for dividing rational numbers
	public RationalBig divide(RationalBig secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new RationalBig(n, d);
	}

	@Override
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((RationalBig) other)).getNumerator().compareTo(
				BigInteger.ZERO) == 0)
			return true;
		else
			return false;
	}

	@Override
	// method that returns value as integer
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	// method that returns value as float
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// method that returns value as double
	public double doubleValue() {
		BigDecimal numer = new BigDecimal(numerator);
		BigDecimal denum = new BigDecimal(denominator);
		return numer.divide(denum).doubleValue();
	}

	@Override
	// method that returns value as long
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// implemented compareTo methods
	public int compareTo(RationalBig o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;

	}

}
