/**
 * Napisati metode sa sljedeæim headerima: public static int reverse(int number) i public static boolean isPalindrome(int number). 
 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 * Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 */
package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.print("Enter a integer: ");
				int num = input.nextInt();
				// calling the methods for reverse order and isPolindrome
				if (isPalindrome(num)) {
					System.out.println(num + " is a palindrome. reverse: "
							+ reverse(num));
				} else {
					System.out.println(num + " is NOT a palindrome. reverse: "
							+ reverse(num));
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
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

	public static int reverse(int number) {

		int reverse = 0;
		while (number != 0) {
			// reversing the number
			reverse *= 10; // is ignored first iteration
			reverse += number % 10;
			number /= 10;
		}

		return reverse;
	}

	public static boolean isPalindrome(int number) {
		// number is polindrom if is equal to the number in reverse order
		return (number == reverse(number));

	}

}
