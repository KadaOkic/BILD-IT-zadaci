/**
 * (Generic binary search) Implement the following method using binary search.
 * public static <E extends Comparable<E>>
 * int binarySearch(E[] list, E key)
 */
package zadaci_08_09_2016;

public class BinarySearch {

	public static void main(String[] args) {

		Integer[] list = { 3, 5, 8, 10, 21, 30, 45, 59, 70, 96 };

		// Test binarySearch
		System.out.println(binarySearch(list, 15));
		System.out.println(binarySearch(list, 10));
		System.out.println(binarySearch(list, 59));

	}

	/*
	 * This method returns index of the search key, if it is contained in the
	 * array, else it returns (-(insertion point) - 1). The insertion point is
	 * the point at which the key would be inserted into the array: the index of
	 * the first element greater than the key, or list.length if all elements in
	 * the array are less than the specified key
	 */
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (high - low) / 2 + low;
			if (list[mid].compareTo(key) == 0)
				return mid;

			if (list[mid].compareTo(key) < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;

	}

}
