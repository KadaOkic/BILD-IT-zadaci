/**
 * (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */
package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter two integers: ");
	        int first = 0;
	        int second = 0;
	     // boolean value that states if the integer is entered correctly
	        boolean isGood = false;
	     // loop runs while value of "isGood" is true
	        while (!isGood) {
	        	// try statement that asks user to enter two integers
	            try {
	                first = input.nextInt();
	                second = input.nextInt();
	                isGood = true;
	            } catch (InputMismatchException ex) {

	                input.nextLine();
	                System.out.println("Invalid input..." );
	                System.out.print("Enter two integers: ");
	            
			}
		}
		// printing out the sum of our integers
		System.out.println("Sum of your integers " + first + " + " + second + " = "  + (first + second));

		input.close();
	}

}
