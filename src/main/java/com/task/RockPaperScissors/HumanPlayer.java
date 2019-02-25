package com.task.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

/**
 * JAVA programming language
 * @author Elva Lu
 *
 */
public class HumanPlayer implements Player {
	private final Scanner scanner;
	private int move;

	public HumanPlayer(Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * Method returns user's move
	 * 
	 * @return int of user move
	 */
	public int play() {
		System.out.println();
		System.out.println("Select 0 for Rock, 1 for Paper, 2 for Scissors");
		this.move = this.scanner.nextInt();
		// check the input from user
		while (this.move != 0 && this.move != 1 && this.move != 2) {
			System.out.println("Usage: Select 0 for Rock, 1 for Paper, 2 for Scissors");
			this.move = this.scanner.nextInt();
		}
		return move;
	}

	public String getMove() {
		return MOVE[move];
	}
}
