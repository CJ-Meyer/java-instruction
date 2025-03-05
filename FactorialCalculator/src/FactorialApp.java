import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int integer;
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter integer greater than 0 and less than 10: ");
			integer = sc.nextInt();
			if(integer>=10 || integer<=0) {
				System.out.println("Number too big or too small try again");
				break;
			}
			int total = 1;
			for(int i=1;i<=integer;i++) {
				
				total *= i;
			}
			System.out.println("The factorial of "+integer+" is "+total);
			sc.nextLine();
			System.out.print("Continue? (y/n)");
			choice = sc.nextLine();
		}
		System.out.println("\nBYE!");

	}

}
