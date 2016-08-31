/**
 * (Process scores in a text file) Suppose that a text file contains an unspecified
 * number of scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file, and displays their total and
 * average
 */
package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws FileNotFoundException {

		// scanner object that takes input from user
		Scanner input = new Scanner(System.in);
		// asking user for input
		System.out.println("Enter name of the file:");
		// file object with "name" taken from user
		File file = new File(input.next());
		// scanner object that reads from file
		Scanner in = new Scanner(file);
		double sum = 0;
		double average = 0;
		double count = 0;
		// loop that runs until there are no more tokens in file
		while (in.hasNext()) {
			// sum of all scores
			sum += in.nextInt();
			// counter for scores
			count++;

		}
		input.close();
		in.close();
		// average
		average = sum / count;
		System.out.println("Total is: " + sum);
		System.out.println("Average is: " + average);

	}

}
