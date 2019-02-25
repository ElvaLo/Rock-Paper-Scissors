package com.task.RockPaperScissors;

import java.util.Random;

/**
 * JAVA programming language
 * @author Elva Lu
 *
 */
public class ComputerPlayer implements Player {

	private Random rand;
	private int random;

	public ComputerPlayer(Random random) {
		this.rand = random;
	}

	/**
	 * Method randomly choose a move for computer player
	 * 
	 * @return computer's move
	 */
	public int play() {
		int random = this.rand.nextInt(MOVE.length);
		this.setMove(random);
		return random;
	}

	public String getMove() {
		return MOVE[random];
	}

	private void setMove(int random) {
		this.random = random;
	}
}
