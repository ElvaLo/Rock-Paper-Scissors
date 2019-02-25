package com.task.app;

import com.task.RockPaperScissors.*;
import java.util.Random;
import java.util.Scanner;

/**
 * JAVA programming language
 * @author Elva Lu
 *
 */
public class App {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		Scanner scanner = new Scanner(System.in);
		Player computer = new ComputerPlayer(new Random());
        Player human = new HumanPlayer(new Scanner(System.in));
        
        
        RockPaperScissors rps = new RockPaperScissors();
        do{
        rps.rockPaperScissors(computer.play(), human.play());
        System.out.println(computer.getMove() + " vs. " + human.getMove());
        } while(rps.playAgain(scanner));
	}

}
