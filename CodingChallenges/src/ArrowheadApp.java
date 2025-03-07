import util.MyConsole;

public class ArrowheadApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the arrowhead app");
		int nbr = MyConsole.promptInt("Enter a number for the length of arrowhead: ");
		for (int i = 0; i<=nbr;i++) {
			MyConsole.printLine("");
			for (int j = 0; j<=i;j++) {
			MyConsole.print(">");}
		}
		if (nbr % 2 == 0) {
			for (int i = 0;i<nbr+1;i++)
			MyConsole.printLine(">");}
		for (int i = 0; i<=nbr;i++) {
			MyConsole.printLine("");
			for (int j = nbr; j>=i;j--) {
			MyConsole.print(">");}
		}
	}

}
