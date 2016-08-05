/**
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji.
 * Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše: 
 * Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */
package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string:");
		String s1 = input.nextLine();
		System.out.print("Enter the second string:");
		String s2 = input.nextLine();
		// return string with less length
		int length = Math.min(s1.length(), s2.length());
		// put prefix in this string
		String res = "";
		// with for loop we go to every index of strings and copmare them
		for (int i = 0; i < length; i++) {
			// what is equal we add it in the result
			if (s1.charAt(i) == s2.charAt(i)) {
				res += s1.charAt(i);
				// if not break
			} else {
				break;
			}

		}
		// if prefix is equal to zero
		if (res.length() == 0) {
			System.out.println(s1 + " and " + s2 + " have no common prefix");
		} else {
			System.out.println("The common prefix is: " + res);
		}

		input.close();
	}

}
