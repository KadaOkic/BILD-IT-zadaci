/*
 * (Implement the StringBuilder class) The StringBuilder class is provided
 * in the Java library. Provide your own implementation for the following methods
 * (name the new class MyStringBuilder1):
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s);
 * public MyStringBuilder1 append(int i);
 * public int length();
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase();
 * public MyStringBuilder1 substring(int begin, int end);
 * public String toString();
 */
package zadaci_25_08_2016;

public class Zadatak5 {

	public static void main(String[] args) {

		MyStringBuilder1 str = new MyStringBuilder1("SOME LOVE");
		MyStringBuilder1 str2 = new MyStringBuilder1("SONG");
		// method that appends two strings
		System.out.println(str.append(str2));
		// method that appends string and int
		System.out.println(str.append(5));
		// method that returns length of the object
		System.out.println(str.length());
		// method that returns char at given index
		System.out.println(str.charAt(5));
		// method that converts string to lower case
		System.out.println(str.toLowerCase());
		// method that returns substring of previous string
		System.out.println(str.substring(2, 10));

	}

}
