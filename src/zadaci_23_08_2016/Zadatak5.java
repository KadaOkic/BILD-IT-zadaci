/**
 * (Displaying the prime numbers) Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 * reverse order
 */
package zadaci_23_08_2016;

public class Zadatak5 {

	public static void main(String[] args) {

		// object of StackOfIntegers class where we will store prime numbers
		StackOfIntegers stack = new StackOfIntegers();
		// loop that will send numbers up to 120 to the method to check if
		// they're prime numbers
		for (int i = 0; i <= 120; i++) {
			// if numbers passes the check and it's not 0 or 1 we push(add) it
			// to stack
			if (isPrime(i) && (i != 1 && i != 0))
				stack.push(i);

		}
		System.out.println("Prime numbers up to 120 in decreasing order are: ");
		// printing out elements of the stack "last in first out"
		while (!stack.empty())
			System.out.print(stack.pop() + " ");

	}

	// n number we pass to method, the one we need to check if it's prime true
	// if number is prime and false if it's not
	public static boolean isPrime(int n) {

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

}
