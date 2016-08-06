/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama.
 *  Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao
 */
package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();

		for (int i = 0; i < s.length(); i++) {
			// calculate the evan positions
			if ((i + 1) % 2 == 1) {
				System.out.print(s.charAt(i)); // print i which is on evan index
												// but odd to human eye
			}
		}
		input.close();
	}

}
