/*
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop
 * to display all the elements in the list by invoking the object’s toString() method.
 */
package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak4 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		//add Circle object to the list
		list.add(new Circle(2));
		//add a string to the list
		list.add("Hello I'm a string");
		//add a Date object to the list
		list.add(new Date());
		//add a Loan object to the list
		list.add(new Loan(2500));

		list.forEach(System.out::println);

	}

}
