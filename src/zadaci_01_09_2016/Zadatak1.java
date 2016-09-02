/**
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
 * member’s first name, last name, rank, and salary (see Programming Exercise
 * 12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and all faculty, respectively.
 */
package zadaci_01_09_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws IOException {

		// url object with web adress
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		// scanner that will read from url
		Scanner input = new Scanner(url.openStream());
		// variables which store sum of salaries by rank and number of each rank
		double sumAssistant = 0;
		double countAssistant = 0;
		double sumAssociate = 0;
		double countAssociate = 0;
		double sumFull = 0;
		double countFull = 0;
		double total = 0;
		double countTotal = 0;
		// loop that goes through the file
		while (input.hasNextLine()) {
			// spliting each line by space
			String[] line = input.nextLine().split(" ");
			// adding salaries(they're on 3rd index of the array)
			total += Double.parseDouble(line[3]);
			// counting total members
			countTotal++;
			// checking titles and increasing rank and adding sum to
			// corresponding value
			if (line[2].equals("assistant")) {
				sumAssistant += Double.parseDouble(line[3]);
				countAssistant++;
			} else if (line[2].equals("associate")) {
				sumAssociate += Double.parseDouble(line[3]);
				countAssociate++;
			} else if (line[2].equals("full")) {
				sumFull += Double.parseDouble(line[3]);
				countFull++;
			}
		}
		input.close();
		// printing out results that include total for each rank and average for
		// each rank
		System.out
				.printf("Total salary for assistants: %.2f \naverage salary for assistants is %.2f",
						sumAssistant, (sumAssistant / countAssistant));
		System.out
				.printf("\nTotal salary for associate: %.2f \naverage salary for associate is %.2f",
						sumAssociate, (sumAssociate / countAssociate));
		System.out
				.printf("\nTotal salary for full: %.2f \naverage salary for full is %.2f",
						sumFull, (sumFull / countFull));
		// printing out result for total salaries and average
		System.out.printf(
				"\nTotal salary for faculty is: %.2f average salary is: %.2f",
				total, (total / countTotal));

	}

}
