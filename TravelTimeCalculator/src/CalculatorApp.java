import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome ot the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		double miles;
		double mph;
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			miles = sc.nextDouble();
			
			
			sc.nextLine();
			System.out.print("Continue? ");
			choice = sc.nextLine();
		}
		System.out.println("\nBye!");

	}

}
