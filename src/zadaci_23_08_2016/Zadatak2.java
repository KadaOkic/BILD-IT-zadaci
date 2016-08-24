/**
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 An int data field named value that stores the int value represented by this
object.
A constructor that creates a MyInteger object for the specified int value.
A getter method that returns the int value.
The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
A static method parseInt(String) that converts a string into an int
value.
Draw the UML diagram for the class and then implement the class. Write a client
program that tests all methods in the class.
 */
package zadaci_23_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {

		// instance of MyInteger class
		MyInteger m1 = new MyInteger(4);
		// method that tests if object of MyInteger class is even
		System.out.println("Object is even: " + m1.isEven());
		// static method that tests if the number is even
		System.out.println("Number is even: " + MyInteger.isEven(4));
		// method that tests if the object of MyInteger class is odd
		System.out.println("Object is odd: " + m1.isOdd());
		// static method that tests if the number is odd
		System.out.println("Number is odd: " + MyInteger.isOdd(4));
		// method that tests if the object of MyInteger class is prime
		System.out.println("Object is prime number: " + m1.isPrime());
		// static method that tests if the number is prime
		System.out.println("Number is prime: " + MyInteger.isPrime(7));
		// method that tests if object of MyInteger class is equal to passed
		// value
		System.out.println("Object is equal to number: " + m1.equals(3));
		// method that compares m1 object with new object of the MyInteger class
		System.out.println("Object is equal to object: "
				+ m1.equals(new MyInteger(4)));
		char[] ch = { '2', '3', '4' };
		// method that converts char array into an integer
		System.out.println(MyInteger.parseInt(ch));
		// method that converts string into an integer
		System.out.println(MyInteger.parseInt("1234"));

	}

}
