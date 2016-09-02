/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 */
package zadaci_01_09_2016;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {

		// array list of integer data type
		ArrayList<Integer> list = new ArrayList<>();
		// adding some numbers into array list
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		// invoking method
		sort(list);

	}

	/*
	 * method that uses bubble sort algorithm to sort list- array
	 * list passed to the method
	 */
	public static void sort(ArrayList<Integer> list) {
		int temp = 0;
		boolean sorted = false;
		// if list is bigger than one we will use bubble sort
		if (list.size() > 1) {
			// loop will run until list is sorted
			while (!sorted) {
				// we set sorted to be true
				sorted = true;
				for (int i = 0; i < list.size() - 1; i++) {
					// if current element is bigger than the next one we swap
					// their places
					if (list.get(i) > list.get(i + 1)) {
						// if swap occured it we set sorted to false to run
						// outer loop one more time
						sorted = false;
						temp = list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		}
		// printing out the new list
		System.out.println(list);

	}

}
