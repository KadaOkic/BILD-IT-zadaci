/**
 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. 
 * Napisati program koji nasumièno generiše tablicu.
 */
package zadaci_12_08_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// we use string builder because it is much faster and consumes less
		// memory.
		StringBuilder s = new StringBuilder();
		// for loop for 3 random letters
		for (int i = 0; i < 3; i++) {
			// Randomly picking the letters
			// ASCII code for A-Z is 65-90
			char ch = (char) (Math.random() * 26 + 'A');
			// we add that to a string
			s.append(ch);
		}
		// loop for four random digit and add to a string
		for (int i = 0; i < 4; i++) {
			char digit1 = (char) (Math.random() * 10 + '0');
			s.append(digit1);
		}
		System.out.println("Random vehicle plate number: " + s);

	}

}
