/**
 *  Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje ime mjeseca za taj broj. 
 *  (Januar za 1, Ferbruar za 2....)
 */
package zadaci_15_08_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// random numbers
		int monthNum = (int) (Math.random() * 12 + 1);
		// array of strings for names of the month
		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };

		System.out.println(monthNum + " is " + months[monthNum - 1]);

	}

}
