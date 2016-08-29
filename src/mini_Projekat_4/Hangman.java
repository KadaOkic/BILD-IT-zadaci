/**
 * Game Hangman which picks a word from string array and asks user for a letter,
 * after uses "solves" the word it shows him how many mistakes he had.
 * After user solve or losses he is been asked whether to continue to play with another word.
 */
package mini_Projekat_4;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String playStats = "y";
		// while player wants to continue play-user enters y
		while (playStats.equals("y")) {
			// string array that contains words that are going to be randomized
			String[] words = { "otolaryngologist", "screw", "coin", "tube",
					"game", "pain", "victory", "defeat", "inspiration",
					"motive" };
			// user will guess the word which is selected randomly from the
			// array
			String word = words[(int) (Math.random() * words.length)];
			// char array that will be shown to user
			char[] secretWord = new char[word.length()];
			// fill array at the begining with "*"
			Arrays.fill(secretWord, '*');
			// maximum number of mistakes
			int counter = 7;
			while (counter > 0 && (!wordFinished(secretWord))) {
				printSecretWord(secretWord);
				System.out.println("Enter letter(guess):");
				char letter = input.next().charAt(0);
				boolean letterFound = false;
				// if letter is found we replace * with that letter in char
				// array
				for (int i = 0; i < secretWord.length; i++) {
					if (letter == word.charAt(i)) {
						secretWord[i] = letter;
						letterFound = true;
					}
				}

				// if the letter user entered is not part of the word we
				// increment
				// counter used
				// for counting mistakes
				if (!letterFound) {
					counter--;
					System.out.println("Letter is not in the word, you have "
							+ counter + " guesses");
				}
			}

			// if counter is equal to zero you lose
			if (counter == 0) {
				System.out.println("You lose");
				printHangman();
			} else {
				System.out.println("You won.You had " + counter + " mistakes.");
			}
			System.out
					.println("Do you want to guess another word? Enter y or n >");
			playStats = input.next();

		}
		input.close();
	}

	// metod checks if there is * left in the word it's not finished yet
	public static boolean wordFinished(char[] array) {
		int countStars = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '*') {
				countStars++;
			}

		}
		// if there is no more stars in the word-word is finished
		if (countStars == 0) {
			return true;
		} else {
			return false;
		}

	}

	// metod to print secret word
	public static void printSecretWord(char[] secretWord) {
		for (int i = 0; i < secretWord.length; i++) {
			System.out.print(secretWord[i]);
		}
		System.out.println();

	}

	// the look of the hangman when user losses
	public static void printHangman() {
		System.out.println("    ______ ");
		System.out.println("    |    | ");
		System.out.println("    O    | ");
		System.out.println("   /|\\   | ");
		System.out.println("   / \\   | ");
		System.out.println("  _______| ");

	}
}