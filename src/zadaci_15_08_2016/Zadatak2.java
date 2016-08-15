/**
 * Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški)
 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio,
 * da li je raèunar pobijedio ili je bilo neriješeno. 
 */
package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		int computerHand = (int) (Math.random() * 3);

		int playerHand = takeInput("Enter 0 for scissor, 1 for rock, 2 for paper:");
		// calling methods and get what played computer and player and see who
		// won
		String computer = getHand(computerHand);
		String player = getHand(playerHand);
		String gameStats = getGameStatus(computerHand, playerHand);
		System.out.println("The computer is " + computer + ". You are "
				+ player + ". " + gameStats + ".");

	}

	// Method which move is made
	public static String getHand(int hand) {

		String handString = " ";
		switch (hand) {
		case 0:
			handString = "scissor";
			break;
		case 1:
			handString = "rock";
			break;
		case 2:
			handString = "paper";
			break;

		}
		return handString;
	}

	// get game status
	public static String getGameStatus(int computer, int player) {
		if (computer == player)
			return "It's a draw";

		String status = "";
		switch (player) {
		case 0:
			// if the value of the expresion is true assign first status
			// if false then second status
			status = (computer != 1) ? "You won" : "You lost";
			break;
		case 1:
			status = (computer != 2) ? "You won" : "You lost";
			break;
		case 2:
			status = (computer != 0) ? "You won" : "You lost";
			break;
		}

		return status;

	}

	// taking input from the user and checking it
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				if (userInput >= 0 && userInput <= 2) {
					isGood = true;
				} else {
					System.out.println("Enter numbers 0 , 1 or 2 : ");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}
