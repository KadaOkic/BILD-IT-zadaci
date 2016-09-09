/**
 * (Generic linear search) Implement the following generic method for linear search.
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 */
package zadaci_08_09_2016;

public class GenericLinearSearch {

	public static void main(String[] args) {
		// initialize array
		Integer[] list = new Integer[20];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		// testing metod
		System.out.println(linearSearch(list, 1));
		System.out.println(linearSearch(list, 10));
		System.out.println(linearSearch(list, 30));
	}

	// generic method for linear search
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

		for (int i = 0; i < list.length; i++) {
			// if key compared to list with specified index is zero
			if (list[i].compareTo(key) == 0) {
				// return number from the list
				return i;
			}
		}
		// else
		return -1;
	}

}
