/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows:
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; 
 * if the sum is 7 or 11 (called natural), you win; 
 * if the sum is another value(i.e., 4, 5, 6, 8, 9, or 10), a point is established.
 * Continue to roll the dice until either a 7 or the same point value is rolled. 
 * If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player.
 */
package miniProjekat;

public class GameCraps {

	public static void main(String[] args) {

		int sum = rollTwoDice();
		if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose.");
		} else if (sum == 7 || sum == 11) {
			System.out.println("You win.");
		} else {
			int point = sum;
			System.out.println("Point is: " + point + " roll again.");
			sum = rollDice();
			if (point == sum) {
				System.out.println("You got " + sum + ". You win.");
			} else {
				System.out.println("You got " + sum + ". You lose.");
			}
		}
	}

	// Method rollDice
	public static int rollDice() {
		// Generate a random number between 1 to 6
		return (int) (1 + Math.random() * 6);
	}

	// Method printRoll prints the sum of the two dice
	public static int rollTwoDice() {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}

}
