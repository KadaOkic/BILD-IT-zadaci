/*
 * (Implement the String class) The String class is provided in the Java library.
 * Provide your own implementation for the following methods (name the new
 * class MyString2):
 * public MyString2(String s);
 * public int compare(String s);
 * public MyString2 substring(int begin);
 * public MyString2 toUpperCase();
 * public char[] toChars();
 * public static MyString2 valueOf(boolean b);
 */
package zadaci_25_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {

		MyString2 str = new MyString2(
				"No one has the power to shatter your dreams unless you give it to them.");
		// method that compares strings
		System.out
				.println(str
						.compare("To be a champ, you have to believe in yourself when nobody else will."));
		// method that prints substring with starting parameter
		System.out.println(str.substring(3));
		// method that converts string to upper case
		System.out.println(str.toUpperCase());
		// method tha converts string to array of chars
		char[] ch = str.toChars();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		// method that returns textual value of boolean
		boolean test = true;
		System.out.println("\n" + MyString2.valueOf(test));

	}

}
