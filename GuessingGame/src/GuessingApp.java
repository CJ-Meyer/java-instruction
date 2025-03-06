import java.util.Scanner;

public class GuessingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the number guessing game");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from 1 to 100");
			int tries = 0;
			int nbr = (int) Math.round(Math.random()*100+1);
			System.out.println(nbr);
			System.out.print("Enter number: ");
			int guess = Integer.parseInt(sc.nextLine());
			if (guess != nbr) {
				tries += 1;
				if (Math.abs(guess-nbr)>10) {
					if (guess - nbr>10) {System.out.println("Way too high!");}
					else {System.out.println("Way Too low!");}
				} else if (Math.abs(guess-nbr)<10) {
					if (guess - nbr<0) {
						System.out.println("Too low!");
					} else {System.out.println("Too high!");}
				}
			} else {
				if (tries <= 3) {System.out.println("Great work! You are a mthemtaical wizard.");}
				else if (tries>3 && tries <=7) {System.out.println("Not too bad! you've got some potential.");}
				else {System.out.println("What took you so long? maybe you should take some lessons.");}
				}
			
			sc.nextLine();
			System.out.print("Continue? ");
			choice = sc.nextLine();
		}

	}

}
