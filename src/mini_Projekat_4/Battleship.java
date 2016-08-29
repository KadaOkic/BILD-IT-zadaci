/**
 * Game Battleship is a guessing game where player(user)
 * sets his ships on the boards and we randomize ships for computer and user can't see it. 
 * After that we switch turns between player and pc(turn for pc is instant).
 */
package mini_Projekat_4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Battleship {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// players field
		char[][] userShip = new char[10][10];
		// field with enemy ships, we can't see it
		char[][] enemyShip = new char[10][10];
		// field tha belong to enemy, we see our hits and misses
		char[][] enemyField = new char[10][10];
		// filling both visible fields with "waves"
		for (int i = 0; i < userShip.length; i++) {
			Arrays.fill(userShip[i], '~');
			Arrays.fill(enemyField[i], '~');
		}
		System.out.println("Enemy field");
		// printing initial fields
		printMatrix(enemyField);
		System.out.println("\n\n Your field");
		printMatrix(userShip);
		placeAllEnemyShips(enemyShip);
		placeAllUserShips(userShip);
		boolean win = false;
		// player and pc take turns until there is a winner(turn for pc is
		// instant).
		while (!win) {
			// in every turn we print both fields
			System.out.println("Enemy field");
			printMatrix(enemyField);
			System.out.println("\nYour field");
			printMatrix(userShip);
			fireUser(enemyShip, enemyField);
			fireEnemy(userShip);

			win = triumph(enemyShip);
			if (win) {
				System.out.println("All ships are destroyed, you won!");
			} else {
				win = triumph(userShip);
				if (win)
					System.out
							.println("All your ships are destroyed, you lost!");
			}
		}
	}

	// metod that prints matrix a 10x10 and prints number of rows and columns
	public static void printMatrix(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println("\t" + i);
		}
		System.out.println("0  1  2  3  4  5  6  7  8  9");
	}

	/*
	 * method that checks if it's possible to place ship horizontaly from
	 * initial coordinate row- row coordinate column- column coordinate a- 2D
	 * matrix ship- ship size.Metod returns true if there are no other ships in
	 * path
	 */
	public static boolean isFreeH(int row, int column, char[][] a, int ship) {
		if ((row > 10) || (column > (10 - ship))) {
			return false;
		}
		for (int i = 0; i < ship; i++) {
			if ((a[row][column + i] == 'O') || (a[row][column + i] == 'X')) {
				return false;
			}
		}
		return true;

	}

	/*
	 * method that checks if it's possible to place ship verticaly from initial
	 * coordinate row- row coordinate column- column coordinate a- 2D matrix
	 * ship- ship size. Metod returns true if there are no other ships in path
	 */
	public static boolean isFreeV(int row, int column, char[][] a, int ship) {
		// if the ship takes place out of bounds
		if ((row > (10 - ship)) || (column > 10)) {
			return false;
		}
		for (int i = 0; i < ship; i++) {
			if (a[row + i][column] == 'O') {
				return false;
			}
		}

		return true;
	}

	/*
	 * method that places user ships were user chooses how to place a - 2D
	 * matrixplacement 1 (horizontal) or 2 (vertical) and to enter coordinates
	 * row and column we show ship size to the user when we ask him for metod
	 * returns isGood=true if placement was successful
	 */
	public static void placeUserShip(char[][] a, int shipSize) {
		boolean isGood = false;
		int placement = 0;
		while (!isGood) {
			System.out
					.println("Choose how do you want to place your ship size "
							+ shipSize
							+ " (for horizontal enter-1 or for vertical enter 2) : ");
			do {
				placement = input.nextInt();
			} while (placement < 0 && placement > 3);
			int row = takeInput("Choose first coordinate(row) to place your ship(0-9): ");
			int column = takeInput("Choose second coordinate(column)to place your ship(0-9): ");
			// if the placement is 1 and if is free horizontaly write ship
			// horizontaly
			if (placement == 1) {
				if (isFreeH(row, column, a, shipSize)) {
					writeShipsH(row, column, a, shipSize);
					isGood = true;
				} else {
					// or else message
					System.out.println("Not posible to place the ship there");

				}
				// if the placement is 2 and if is free vertically write ship
				// vertically
			} else if (placement == 2) {
				if (isFreeV(row, column, a, shipSize)) {
					writeShipsV(row, column, a, shipSize);
					isGood = true;
				} else {
					System.out.println("Not posible to place the ship there");
				}
			}
		}
	}

	/*
	 * method that invokes method that will ask user to place his ships,
	 * depending on the size, also method prints updated matrix after every
	 * placement a - 2D matrix
	 */
	public static void placeAllUserShips(char[][] a) {
		// invoking method that asks user for ship placement depending on the
		// ship size a - 2D array(players field)
		placeUserShip(a, 2);
		printMatrix(a);
		placeUserShip(a, 3);
		printMatrix(a);
		placeUserShip(a, 3);
		printMatrix(a);
		placeUserShip(a, 4);
		printMatrix(a);
		placeUserShip(a, 5);
		printMatrix(a);

	}

	// Metod that writes ships into the matrix(sea) horizontal with this sign
	// 'O'
	public static void writeShipsH(int row, int column, char[][] a, int ship) {
		for (int i = 0; i < ship; i++) {
			a[row][column + i] = 'O';
		}
	}

	// Metod that writes ships into the matrix(sea) vertical with this sign
	// 'O'
	public static void writeShipsV(int row, int column, char[][] a, int ship) {
		for (int i = 0; i < ship; i++) {
			a[row + i][column] = 'O';
		}
	}

	/*
	 * method that places enemy ships randomly a - 2D matrix placement 1
	 * (horizontal) or 2 (vertical) and coordinates row and column and user
	 * does't see how enemy ships are set. metod returns isGood=true if
	 * placement was successful
	 */
	public static void placeEnemyShip(char[][] array, int ship) {
		boolean isGood = false;
		while (!isGood) {
			int placement = 1 + (int) (Math.random() * 2);
			int row = (int) (Math.random() * 10);
			int column = (int) (Math.random() * 10);

			if (placement == 1) {
				if (isFreeH(row, column, array, ship)) {
					writeShipsH(row, column, array, ship);
					isGood = true;
				}
			} else if (placement == 2) {
				if (isFreeV(row, column, array, ship)) {
					writeShipsV(row, column, array, ship);
					isGood = true;
				}
			}
		}

	}

	/*
	 * method that invokes method which randomly set ships, depending on the
	 * size, also method prints updated matrix after every placement a - 2D
	 * matrix
	 */
	public static void placeAllEnemyShips(char[][] a) {
		// invoking metod for placing one ship
		placeEnemyShip(a, 2);
		placeEnemyShip(a, 3);
		placeEnemyShip(a, 3);
		placeEnemyShip(a, 4);
		placeEnemyShip(a, 5);

	}

	/*
	 * method that deals with shooting, for user enemy- 2D array(enemy field we
	 * can't see) enemyField - 2D array(enemy field shown to player)
	 */
	public static void fireUser(char[][] enemy, char[][] enemyField) {
		// we take from the user coordinate to shoot at
		int row = takeInput("Enter first coordinate(row) 0-9 you want to fire at:");
		int column = takeInput("Enter second coordinate(column) 0-9 you want to fire at:");
		// if user shoots a part of ship we mark it with X
		if (enemy[row][column] == 'O') {
			enemy[row][column] = 'X';
			enemyField[row][column] = 'X';
			// if the user doesn't shoot a part ship we replace the wave '~'
			// with '*'
		} else {
			enemyField[row][column] = '*';
		}
	}

	/*
	 * method that deals with shooting, for enemy(PC)-2D array(user array-we see
	 * where the enemy randomly fired
	 */
	public static void fireEnemy(char[][] user) {
		boolean fired = false;
		// loop that prevents PC(enemy) to "fire" two times on the same spot
		while (!fired) {
			// random coordinate PC shoots
			int row = (int) (Math.random() * 10);
			int column = (int) (Math.random() * 10);
			// if the enemy shoots a part of ship we mark it with X
			if (user[row][column] == 'O' || user[row][column] == 'X') {
				user[row][column] = 'X';
				fired = true;
				// if enemy doesn't shoot a part ship we replace the wave '~'
				// with '*'
			} else if (user[row][column] == '~') {
				user[row][column] = '*';
				fired = true;
			}
		}
	}

	/*
	 * method that checks if there are "undamaged" ship pieces on the field a -
	 * 2D array that is beeing checked- returns true if there are no more ship
	 * parts undamaged(triumph)
	 */
	public static boolean triumph(char[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 'O') {
					return false;
				}
			}
		}

		return true;

	}

	// taking input from the user and check it
	public static int takeInput(String message) {
		System.out.print(message);
		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();
				// choosing coordinate between 10 column and 10 rows (0- 9) to
				// place ships
				if (userInput >= 0 && userInput <= 9) {
					isGood = true;
				} else {
					// if user enters number smaller then zero or bigger then 9
					System.out.print("You fool, you miss the sea!Try again(0-9):");
				}
			} catch (InputMismatchException ex) {
				System.out.print("Try again. ("
						+ "Invalid input: Enter an integer(0-9) :");
				isGood = false;
				// final statements
			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}