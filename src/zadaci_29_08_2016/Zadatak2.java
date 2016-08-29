/**
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer
 * m and find the smallest integer n such that m * n is a perfect square. (Hint:
 * Store all smallest factors of m into an array list. n is the product of the factors that
 * appear an odd number of times in the array list. For example, consider m = 90,
 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 * in the array list. So, n is 10.)
 */
package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// asking the user to enter the integer
		System.out.println("Enter an integer m:");
		int num = input.nextInt();
		// printing out the result
		System.out
				.println("The smallest number n for m * n to be a perfect square is "
						+ perfectSquare(num)
						+ " m*n is "
						+ (perfectSquare(num) * num));
		input.close();
	}

	/*
	 * method that finds lowest "n" that should be multiplyed to get perfect
	 * square number we pass to the method returns value of "n"
	 */
	public static int perfectSquare(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		int temp = num;
		int i = 2;
		int n = 1;
		// loop that finds lowest factors and adds them to the array list
		while (temp != n) {
			if (temp % i == 0) {

				list.add(i);
				temp = temp / i;
			} else {
				i++;
			}
		}
		// list that stores factors that apear odd number of times
		ArrayList<Integer> odd = new ArrayList<>();
		// loops that find factors that apears odd number of times and add them
		// to array list "odd"
		for (int k = 0; k < list.size(); k++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(k) == list.get(j))
					count++;
			}
			// checks if number is already added since we need them only once
			if (count % 2 != 0 && !odd.contains(list.get(k))) {
				odd.add(list.get(k));
			}
		}
		int oddMulty = n;
		// checking if product of factors multiplyed with "num" is perfect
		// square
		for (int j = 0; j < odd.size(); j++) {
			oddMulty *= odd.get(j);
			// we break the loop when we get lowest product of factors that
			// fulfils the condition
			if (isPerfectSquare(num * oddMulty)) {
				break;
			}

		}
		return oddMulty;
	}

	/*
	 * method that checks if the number is perfect square n - number we're going
	 * to check returns true if it's perfect square and false if it's not
	 */
	public final static boolean isPerfectSquare(int n) {
		// if number is less than 0 return false
		if (n < 0)
			return false;
		int num = (int) (Math.sqrt(n) + 0.5);
		// if product of two squares is the orignal number, number is perfect
		// square
		return num * num == n;

	}

}
