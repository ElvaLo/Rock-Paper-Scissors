package com.task.RockPaperScissors;

import java.util.Scanner;

/**
 * JAVA programming language
 * @author Elva Lu
 *
 */
public class RockPaperScissors {

	/**
	 * Method will determine winner
	 * 
	 * @param computer
	 * @param human
	 */
	public void rockPaperScissors(int computer, int human) {
		if (computer == human) {
			draw();
		} else if ((computer + 1) % 3 == human) {
			youWin();
		} else {
			computerWin();
		}
	}

	/**
	 * Method will ask user whether play again
	 * 
	 * @param scanner
	 * @return boolean play or not play again
	 */
	public boolean playAgain(Scanner scanner) {
		System.out.println("Would you like to play again? Y(8), N(9)?");
		switch (scanner.nextInt()) {
		case 8:
			System.out.println("Rock, Paper, Scissors!");
			return true;
		default:
			System.out.println("Thanks for playing!");
			return false;
		}
	}

	private void draw() {
		System.out.print("It's tight! ");
	}

	private void youWin() {
		System.out.print("You win! ");
	}

	private void computerWin() {
		System.out.print("You lose! ");
	}
}
