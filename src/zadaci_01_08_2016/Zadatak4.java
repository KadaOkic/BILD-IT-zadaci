/**
 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9,
 * te ispisuje koliko se puta koji broj ponovio.
 */
package zadaci_01_08_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		// Declaration and initialization of array
		int[] nums = new int[10];
		// for loop goes through 100 numbers checks how many times are repeating
		// numbers 0 to 9 and increases that specific number
		for (int i = 0; i < 100; i++) {
			nums[(int) (Math.random() * 10)]++;
		}
		// goes through with for loop every number and counts how many times is
		// each number repeated
		for (int i = 0; i < nums.length; i++) {
			// prints number 0 to 9 and how may times they repeated
			System.out.println("Number " + i + " repeted " + nums[i] + "times");
		}

	}
}
