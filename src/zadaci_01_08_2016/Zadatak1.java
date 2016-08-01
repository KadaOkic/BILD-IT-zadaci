/**
 * Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu Integera.
 *  Metoda vraæa null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
 *  public static Integer max(ArrayList<Integer> list)
 */
package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak1 {
	// Main method
	public static void main(String[] args) {
		// create an ArrayList and fill it with random numbers
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 9, 3, 6,
				4, 9));
		// Print list
		System.out.println(max(list));
	}

	// create a method that checks the list and if it is empty or null returns a
	// null
	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		// we look through al the list and assume that the first number is the
		// biggest and compare with second until we found the biggest of them
		// all

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}
}