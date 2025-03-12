package com.wof.model;

public class Player {
	private String name;
	private int totalScore;
	private int roundScore;
	
	public Player(String name) {
		this.name = name;
		this.totalScore = 0;
		this.roundScore = 0;
	}

	public String getName() {
		return name;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int getRoundScore() {
		return roundScore;
	}

	public void setName(String name) {
		this.name = name;
	}


	
}
