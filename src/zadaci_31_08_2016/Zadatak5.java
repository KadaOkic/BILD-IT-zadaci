/**
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 */
package zadaci_31_08_2016;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Zadatak5 {

	public static void main(String[] args) throws IOException {

		// file object with name file
		File file = new File("Salary.txt");
		// string array that stores ranks
		String[] rank = { "assistant", "associate", "full" };
		// string that we'll use to store data for every faculty member
		String[] toFile = new String[1000];
		// making sure value of array is not null
		Arrays.fill(toFile, "");
		// loop that will add thousand faculty members to array list
		for (int i = 0; i < 1000; i++) {
			// adding firstname and i+1(becouse i starts at 0)
			toFile[i] += "FirstName" + (i + 1) + " ";
			// adding lastname and i+1
			toFile[i] += "LastName" + (i + 1) + " ";
			// randoming rank by getting element at random index of rank array
			String rankStr = rank[((int) (Math.random() * 3))];
			toFile[i] += rankStr + " ";
			// checking for the rank and assigning (random) the salary within
			// given range
			if (rankStr == "assistant") {
				Random r = new Random();
				double sal = 50000 + (80000 - 50000) * r.nextDouble();
				toFile[i] += String.format("%.2f", sal) + "\n";
				// checking for the rank and assigning (random) the salary
				// within given range
			} else if (rankStr == "associate") {
				Random r = new Random();
				double sal = 60000 + (110000 - 60000) * r.nextDouble();
				toFile[i] += String.format("%.2f", sal) + "\n";
				// checking for the rank and assigning (random) the salary
				// within given range
			} else if (rankStr == "full") {
				Random r = new Random();
				double sal = 75000 + (130000 - 75000) * r.nextDouble();
				toFile[i] += String.format("%.2f", sal) + "\n";
			}
		}
		// file writer object
		FileWriter fw = new FileWriter(file);
		try {
			// writing all the elements from the toFile array into the file
			for (int i = 0; i < 1000; i++) {
				fw.write(toFile[i]);

			}
			// in case index is not found we notify the user
		} catch (IOException ex) {
			System.out.println("Index not fund.");
		} finally {
			fw.close();
		}

	}
}
