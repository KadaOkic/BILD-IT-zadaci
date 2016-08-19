/**
 * (Random number chooser) Write a method that returns a random number between
 * 1 and 54, excluding the numbers passed in the argument. 
 * The method header is specified as follows:
 * public static int getRandom(int... numbers)
 */
package zadaci_18_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {

		System.out.println("Number generated: "
				+ getRandom(10, 20, 30, 40, 50, 1, 5, 15, 25, 35));
	}

	public static int getRandom(int... numbers) {

		int number = (int) (Math.random() * 54) + 1;
		if (numbers.length == 0) {
			return number;
		}
		// check is random num equal to any argument, if yes, get new random
		// number
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				number = (int) (Math.random() * 54 + 1);
				// check again from beginning of array
				i = -1;
			}
		}
		return number;

	}
}
