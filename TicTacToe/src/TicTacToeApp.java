import util.MyConsole;

public class TicTacToeApp {
	static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
	static String boardBoarder = " +---+---+---+";

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Tic Tac Toe App");

		displayBoard();
		startGame();
		

		// Ask player for a row or column
		// place either X or O depending on who's turn it is
		// Validate the location chosen is empty
		// check for a winner (3 in a row)
		// repeat until someone wins or the board is full

		MyConsole.printLine("\nBYE!");
	}
	// player turn method

	private static void startGame() {
		int row = 0;
		int column = 0;
		boolean winner = false;
		int turns = 0;
		while (!winner && turns < 9) {
			
			if (turns % 2 == 0) {
				MyConsole.printLine("X's turn");
				row = MyConsole.promptInt("Enter row: ")-1;
				column = MyConsole.promptInt("Enter column: ")-1;
				if (board[row][column].equals("X") || board[row][column].equals("O")) {
					MyConsole.printLine("Invalid location. Try again.");
					continue;
				} else {
					board[row][column] = "X";
				}
			} else if (turns % 2 == 1) {
				MyConsole.printLine("O's turn");
				row = MyConsole.promptInt("Enter row: ")-1;
				column = MyConsole.promptInt("Enter column: ")-1;
				if (board[row][column].equals("X") || board[row][column].equals("O")) {
					MyConsole.printLine("Invalid location. Try again.");
					continue;
				} else {
					board[row][column] = "O";
				}
			}
			turns++;
			displayBoard();
			winner = checkForWinner();
		}
	}

	private static boolean checkForWinner() {
		// check rows
		for (int r = 0; r < board.length; r++) {
			if (board[r][0].equals(board[r][1]) && board[r][0].equals(board[r][2]) && !board[r][0].equals(" ")) {
				MyConsole.printLine(board[r][0] + " wins!");
				return true;
			}
			
		}
		// check columns
		for (int c = 0; c < board[0].length; c++) {
			if (board[0][c].equals(board[1][c]) && board[0][c].equals(board[2][c]) && !board[0][c].equals(" ")) {
				MyConsole.printLine(board[0][c] + " wins!");
				return true;
			}
		}
		// check diagonals
		if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals(" ")) {
			MyConsole.printLine(board[0][0] + " wins!");
			return true;
		}
		if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].equals(" ")) {
			MyConsole.printLine(board[0][2] + " wins!");
			return true;
		}
		return false;
	}
	private static void displayBoard() {
		String boardRow = "| 1 | 2 | 3 |";
		String boardString ="   1   2   3\n"+ boardBoarder + "\n";

		// loop through the rows
		for (int r = 0; r < board.length; r++) {
			// loop through the columns
			boardString += (r+1) + "|";
			for (int c = 0; c < board[r].length; c++) {
				boardString += " " + (board[r][c]) + " |";
			}
			boardString += "\n" + boardBoarder + "\n";
		}
		MyConsole.printLine(boardString);
	}

}
