import java.util.Scanner;

public class MethodsApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the methods!\n");
		int x = promptInt("Enter number x: ");
		int y = promptInt("Enter number y: ");

		int sum = x + y;
		System.out.println("sum = " + sum);

		// divide two doubles
		// get two doubles, divide them, and print the result
		// create a method called promptDouble

		System.out.println(promptDouble("Enter two doubles: "));

		sc.close();
		System.out.println("\nBYE!!");
	}
	// use data validation
	private static double promptDouble(String prompt) {
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
	// use exception handling
	private static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			try {
				System.out.println(prompt);
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} catch (Exception e) {
				System.err.println("Error - invalid entry. Try again.");
			}
		}
		return result;
	}

}
