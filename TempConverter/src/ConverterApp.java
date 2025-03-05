import java.util.Scanner;

public class ConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome ot the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		double degrees;
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter degrees in Fahrenheit: ");
			degrees = sc.nextDouble();
			double celcius = (degrees-32)*5/9;
			System.out.println("Degrees in celcius: "+(double)Math.round(celcius*100)/100);
			
			sc.nextLine();
			System.out.print("Continue? ");
			choice = sc.nextLine();
		}
		System.out.println("\nBye!");
	}

}
