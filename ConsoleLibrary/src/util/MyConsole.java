package util;

import java.util.Scanner;

public class MyConsole {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean promptBoolean(String prompt) {
		while (true) {
		System.out.println(prompt+"(y/n)");
		String value = sc.nextLine().trim();
		if(value.equalsIgnoreCase("y")||value.equalsIgnoreCase("yes")||value.equalsIgnoreCase("yep")) {return true;}
		else if(value.equalsIgnoreCase("n")||value.equalsIgnoreCase("no")||value.equalsIgnoreCase("nope")) {return false;}
		else {System.out.println("Invalid input - try again"); continue;}
		}
	}
	
	public static int promptIntInRange(String prompt, int min, int max) {
		int nbr = promptInt(prompt);
		int result = 0;
		if (nbr > min && nbr < max) {
			result =nbr;}
			return result;
	}
	
	public static double promptDoubleInRange(String prompt, double min, double max) {
		double nbr = promptDouble(prompt);
		double result = 0;
		if (nbr > min && nbr < max) {
			result =nbr;}
			return result;
	}
	
	public static void printDivider(int nbr) {
		for(int i = 0; i<nbr;i++);
		System.out.print("-");
	}
	
	public static void printHeader(String title) {
	    int width = title.length(); 
	    String line = "=".repeat(width);
	    
	    int padding = (width - title.length()) / 2;
	    String paddedTitle = " ".repeat(Math.max(0, padding)) + title;

	    System.out.println(line);
	    System.out.println(paddedTitle);
	    System.out.println(line);
	}
	
	public static void animateDots(int seconds) {
	    try {
	        for (int i = 0; i < seconds; i++) {
	            int dotCount = i % 4; // cycles from 0 to 3
	            System.out.print("\rLoading" + ".".repeat(dotCount) + "   "); // overwrite previous text
	            Thread.sleep(500); // half-second delay for smoother effect
	        }
	        System.out.print("\rDone!            \n"); // Clear the line after animation
	    } catch (InterruptedException e) {
	        System.out.println("Animation interrupted.");
	    }
	}

	public static String promptString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
	
	public static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0.0;
		while (!isValid) {
		 System.out.print(prompt);
		 if(sc.hasNextDouble()) {
			 result = Double.parseDouble(sc.nextLine());
			 isValid = true;
		 } else{
			 System.err.println("Error - invalid entry. Try again.");
		 	 sc.nextLine();
		 }
		}
		return result;
	}
	
	public static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
		 System.out.print(prompt);
		 if(sc.hasNextInt()) {
			 result = Integer.parseInt(sc.nextLine());
			 isValid = true;
		 } else{
			 System.err.println("Error - invalid entry. Try again.");
		 	 sc.nextLine();
		 }
		}
		return result;
	}
	
	public static void print(String msg) {System.out.print(msg);}
	
	public static void printLine(String msg) {System.out.println(msg);}
	
	public static void printInt(int nbr) {System.out.println(nbr);}
}
