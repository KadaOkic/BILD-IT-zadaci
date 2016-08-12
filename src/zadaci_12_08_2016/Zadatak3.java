/**
 * Napisati metodu sa sljedeæim headerom: public static boolean isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napisati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */
package zadaci_12_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		int numberOfPrime = 0;
		for (int i = 0; i < 100000; i++) {
			// if is prime print it and increment by one number of primes
			if (isPrime(i) != 0) {
				System.out.print(i + " ");
				numberOfPrime++;
				if (numberOfPrime % 10 == 0) {
					System.out.println();
				}
			}

		}

		System.out.println("The number of primes is " + numberOfPrime);

	}

	// Check whether number is prime
	public static int isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If this is true number is not prime
				return number = 0; // number is not a prime
			}
		}

		return number; // number is prime
	}
}
