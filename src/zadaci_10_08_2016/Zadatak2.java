/**
 *  Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 *  Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 *  Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. 
 */
package zadaci_10_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		int counter = 0;

		for (int i = 2; i < 10000; i++) {
			// if is prime increment counter
			if (isPrime(i) && isPrime(i + 2)) {
				counter++;
				System.out.printf(" (%d, %d) ", i, i + 2);
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}

}
