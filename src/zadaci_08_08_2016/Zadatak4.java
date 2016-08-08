/**
 * Pozitivni cijeli broj je savr�en broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, isklju�uju�i sebe. 
 * Na primjer, 6 je prvi savr�eni broj jer 6 = 3 + 2 + 1. Sljede�i savr�eni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 * Samo 4 savr�ena broja postoje u rasponu od 0 do 10.000.
 * Napi�ite program koji ispisuje sva 4.
 */
package zadaci_08_08_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		// Loop through every number from 1 to 10000
		int sumOfDivisor = 0;
		int numberOfPerfect = 0;

		for (int i = 1; i <= 10000; i++) {
			// Loop through every number from 2 to n-1 , check if it is a
			// divisor of n and calculate the sum
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sumOfDivisor += j;
				}
			}
			// if the sum of divisor is equal to number i print the perfect
			// number and increase the number of perfect numbers
			if (sumOfDivisor == i) {
				System.out.println(i + " is a perfect number");
				numberOfPerfect++;
			}
			// reseting sum for the next loop
			sumOfDivisor = 0;
		}
		System.out.println("Total number of perfect numbers is "
				+ numberOfPerfect);

	}

}
