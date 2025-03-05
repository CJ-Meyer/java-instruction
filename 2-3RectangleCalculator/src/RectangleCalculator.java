import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Length: ");
			int L = sc.nextInt();
			System.out.println("Enter Width: ");
			int W = sc.nextInt();
			double area = L * W;
			double perimeter = 2*(L+W);
			System.out.println("Area: "+area);
			System.out.println("Perimeter: "+perimeter);
			sc.nextLine();
			System.out.print("Continue? ");
			choice = sc.nextLine();
		}
		System.out.println("\nBye!");
	}

}
