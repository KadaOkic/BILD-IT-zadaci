/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. 
 */
package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		for (int i = 0; i <= s.length(); i++) {
			// checking if it is a first letter
			if (!Character.isLetter(s.charAt(0))) {
				System.out.println("This is not a letter.Try again:");
				s = input.nextLine();
			}
		}
		// printing length of the string and the first letter on 0 index
		System.out.println("Length = " + s.length());
		System.out.println("The first character is: " + s.charAt(0));
		input.close();

	}

}
