/**
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
 * and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
 * numbers. The current Fibonacci number would then be f0 + f1. 
 * The algorithm can be described as follows:
 * f0 = 0; // For fib(0)
 * f1 = 1; // For fib(1)
 *for (int i = 1; i <= n; i++) {
 *currentFib = f0 + f1;
 *f0 = f1;
 *f1 = currentFib;
 *}
 * After the loop, currentFib is fib(n)
 * Write a test program that prompts the user to enter an index and displays its
 * Fibonacci number.
 */
package zadaci_06_09_2016;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter index of fibonacci number you want:");
		System.out.println(fibo(input.nextInt()));
		input.close();
	}

	/*
	 * Recourisve method that finds fibonacci number at wanted index. n - index
	 * of the number return- number at wanted index
	 */
	public static int fibo(int n) {
		//base case
		if (n == 1 || n == 0)
			return n;
		else
			return fibo(n - 2) + fibo(n - 1);

	}

}
