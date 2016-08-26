/*
 * (New string split method) The split method in the String class returns an
 * array of strings consisting of the substrings split by the delimiters. 
 * However, the delimiters are not returned. Implement the following new method that returns
 * an array of strings consisting of the substrings split by the matching delimiters,
 * including the matching delimiters.
 * public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 * array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 * #, and e in an array of String.
 */
package zadaci_25_08_2016;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {

		String[] temp1 = split("ab#12#453", "#");
		for (String e : temp1) {
			System.out.print(e + " ");
		}

		String[] temp2 = split("\na?b?gf#e", "[?#]");
		for (String e : temp2) {
			System.out.print(e);
		}
	}

	/*
	 * method that splits the string and add "tokens" to string array s- string
	 * that will be split regex- string that serves as delimiter string array
	 * consisting of pieces of string passed to method
	 */
	public static String[] split(String s, String regex) {

		ArrayList<String> res = new ArrayList<String>();
		String temp = "";
		int count = 0;
		// nested loop goes compares each character of the string with each
		// character of "regex" expresion
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < regex.length(); j++) {
				// if loop find match between char from string and char from
				// regex it adds temp string to array list and resets the string
				// else it increments the counter
				if (s.charAt(i) == regex.charAt(j)) {
					res.add(temp);
					res.add(Character.toString(regex.charAt(j)));
					temp = "";
					break;
				} else {
					count++;
				}
				// if looped passed through regex and didn't find match it adds
				// character to temp strings
				if (count == regex.length()) {
					temp += s.charAt(i);
				}
			}
		}
		// adding last part of the string
		res.add(temp);
		// converting array list to string array
		String[] result = new String[res.size()];
		for (int i = 0; i < res.size(); i++) {
			result[i] = res.get(i);
		}
		return result;

	}

}
