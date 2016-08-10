/**
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu.
 * Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu
 * te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 */
package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);

		System.out.println("The number of occurrences of \'" + ch + "\' in \""
				+ s + "\" is " + count(s, ch));
		input.close();
	}

	public static int count(String str, char a) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// if there is char a in a string increment count
			if (str.charAt(i) == a)
				count++;
		}
		// return number of occurrences of char a in a string
		return count;

	}

}
