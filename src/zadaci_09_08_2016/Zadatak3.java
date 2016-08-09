/**
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
 * Razmak izmeðu brojeva treba biti taèno jedan space. 
 */
package zadaci_09_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// counter of numbers that we can divide 5 and 6
		int numCount = 1;
		// go through these numbers
		for (int i = 100; i <= 1000; i++) {
			// with if determine if this condition is fully complied print those
			// number 10 per line
			if (i % 5 == 0 && i % 6 == 0)
				System.out.print((numCount++ % 10 != 0) ? i + " " : i + "\n");
		}

	}

}
