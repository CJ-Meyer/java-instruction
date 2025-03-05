import java.util.Scanner;

public class PowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int integer;
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter integer: ");
			integer = sc.nextInt();
			for(int i=1;i<=integer;i++) {
				System.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
			}
			sc.nextLine();
			System.out.print("Continue? ");
			choice = sc.nextLine();
		}
		System.out.println("\nBYE!");
	}

}
