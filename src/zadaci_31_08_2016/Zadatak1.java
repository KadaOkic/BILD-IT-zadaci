/**
 * (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style. For example,
 * the following Java source in (a) uses the next-line brace style. Your program
 * converts it to the end-of-line brace style in (b).
 * Your program can be invoked from the command line with the Java sourcecode
 * file as the argument. It converts the Java source code to a new format. For
 * example, the following command converts the Java source-code file Test.java
 * to the end-of-line brace style.
 * java Exercise12_12 Test.java
 */
package zadaci_31_08_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		try {
			// creating string with file name
			String fileName = "test.txt";
			// creating file with string passed from string
			File file = new File(fileName);
			// scanner object with file with name
			Scanner input = new Scanner(file);
			String string = "";
			// loop runs until there are no more lines in the file
			while (input.hasNext()) {
				// adding to string every next line
				string += input.nextLine() + "\n";

			}
			// using "regex" to replace any white spaces(including tabs) and {
			// with ){
			string = string.replaceAll("\\)\\s*\\{", ") {");
			// using "regex" to remove white space
			string = string.replaceAll("\\s*\\{", " {");
			input.close();
			// print writer object with file String
			PrintWriter pw = new PrintWriter(file);
			// add string into the file
			pw.append(string);
			pw.close();
			System.out.println("Reformat complete.");
		} catch (Exception e) {
			System.out.println("File not found!");

		}

	}

}
