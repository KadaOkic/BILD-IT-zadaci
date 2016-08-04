/**
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
 */
package zadaci_04_08_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		// for loop to through 100 letters and divade them ten per line
		for (int i = 1; i <= 100; i++) {

			if (i % 10 == 1 && i != 1) {
				System.out.println();
			}
			// print random upper case letter
			System.out.print(getRandomUpperCaseLetter());

		}

		// after letters print 100 digits 10 numbers per line
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 1) {
				System.out.println();
			}
			// print random digit character
			System.out.print(getRandomDigitCharacter());

		}

	}

	// Generate a random character between ch1 and ch2
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	// Generate a random lowercase letter
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	// Generate a random uppercase letter
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	// Generate a random digit character
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');

	}

	// Generate a random character
	public static char getRandomCharacter() {
		// each character has a uniqe code between 0 and FFFF in hexadecimal
		return getRandomCharacter('\u0000', '\uFFFF');
	}

}
