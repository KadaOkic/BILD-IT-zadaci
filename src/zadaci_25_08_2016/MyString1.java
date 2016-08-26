package zadaci_25_08_2016;

public class MyString1 {

	char[] chars;

	// constructor that uses arrays of characters
	MyString1(char[] chars) {
		this.chars = chars;
	}

	// method that returns character at given index
	public char charAt(int index) {
		return chars[index];

	}

	// method that returns length of MyString1 object
	public int length() {
		return chars.length;
	}

	/**
	 * method that returns new object with values from - to given indexes
	 * begin-start of our new array end- end index of our new array returns
	 * object with new value
	 */
	public MyString1 substring(int begin, int end) {
		// new char array with length of difference between end and begin
		// parameters
		char[] res = new char[end - begin];
		// adding to new array character from "begin" index to "end" index
		for (int i = 0; i < res.length; i++) {
			res[i] = this.chars[i + begin];
		}
		return new MyString1(res);
	}

	/*
	 * method that converts all characters to lower case returns new object with
	 * all characters in array as lower case
	 */
	public MyString1 toLowerCase() {
		char[] res = new char[this.chars.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = Character.toLowerCase(res[i]);
		}
		return new MyString1(res);
	}

	/*
	 * method that compares "this" object with passed argument s - MyString1
	 * object that we need to compare returns true if objects are equal and
	 * false if they're not
	 */

	public boolean equals(MyString1 s) {
		boolean res = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.chars[i] == this.chars[i])
				res = true;

		}
		return res;
	}

	// method that converts integer into character array
	public static MyString1 valueOf(int i) {
		return new MyString1(Integer.toString(i).toCharArray());
	}

	// overriden toString method that converts char array to string
	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < this.chars.length; i++) {
			res += this.chars[i];

		}
		return res;
	}

}
