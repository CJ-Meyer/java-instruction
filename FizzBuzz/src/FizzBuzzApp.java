import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the FizzBuzz App");
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	System.out.print("Enter a number: ");
        	int nbr = sc.nextInt();
        	for (int i = 1; i<nbr;i++) {
        		if(i %15 == 0) 
        			System.out.println("FizzBuzz");
        		else if(i % 3 == 0) System.out.println("Fizz");
        		else if(i % 5 == 0) System.out.println("Buzz");
        		else System.out.println(i);
        	}
		sc.nextLine(); // clear the newline after nextInt()
        System.out.print("Continue? (y/n): ");
        choice = sc.nextLine();
        }
        sc.close();
        System.out.println("\nBYE!!");
	}

}
