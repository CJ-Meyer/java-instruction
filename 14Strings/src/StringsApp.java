import util.MyConsole;

public class StringsApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Strings!!");

		String fullName = "Joseph Allen Hawes";

		// break into first, middle, last
		int firstSpace = fullName.indexOf(' ');
		int secondSpace = fullName.indexOf(' ', firstSpace + 1);

		MyConsole.printInt(firstSpace);
		MyConsole.printInt(secondSpace);

		// p.471
		String firstName = fullName.substring(0, firstSpace);
		String middleName = fullName.substring(firstSpace + 1, secondSpace);
		String lastName = fullName.substring(secondSpace + 1);

		MyConsole.printLine(firstName);
		MyConsole.printLine(middleName);
		MyConsole.printLine(lastName);

		// hangman hint - hiddenWord
		String theWord = "bird";
		String hiddenWord = "_".repeat(theWord.length());
		MyConsole.printLine("The word = " + theWord + ".");
		MyConsole.printLine("Hidden word = " + hiddenWord + ".");

		MyConsole.printLine("Resolve letters!");
		// loop until all letters guessed
		while (hiddenWord.indexOf("_") >= 0) {
			displayHiddenWord(hiddenWord);
			// guess a letter
			String guess = MyConsole.promptString("Letter guess: ");
			// resolve letter in hiddenWord or display message incorrect guesses
			char[] chars = theWord.toCharArray();
			char[] hiddenChars = hiddenWord.toCharArray();
			if (theWord.indexOf(guess.charAt(0)) == -1) {
				MyConsole.printLine("Incorrect guess");
			} else {
				for (int i = 0; i < chars.length; i++) {
					if (guess.charAt(0) == chars[i]) {
						hiddenChars[i] = guess.charAt(0);
					}
				}
				hiddenWord = String.valueOf(hiddenChars);
			}
		}
		

		MyConsole.printHeader("BYE!");
	}

	private static void displayHiddenWord(String hiddenWord) {
		// display hiddenWord with spaces for visibility and game design
		String hiddenWordDisplay = "";
		char[] chars = hiddenWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			hiddenWordDisplay += chars[i] + " ";
		}
		MyConsole.printLine("hidden word display = " + hiddenWordDisplay + ".");
	}

}
