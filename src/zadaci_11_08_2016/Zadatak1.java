/**
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu.
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.
 */
package zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String s2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String s3 = input.nextLine();
		input.close();

		// we are using temp to compare alphabetical order in each towns name
		String temp;
		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if (s2.compareTo(s3) > 0) {
			temp = s2;
			s2 = s3;
			s3 = temp;
		}
		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}

		System.out.println("The three cities in alphabetical order are:\n "
				+ s1 + " " + s2 + " " + s3);

	}

}
