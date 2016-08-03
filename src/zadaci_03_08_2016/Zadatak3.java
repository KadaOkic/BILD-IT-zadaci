/**
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki.
 *  Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
 *  public static boolean equals(int[ ] niz1, int[ ] niz2)
 *  Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identièni.
 * 
 */
package zadaci_03_08_2016;

//import za exception and scanner
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {
	// Main method
	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				// ask user to enter a first list of numbers
				System.out
						.print("(Note:first number in the input indicates the number of elements in the list) \nEnter list1:");
				// assign the variable to the first list number and assing the
				// variable to numbers within
				int[] list1 = new int[input.nextInt()];
				for (int i = 0; i < list1.length; i++) {
					list1[i] = input.nextInt();
				}
				// ask user to enter a second list of numbers
				System.out
						.print("(Note:first number in the input indicates the number of elements in the list) \nEnter list2:");
				// assign the variable to the first list number and assing the
				// variable to numbers within
				int[] list2 = new int[input.nextInt()];
				for (int i = 0; i < list2.length; i++) {
					list2[i] = input.nextInt();
				}
				// call the method to check if are the lists identical or not
				if (equals(list1, list2)) {
					System.out.println("Two lists are identical");
				} else {
					System.out.println("Two lists are not identical");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		input.close();
	}

	// method checks if are the lists identical
	public static boolean equals(int[] list1, int[] list2) {
		// if lists are not identical return false after it sorts the numbers in
		// the list
		if (list1.length != list2.length)
			return false;
		selectionSort(list1);
		selectionSort(list2);
		// for loop check if are the list1 and list2 identical
		for (int i = 0; i < list2.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}

		return true;

	}

	// method for sorting numbers in the list begining from minimum number
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}

	}

}
