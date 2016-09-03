package zadaci_02_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCalendar {

	public static void main(String[] args) {
		
		int month = takeInput("Enter month:");
		int year = takeInput("Enter year:");
		String[] monthYear = { Integer.toString(month), Integer.toString(year) };
		DisplayCalendars.main(monthYear);
		}
	
	  // taking input from the user and controling with try i catch
    public static int takeInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        boolean isGood = false;
        int userInput = 0;
        while (!isGood) {
            try {
                isGood = true;
                userInput = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "Invalid input: Enter an integer: ");
                // final statements
            } finally {
                input.nextLine();
            }
 
        }
        return userInput;
    }
}
