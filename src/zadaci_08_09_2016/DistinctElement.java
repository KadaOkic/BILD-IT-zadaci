/**
 * (Distinct elements in ArrayList) Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
package zadaci_08_09_2016;

import java.util.ArrayList;

public class DistinctElement {

	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			// adding elements to the list-strings
			strings.add("Hello");
			strings.add("world!");
			strings.add("Hello");
			strings.add("people");
			strings.add("hello");
			strings.add("you.");

		}

		strings = removeDuplicates(strings);
		for (String s : strings) {
			System.out.println(s);
		}
	}

	// method that returns a new ArrayList with no duplicates
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		ArrayList<E> newList = new ArrayList<>(list.size());
		for (E aList : list) {
			if (!newList.contains(aList)) {
				newList.add(aList);
			}
		}
		return newList;

	}

}
