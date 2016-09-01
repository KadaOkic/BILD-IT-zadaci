/**
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
 * Lincoln.txt.
 */
package zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {

		// URL object that stores web adress of textual file
		URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		// scanner object that will read from url
		Scanner in = new Scanner(url.openStream());
		int sumWords = 0;
		// loop that runs until it has no more lines in the file
		while (in.hasNextLine()) {
			// temporary line from the file stored into string
			String line = in.nextLine();
			// adding number of words from each line into sum
			sumWords += line.split(" ").length;
		}
		in.close();
		System.out.println("File has: " + sumWords + " words.");

	}

}
