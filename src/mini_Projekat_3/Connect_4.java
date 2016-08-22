/**
 * (Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop colored disks into a seven-column, six-row vertically
 * suspended grid.
 * The objective of the game is to connect four same-colored disks in a row, a column,
 * or a diagonal before your opponent can do likewise.
 * The program prompts two players to drop a red or yellow disk alternately.
 * Whenever a disk is dropped, the program redisplays the board on the console and 
 * determines the status of the game (win, draw, or continue).
 */
package mini_Projekat_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Connect_4 {

	public static void main(String[] args) {

		char playersColor = 'Y';// yellow color for one player
		// matrix which will contain inputs from the user
		char[][] table = new char[6][7];
		// print blank board
		printTable(table);
		// while anyone doesn't win go through the loop
		while (!anyoneWin(playersColor, table)) {
			playersColor = assignColor(table, playersColor);

		}
	}

	// method to print table-the look
	public static void printTable(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				// if column is equal to 0 put | from the left side
				if (j == 0) {
					System.out.print("| ");
				}
				System.out.print(table[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("_____________________________");

	}

	// method in which we assign color(red-R, yellow-Y) to playersColor
	public static char assignColor(char[][] table, char playersColor) {
		// if there is not free places exit
		if (!canPlay(table)) {
			System.exit(1);
		}
		// drop disc in the column which user chooses
		int columnSelect = takeInput("Drop a " + playersColor
				+ " disc at column (0 - 6): ");
		// row-calling method find free row
		int row = findRow(table, columnSelect);
		// if the current place isn't empty print the message
		if (table[row][columnSelect] != '\u0000') {
			System.out.println("The row and column is occupied.");
		} else {
			// changing color to a playersColor in case of success in droping
			// disc otherwise repeat the same color
			table[row][columnSelect] = playersColor;
			if (playersColor == 'R') {
				playersColor = 'Y';
			} else {
				playersColor = 'R';
			}

		}
		// update table and return playersColor which is next
		printTable(table);
		return playersColor;
	}

	// method checks free row to place sign because it goes from up to bottom
	public static int findRow(char[][] table, int column) {
		int row = 0;
		// from 5 to 0
		for (int i = table.length - 1; i >= 0; i--) {
			// if i and column we seleceted if free return i else return row
			if (table[i][column] == '\u0000') {
				return i;
			}
		}
		// returns row
		return row;

	}

	// method that checks if the place is occuppied
	public static boolean canPlay(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] == '\u0000') {
					return true;
				}
			}
		}
		// if every place is filled(42 moves)
		System.out.println("It's a draw!");
		return false;
	}

	// method checks which playerColor won and prints it
	public static boolean anyoneWin(char playersColor, char[][] table) {

		if (diagonalWin(table) || rowsWin(table) || columnsWin(table)) {
			if (playersColor == 'R') {
				System.out.println("Y player won!");
			} else {
				System.out.println("R player won!");
			}
			return true;
		}
		return false;
	}

	// horizontal check
	public static boolean rowsWin(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length - 3; j++) {
				// if there are four consecutive equal color horizontal
				if (table[i][j] != '\u0000' && table[i][j] == table[i][j + 1]
						&& table[i][j + 1] == table[i][j + 2]
						&& table[i][j + 2] == table[i][j + 3]) {
					return true;

				}
			}
		}
		return false;
	}

	// vertical check
	public static boolean columnsWin(char[][] table) {
		for (int i = 0; i < table.length - 3; i++) {
			for (int j = 0; j < table[i].length; j++) {
				// if there are four consecutive equal color vertical
				if (table[i][j] != '\u0000' && table[i][j] == table[i + 1][j]
						&& table[i + 1][j] == table[i + 2][j]
						&& table[i + 2][j] == table[i + 3][j]) {
					return true;
				}
			}

		}
		return false;

	}

	// diagonal check
	public static boolean diagonalWin(char[][] table) {
		for (int i = 3; i < table.length; i++) {
			for (int j = 0; j < table[i].length - 3; j++) {
				// if there are four consecutive equal color in ascending
				// diagonal
				if (table[i][j] != '\u0000'
						&& table[i][j] == table[i - 1][j + 1]
						&& table[i - 1][j + 1] == table[i - 2][j + 2]
						&& table[i - 2][j + 2] == table[i - 3][j + 3]) {
					return true;

				}
			}
		}
		// descendingDiagonalCheck
		for (int i = 3; i < table.length; i++) {
			for (int j = 3; j < table[i].length; j++) {
				// if there are four consecutive equal color in descending
				// diagonal
				if (table[i][j] != '\u0000'
						&& table[i][j] == table[i - 1][j - 1]
						&& table[i - 1][j - 1] == table[i - 2][j - 2]
						&& table[i - 2][j - 2] == table[i - 3][j - 3]) {
					return true;

				}
			}
		}
		return false;
	}

	// taking input from the user and check it
	public static int takeInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				// choosing between 7 column (0- 6) to drop disc
				if (userInput >= 0 && userInput <= 6) {
					isGood = true;
				} else {
					System.out.print(message);
				}
			} catch (InputMismatchException ex) {
				System.out.print("Try again. ("
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