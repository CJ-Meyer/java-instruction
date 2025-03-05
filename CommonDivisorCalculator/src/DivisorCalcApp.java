import java.util.Scanner;

public class DivisorCalcApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Common Divisor Calculator!");
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            
            int a = x;
            int b = y;

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            System.out.println("Greatest common divisor: " + a);

            sc.nextLine(); // clear the newline after nextInt()
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }

        System.out.println("\nBYE!");
        sc.close();
    }
}
