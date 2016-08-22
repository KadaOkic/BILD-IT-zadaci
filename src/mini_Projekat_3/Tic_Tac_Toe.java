/**
 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * marking an available cell in a 3 * 3 grid with their respective tokens 
 * (either X or O). When one player has placed three tokens in a horizontal, vertical, or
 * diagonal row on the grid, the game is over and that player has won. 
 * A draw (no winner) occurs when all the cells on the grid have been filled with tokens and
 * neither player has achieved a win. Create a program for playing tic-tac-toe.
 * The program prompts two players to enter an X token and O token alternately.
 * Whenever a token is entered, the program redisplays the board on the
 * console and determines the status of the game (win, draw, or continue).
 */
package mini_Projekat_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		char player = 'X';
		// matrix which will contain inputs from the user
		char[][] matrix = new char[3][3];
		// print blank board
		printMatrix(matrix);
		// while anyone doesn't win go through the loop
		while (!anyoneWin(player, matrix)) {
			player = assignSign(matrix, player);
		}
	}

	// method to print table-the look
	public static void printMatrix(char[][] matrix) {
		for (int i = 0; i < 3; i++) {
			if (i != 0)
				System.out.println("-------------");
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println();
		}

	}

	// method in which we take input from the user and assign sign(X, O) to
	// player
	public static char assignSign(char[][] matrix, char player) {
		if (!canPlay(matrix)) {
			System.exit(1);
		}
		// takes input from the user for the row and column
		int row = takeInput("Enter a row  (0, 1, or 2) for player " + player
				+ ": ");
		int column = takeInput("Enter a  column (0, 1, or 2) for player "
				+ player + ": ");
		// if the current place isn't empty print the message bellow
		if (matrix[row][column] != '\u0000') {
			System.out.println("The row and column is occupied.");
			// changing sign to a player in case of success in placing the sign
			// otherwise repeat the same sign
		} else {
			matrix[row][column] = player;
			if (player == 'O') {
				player = 'X';
			} else {
				player = 'O';
			}

		}
		// update table and return player which is next
		printMatrix(matrix);
		return player;
	}

	// method that checks if the place is occuppied
	public static boolean canPlay(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == '\u0000') {
					return true;
				}
			}
		}
		// if every place is filled(9 moves)
		System.out.println("It's a draw!");
		return false;
	}

	// method checks which player won ass it return where he won in rows,columns
	// or diagonal
	public static boolean anyoneWin(char player, char[][] matrix) {
		return (diagonalWin(matrix) || rowsWin(matrix) || columnsWin(matrix));
	}

	// taking input and checking
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				// user needs to enter 0,1 or 2
				if (userInput >= 0 && userInput <= 2) {
					isGood = true;
					// if not message
				} else {
					System.out.println(message);
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

	// diagonal check
	public static boolean diagonalWin(char[][] matrix) {
		// descending diagonal check if is free place and if there is a sign on
		// this 3 coordinate(00,11,22)
		if (matrix[0][0] != '\u0000' && matrix[0][0] == matrix[1][1]
				&& matrix[1][1] == matrix[2][2]) {
			// if yes print this message
			System.out.println("\nPlayer " + matrix[0][0] + " won!");
			return true;
		}
		// ascending diagonal check goes through this coordinate points if the
		// begging place is free
		if (matrix[0][2] != '\u0000' && matrix[0][2] == matrix[1][1]
				&& matrix[1][1] == matrix[2][0]) {
			System.out.println("\nPlayer " + matrix[0][2] + " won!");
			return true;
		}
		return false;
	}

	// horizontal check goes through the row and check
	public static boolean rowsWin(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] != '\u0000' && matrix[i][0] == matrix[i][1]
					&& matrix[i][1] == matrix[i][2]) {
				System.out.println("\nPlayer " + matrix[i][0] + " won!");
				return true;
			}
		}
		return false;
	}

	// vertical check-through columns
	public static boolean columnsWin(char[][] matrix) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[0][j] != '\u0000' && matrix[0][j] == matrix[1][j]
					&& matrix[1][j] == matrix[2][j]) {
				System.out.println("\nPlayer " + matrix[0][j] + " won!");
				return true;
			}
		}
		return false;
	}
}