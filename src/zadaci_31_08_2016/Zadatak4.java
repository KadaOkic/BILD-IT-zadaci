/**
 * (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */
package zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) throws IOException {

		// creating URL object with web adress of the file
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		// scanner that will read from the url object
		Scanner in = new Scanner(url.openStream());
		// variable that adds sum
		double sum = 0;
		// varibale that will count scores
		double count = 0;
		// loop goes through the file and "reads" scores
		while (in.hasNext()) {
			// adding scores values to the sum
			sum += in.nextDouble();
			// counting how many scores were found
			count++;
		}
		in.close();
		// average is calculated by dividing sum and number of scores
		double average = sum / count;
		System.out.println("Total of the scores was: " + sum);
		System.out.printf("Average was %.2f", average);

	}

}
