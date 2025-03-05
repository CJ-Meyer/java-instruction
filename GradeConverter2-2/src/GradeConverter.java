import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int grade;
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numerical grade: ");
			grade = sc.nextInt();
			if(grade>= 88) {System.out.println("Letter Grade: A");}
			else if(grade>= 80) {System.out.println("Letter Grade: B");}
			else if(grade>= 67) {System.out.println("Letter Grade: C");}
			else if(grade>= 60) {System.out.println("Letter Grade: D");}
			else{System.out.println("Letter Grade: F");}
			sc.nextLine();
			System.out.print("Continue? ");
			choice = sc.nextLine();
		}
		System.out.println("\nBye!");

	}

}
