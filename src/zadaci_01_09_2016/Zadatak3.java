/**
 * (Baby name popularity ranking) The popularity ranking of baby names from
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
 * babynameranking2010.txt. Each file contains one thousand lines. Each line
 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
 * and number for the girl’s name. For example, the first two lines in the file
 * babynameranking2010.txt are as follows:
 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
 * name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
 * Jacob and 22,731 girls are named Isabella. Write a program that prompts the
 * user to enter the year, gender, and followed by a name, and displays the ranking
 * of the name for the year.
 */
package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		// taking the year for the user
		String year = input.next();
		// using year user entered to create file name
		String fileName = "babynameranking" + year + ".txt";
		// creating file object with fileName string
		File file = new File(fileName);
		System.out.println("Enter the gender: ");
		// user entering gender
		char ch = input.next().charAt(0);
		System.out.println("Enter the name(case sensitive): ");
		// user entering name
		String name = input.next();
		input.close();
		// scanner object that will read from file
		Scanner in = new Scanner(file);
		boolean found = false;
		// loop reads from the file until match is found or there are no more
		// lines
		while (in.hasNextLine()) {
			// converting line from file into string array(regex for spliting
			// look for any number of spaces)
			String[] line = in.nextLine().split("\\s+");
			// comparing in case it's a male(element with index 1 contains male
			// name)
			if (Character.toUpperCase(ch) == 'M' && line[1].equals(name)) {
				// if found printing name, rank and year
				System.out.println(name + " is ranked #" + line[0]
						+ " in year " + year);
				// boolean value found set to true
				found = true;
				// breaking the loop
				break;

				// comparing in case it's female(element at index 3 contains
				// female name)
			} else if (Character.toUpperCase(ch) == 'F' && line[3].equals(name)) {
				// if found printing name, rank and year
				System.out.println(name + " is ranked #" + line[0]
						+ " in year " + year);
				// boolean value found set to true
				found = true;
				// breaking loop
				break;
			}
		}
		in.close();
		// in case name was not found we notify the user
		if (!found) {
			System.out.println("The name " + name + " is not ranked in year "
					+ year);
		}

	}

}
