/**
 * (Add package statement) Suppose you have Java source files under the directories
 * chapter1, chapter2, . . . , chapter34. Write a program to insert the
 * statement package chapteri; as the first line for each Java source file under
 * the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
 * are under the root directory srcRootDirectory. The root directory and
 * chapteri directory may contain other folders and files. Use the following
 * command to run the program:
 * java Exercise12_18 srcRootDirectory
 */
package zadaci_31_08_2016;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		if (args.length != 0) {
			// workspace name passed through cmd
			String workspaceName = "source";
			// list of packages in the workspace
			File[] workspacePackages = new File(workspaceName).listFiles();
			// loop that goes through the packages
			for (int i = 0; i < workspacePackages.length; i++) {
				// list of files inside the packages
				File[] files = workspacePackages[i].listFiles();
				// loop through all the files in the packages
				for (int j = 0; j < files.length; j++) {
					// adding package name to the file
					addName(files[j], workspacePackages[i].getName());
				}
			}
			// print message
			System.out.println("Package names have been added.");
		}
	}

	/*
	 * method that goes through files and adds the package name - file that is
	 * loaded and name that is added
	 */
	public static void addName(File file, String packageName) {
		// if parametar is a file
		if (file.isFile()) {
			// initialize scanner object null
			Scanner input = null;

			try {
				// assigning new value to the scanner(scanner with file)
				input = new Scanner(file);
				// string that contains package name
				String textWithPackage = "package " + packageName + ";\n\n";
				// loop that uses scanner to read the text from the file
				while (input.hasNext()) {
					// storing lines from the file into the string
					textWithPackage += input.nextLine() + "\n";
				}
				// writing the text with added package name back into the file
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));
				pw.append(textWithPackage);
				pw.close();

			} catch (Exception ex) {
				System.out.println("File not found");
			}
		} else {
			// if its directory
			// list of files in the directory
			File[] files = file.listFiles();
			// loop that goes through the array of files
			for (int i = 0; i < files.length; i++) {
				// adding the name to all the files in the array
				addName(files[i], file.getName());
			}
		}
	}

}
