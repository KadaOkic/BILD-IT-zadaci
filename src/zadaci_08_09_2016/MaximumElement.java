/**
 * (Maximum element in an array) Implement the following method that returns the
 * maximum element in an array.
 * public static <E extends Comparable<E>> E max(E[] list)
 */
package zadaci_08_09_2016;

public class MaximumElement {

	public static void main(String[] args) {
		//initialize array
		Integer[] list = { 5, 11, 9, 15, 3 };
		System.out.println("Max = " + max(list));

	}
	//method that returns the maximum element in an array.
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			E element = list[i];
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}

		return max;
	}

}
