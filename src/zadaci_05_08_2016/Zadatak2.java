/**
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K)
 *  te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka).
 *  Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */
package zadaci_05_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {

		int card = (int) (Math.random() * 52.0); // pick a random card 0-51
		int rank = card / 4; // determine the rank 0-12
		int suit = card % 4; // determine the suit 0-3
		String strRank = "";// string to enter names of cards
		String strSuit = "";// names for four suits: spades, hearts,
							// diamonds and clubs
		// we use switch to assign names from (0,10-12) and other(2-9) by
		// default
		switch (rank) {
		case 0:
			strRank = "Ace";
			break;
		case 10:
			strRank = "Jack";
			break;
		case 11:
			strRank = "Queen";
			break;
		case 12:
			strRank = "King";
			break;
		default:
			strRank = "" + (rank + 1);
			break;
		}

		switch (suit) {
		case 0:
			strSuit = "Clubs";
			break;
		case 1:
			strSuit = "Diamonds";
			break;
		case 2:
			strSuit = "Hearts";
			break;
		case 3:
			strSuit = "Spades";
			break;
		}

		System.out
				.print("The card you picked is " + strRank + " of " + strSuit);

	}

}
