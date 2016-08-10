/**
 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Tako�er, program ispisuje broj svih mogu�ih kombinacija. 
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. 
 * Broj mogu�ih kombinacija je 21. 
 */
package zadaci_10_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		int counter = 0;
		for (int i = 1; i <= 7; i++) {// here we define i
			// j is incremented by one in every par
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				// counting number of combinations
				counter++;
			}
		}

		System.out.println("Total combination: " + counter);

	}

}
