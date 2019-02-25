package com.task.RockPaperScissors;

/**
 * JAVA programming language
 * @author Elva Lu
 *
 */
public interface Player {
	String[] MOVE = new String[] { "Rock", "Paper", "Scissors" };

	int play();

	String getMove();
}
