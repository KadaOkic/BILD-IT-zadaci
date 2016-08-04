/**
 *  Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 *  Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */
package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter the number :");
				int number = input.nextInt();
				int i = 2;
				while (number != 1) {
					if (number % i == 0) {
						System.out.print(i + " ");
						number = number / i;
					} else {
						i++;
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		input.close();

	}
}
