package zadaci_02_08_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak3 {
	// Main method
	public static void main(String[] args) {
		// ask user to enter a name of the file
		System.out.println("Enter the name of the file : ");
		// create Scanner
		Scanner input = new Scanner(System.in);
		// name od the file and assigned variable
		String fileName = input.next();
		// make new file
		File file = new File(fileName);
		// Declaration and initialization
		int lines = 0;
		int characters = 0;
		int words = 0;
		//we use try and catch because the user can missspell the file or the file might not be found
		try {
			//we make Scanner object and passing the file
			Scanner reader = new Scanner(file);
			//we use while loop-read as long as there lines in the file and 
			//we increase number of lines with every loop
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				lines++;
				characters += line.length();
				//with split it makes our line into an array and
				//we have the length of and array from that we get number of words
				words += line.split(" ").length;

			}
			reader.close();
		} catch (IOException ex) {
			System.out.println("Your file might be missing");
		}
		// print the number of lines, character and words
		System.out.println("Number of lines " + lines);
		System.out.println("Number of character " + characters);
		System.out.println("Number of word " + words);
		input.close();
	}

}
