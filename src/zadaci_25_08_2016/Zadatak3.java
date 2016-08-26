/*
 * (Implement the Character class) The Character class is provided in the Java library.
 * Provide your own implementation for this class.
 * Name the new class MyCharacter
 */
package zadaci_25_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		// object of MyCharacter class with value of 'a'
		MyCharacter ch = new MyCharacter('a');
		// method that tests if our object is a letter
		System.out.println("Is character letter: " + MyCharacter.isLetter(ch));
		// method that tests if our object is a digit
		System.out.println("Is character digit: " + MyCharacter.isDigit(ch));
		// method that converts character from lower case to upper case
		System.out.println(ch.toUpperCase());
		// method that converts object from upper case to lower case
		System.out.println(new MyCharacter('A').toLowerCase());
		// toString method test
		System.out.println(ch);

	}

}
