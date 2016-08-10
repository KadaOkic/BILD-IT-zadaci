/**
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i 
 * ispisuje da li je drugi string substring prvog stringa.
 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a 
 * BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.
 */
package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1 = input.nextLine();
		System.out.print("Enter String 2: ");
		String s2 = input.nextLine();
		input.close();
		// if the first string contains the second then the second is substring
		// of the first string
		if (s1.contains(s2)) {
			System.out.println(s2 + " is a substring of " + s1);
		} else {
			System.out.println(s2 + " is NOT a substring of " + s1);
		}

	}

}
