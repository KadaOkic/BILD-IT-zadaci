/**
 * (Math: The Complex class) A complex number is a number in the form a + bi,
 * where a and b are real numbers and i is 2-1. The numbers a and b are known
 * as the real part and imaginary part of the complex number, respectively. You can
 * perform addition, subtraction, multiplication, and division for complex numbers
 * using the following formulas:
 * a + bi + c + di = (a + c) + (b + d)i
 * a + bi - (c + di) = (a - c) + (b - d)i
 * (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
 * (a + bi)/(c + di) = (ac + bd)/(c2 + d2) + (bc - ad)i/(c2 + d2)
 * You can also obtain the absolute value for a complex number using the followingformula:
 * |a + bi|  = 2a2 + b2
 * (A complex number can be interpreted as a point on a plane by identifying the (a,b)
 * values as the coordinates of the point. The absolute value of the complex number
 * corresponds to the distance of the point to the origin, as shown in Figure 13.10b.)
 * Design a class named Complex for representing complex numbers and the
 * methods add, subtract, multiply, divide, and abs for performing complexnumber
 * operations, and override toString method for returning a string representation
 * for a complex number. The toString method returns (a + bi) as a
 * string. If b is 0, it simply returns a. Your Complex class should also implement the
 * Cloneable interface.
 * Provide three constructors Complex(a, b), Complex(a), and Complex().
 * Complex() creates a Complex object for number 0 and Complex(a) creates
 * a Complex object with 0 for b. Also provide the getRealPart() and
 * getImaginaryPart() methods for returning the real and imaginary part of the
 * complex number, respectively.
 * Write a test program that prompts the user to enter two complex numbers and
 * displays the result of their addition, subtraction, multiplication, division, and absolute value.
 */
package zadaci_05_09_2016;

import java.util.Scanner;

public class ComplexNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first complex number:");
		// creating first complex object(number)
		Complex c1 = new Complex(input.nextDouble(), input.nextDouble());
		System.out.println("Enter second complex number:");
		// creating second complex object(number)
		Complex c2 = new Complex(input.nextDouble(), input.nextDouble());
		input.close();
		// test of the add method
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		// test of subtract method
		System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
		// test of multiply method
		System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
		// test of divide method
		System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));

	}

}

class Complex implements Cloneable {

	private double a;
	private double b;

	// default constructor
	Complex() {
		this(0, 0);
	}

	// constructor that creates new object with only real part
	Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	// constructor that creates new instance with both real and imaginary part
	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// method that adds two Complex objects
	public Complex add(Complex c1) {
		return new Complex(this.a + c1.a, this.b + c1.b);
	}

	// method that subtracts two objects
	public Complex subtract(Complex c1) {
		return new Complex(this.a - c1.a, this.b - c1.b);
	}

	// method that multiplys two objects
	public Complex multiply(Complex c1) {
		return new Complex(this.a * c1.a - this.b * c1.b, this.b * c1.a
				+ this.a * c1.b);
	}

	// method that divides two objects
	public Complex divide(Complex c1) {
		double divisor = c1.a * c1.a + c1.b * c1.b;
		return new Complex((this.a * c1.a + this.b * c1.b) / divisor, (this.b
				* c1.a - this.a * c1.b)
				/ divisor);
	}

	// method that returns absolute value of object
	public double abs() {
		return Math.sqrt(this.a * this.a + this.b * this.b);
	}

	// get method for the "real" part of object
	public double getRealPart() {
		return this.a;
	}

	// get method for the imaginary part of the object
	public double getImaginaryPart() {
		return this.b;
	}

	// method that allows us rinting of the complex number
	@Override
	public String toString() {
		if (b == 0) {
			return a + "";
		} else {
			return "(" + a + " + " + b + "i)";
		}
	}

	// clone method that returns new instance with same value
	@Override
	public Complex clone() {
		return new Complex(this.a, this.b);

	}

}
