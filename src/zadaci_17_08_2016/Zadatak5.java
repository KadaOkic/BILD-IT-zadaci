/**
 * Napisati program koji uèitava 10 brojeva te ispisuje 
 * koilko je jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.
 */
package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int index = 0;
		System.out.print("Enter ten numbers: ");

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				for (int i = 0; i < numbers.length; i++) {
					int num = input.nextInt();
					// if is new increment index
					if (isNew(numbers, num)) {
						// number of index numbers is number of distinct numbers
						numbers[index++] = num;
					}
				}
				System.out.println("The number of distinct number is " + index);
				System.out.print("The distinct numbers are: ");
				for (int i = 0; i < index; i++) {
					System.out.print(numbers[i] + " ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. "
						+ "Invalid input: Enter an integer: ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		// Scanner closed
		input.close();

	}

	public static boolean isNew(int[] numbers, int n) {
		// for each int number that is equal with one of the numbers return
		// false
		for (int i : numbers) {
			if (n == i)
				return false;
		}
		return true;
	}
}
