/**
 * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 */
package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// file object with argument fileName
		File file = new File("removeText.txt");
		// array list where we store text from file
		ArrayList<String> list = new ArrayList<>();
		// crete scanner for input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word you want to remove");
		// word which want to remove
		String word = input.nextLine();
		// catch exception if file or word not found
		try {
			list = readFileRemoveWord(file, word);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		try {
			saveFile(file, list);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	// method reads the file, removes the word and all that returns to the list

	public static ArrayList<String> readFileRemoveWord(File file, String word)
			throws FileNotFoundException {
		ArrayList<String> listOfWords = new ArrayList<>();
		// scanner object that reads from file
		Scanner read = new Scanner(file);
		// while has next line loop goes
		while (read.hasNextLine()) {
			listOfWords.add(read.nextLine().replaceAll(word, "") + "\n");
		}
		return listOfWords;
	}

	// method writes the list into the file
	public static void saveFile(File file, ArrayList<String> list)
			throws IOException {
		// file writer object
		FileWriter fw = new FileWriter(file);

		try {
			// writing content of the list into the file
			for (int i = 0; i < list.size(); i++) {
				fw.write(list.get(i));
			}
		} finally {
			fw.close();
		}

	}
}
