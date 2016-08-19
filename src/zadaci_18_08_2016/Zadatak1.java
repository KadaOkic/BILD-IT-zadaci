/**
 * (Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
package zadaci_18_08_2016;

public class Zadatak1 {

	public static void main(String[] args) {

		int[] randomNumbers = new int[100];
		int[] occurrence = new int[10];
		for (int i = 0; i < randomNumbers.length; i++) {
			// generate random numbers 0-9
			int num = (int) (Math.random() * 10);
			// 100 random number assign to numbers(0-9) and increment them
			randomNumbers[i] = num;
			occurrence[num]++;
		}
		// it shows how many times each number appeared
		for (int i = 0; i < occurrence.length; i++) {
			System.out.println("Occurrences for " + i + " = " + occurrence[i]);

		}

	}

}
