package com.wof.ui;
import com.wof.model.Player;

import util.MyConsole;

public class WheelOfFortuneApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to Wheel Of Fortune");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			playGame();
			choice = MyConsole.promptString("Play again? (y/n): ");
		}
		MyConsole.printLine("Goodbye");
	}

	private static void playGame() {
		// ask each player for their name and create a player object
		int nbrOfPlayers = MyConsole.promptIntInRange("Enter number of players: ", 0, 4);
		for (int i = 0; i < nbrOfPlayers; i++) {
			String name = MyConsole.promptString("Enter player name: ");
			Player player = new Player(name);
		}
		// create a wheel object
		// create a puzzle object
		// loop until the puzzle is solved
		// each player takes a turn spinning the wheel
		// the player guesses a letter
		// if the letter is in the puzzle, the player earns the amount spun
		// if the letter is not in the puzzle, the turn is over
		// if the player spins bankrupt, the player loses all earnings
		// if the player spins lose a turn, the turn is over
		// if the player spins free play, the player gets to guess a letter without spinning
		// if the player solves the puzzle, the game is over
		
	}

}
