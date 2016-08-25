/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2p - 1 for some positive integer p. Write a program that finds
 * all Mersenne primes with p … 100 and displays the output as shown below.
 * (Hint: You have to use BigInteger to store the number, because it is too big to
 * be stored in long. Your program may take several hours to run.)
 * p  2^p – 1
 * 2  3
 * 3  7
 * 5  31
 */
package zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak4 {

	public static void main(String[] args) {

		// BigInteger object with value of 2
		BigInteger two = new BigInteger("2");
		// printing out the "header"
		System.out.println("p\tp^2-1\n");
		// loop that will check first 100 "p" numbers
		for (int i = 0; i <= 100; i++) {
			// BigInteger object with value of 2^i
			BigInteger number = two.pow(i);
			// to get marsenne number we subtract 1
			BigInteger marsennePrime = number.subtract(BigInteger.ONE);
			// if marsenne number is prime we print it out
			if (marsennePrime.isProbablePrime(1)) {
				System.out.println(i + "\t" + marsennePrime);
			}
		}
	}

}