package com.wof.model;

public class Wheel {
	private int value;
	private String type;

	
//    ___________________
//   /         |         \
// / \         |         / \
//|    \       |       /    |
//|      \     |     /      |
//|        \   |   /        |   
//|__________\_|_/__________|
//|          / | \          |
//|        /   |   \        |
//|      /     |     \      |
//|    /       |       \    |
// \ /         |         \ /
//   \_________|__________/
	public Wheel(int value, String type) {
		this.value = value;
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public String getType() {
		return type;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Wheel [value=" + value + ", type=" + type + "]";
	}
}
