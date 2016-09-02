/**
 * (Occurrences of each letter) Write a program that prompts the user to enter
 * a file name and displays the occurrences of each letter in the file. Letters are
 * case-insensitive.
 */
package zadaci_01_09_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) throws IOException{
		
		// scanner that takes input from user
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the file name: ");
				// creating file object with name user entered
				File file = new File(input.next().trim());
				input.close();
				// scanner that reads from file
				Scanner in = new Scanner(file);
				// char array that contains letters
				char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
						'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
						'X', 'Y', 'Z' };
				// array that will count occurrences of letters
				int[] nums = new int[26];
				// loop that goes through the lines of the file
				while (in.hasNextLine()) {
					String line = in.nextLine();
					// nested loop compares chars in the array and chars in the line and
					// increment corresponding index when letter is found
					for (int i = 0; i < chars.length; i++) {
						for (int j = 0; j < line.length(); j++) {
							if (chars[i] == Character.toUpperCase(line.charAt(j))) {
								nums[i]++;
							}
						}
					}
				}
				in.close();	
				// printing out letters that appear at least once, with number of
				// occurrences
				for (int i = 0; i < 26; i++) {
					if (nums[i] > 0)
						System.out.println("Letter " + chars[i] + " apeared " + nums[i]
								+ " times.");
				}


	}

}
