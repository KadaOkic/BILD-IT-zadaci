/**
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 */
package zadaci_30_08_2016;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		
		//array list of object which we'll use to store numbers
				ArrayList<Object> list = new ArrayList<>();
				try {
					//loop that runs up to max value of int(takes some time to get exception)
					for (int i = 0; i < Integer.MAX_VALUE; i++) {
						//adding Long number max value to the list
						list.add(Long.MAX_VALUE);
					}
					//printing out error message
				} catch (OutOfMemoryError ex) {
					System.out.println("Out of memory exception");
				}
				//printing out the message that program finished
				System.out.println("Finished!");

	}

}
