package zadaci_25_08_2016;

public class MyCharacter {
	char ch;

	// default constructor that uses char value
	public MyCharacter(char ch) {
		this.ch = ch;
	}

	/*
	 * method that checks if object is letter ch - character we pass to method-
	 * returns true if object is letter and false if it's not
	 */
	public static boolean isLetter(MyCharacter ch) {
		if ((ch.ch >= 'A' && ch.ch <= 'Z') || (ch.ch >= 'a' && ch.ch <= 'z'))
			return true;
		else
			return false;

	}

	/*
	 * method that checks if object is a digit ch- parametar we pass to method-
	 * returns true if it's digit and false if it's not
	 */
	public static boolean isDigit(MyCharacter ch) {
		if (ch.ch >= '0' && ch.ch <= '9')
			return true;
		else
			return false;

	}

	/*
	 * character that uses ASCII code to convert from lower case to upper case-
	 * returns lower case character as upper case
	 */
	public MyCharacter toUpperCase() {
		if (this.ch >= 97 && this.ch <= 122) {
			return new MyCharacter((char) ((int) this.ch - 32));
		} else {
			return new MyCharacter(this.ch);
		}
	}

	/*
	 * character that uses ASCII code to convert upper case character to lower
	 * case character- returns converted character from upper case to lower case
	 */
	public MyCharacter toLowerCase() {
		if (this.ch >= 65 && this.ch <= 90) {
			return new MyCharacter((char) ((int) this.ch + 32));
		} else {
			return new MyCharacter(this.ch);
		}
	}

	// method that converts character to string
	public String toString() {
		String res = "";
		res += this.ch;
		return res;
	}

}
