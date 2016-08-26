/*
 *  (The Person, Student, Employee, Faculty, and Staff classes) 
 *  Design a class named Person and its two subclasses named Student and Employee.
 *  Make Faculty and Staff subclasses of Employee. A person has a name,
 *  address, phone number, and email address. A student has a class status (freshman,
 *  sophomore, junior, or senior). Define the status as a constant. An employee has
 *  an office, salary, and date hired. Use the MyDate class defined in Programming
 *  Exercise 10.14 to create an object for date hired. A faculty member has office
 *  hours and a rank. A staff member has a title. Override the toString method in
 *  each class to display the class name and the person’s name.
 *  Draw the UML diagram for the classes and implement them. Write a test program
 *  that creates a Person, Student, Employee, Faculty, and Staff, and
 *  invokes their toString() methods.
 */
package zadaci_26_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {

		// creating and printing out person object
		Person p1 = new Person("Amra", "La Benevolencija", "062/345-123",
				"amra@gmail.com");
		System.out.println(p1);
		// creating and printing out student object
		Student s1 = new Student("Dejan", "Vrbanja", "063/567-459",
				"dejan@hotmail.com", 0);
		System.out.println(s1);
		// creating and printing out employee object
		Employee e1 = new Employee("Adnan", "Alipašina", "065/123-556",
				"ado@yahoo.com", "Sarajevo", 5000);
		System.out.println(e1);
		// creating and printing out faculty object
		Faculty f1 = new Faculty("Damir", "Dobojske Brigade", "035/213-415",
				"damir@gmail.com", "Doboj", 4500, 40, "dean");
		System.out.println(f1);
		// creating and printing out staff object
		Staff staff1 = new Staff("Nikola", "Kralja Aleksandra", "053/132-141",
				"niko@hotmail.com", "Tuzla", 4500, "manager");
		System.out.println(staff1);

	}

}
