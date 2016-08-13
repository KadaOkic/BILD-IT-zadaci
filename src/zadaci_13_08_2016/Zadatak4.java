/**
 * Palindrome prime je prosti broj koji je takoðer i palindrom. 
 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
 */
package zadaci_13_08_2016;

public class Zadatak4 {

	public static void main(String[] args) {

		int i = 2;
		int counter = 0;
		// it runs until we find 100 polindrom numbers
		while (counter < 100) {
			if (isPrime(i) && reverseEqual(i)) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
			// incrementing the number that is checked
			i++;
		}

	}

	// Check whether number is prime
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If this is true number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}

	// method to reverse the number and it is equal
	public static boolean reverseEqual(int num) {
		// converte integer to a string
		String number = Integer.toString(num);
		String reverseNumber = "";
		// reversing the string
		for (int i = number.length() - 1; i >= 0; i--) {
			reverseNumber += number.charAt(i);

		}
		// return true if number and reverseNumber are equal
		return number.equals(reverseNumber);
	}
}
