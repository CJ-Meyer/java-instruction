import util.MyConsole;

public class TicTacToeApp {
	static String[][] board = { { " ", " ", " " },
			 { " ", " ", " " },
			 { " ", " ", " " } };
	static String boardBoarder = "+---+---+---+";
	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Tic Tac Toe App");

		displayBoard();
		
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
		while (!winner && turns<9) {
			if (turns % 2 == 0) {}
			MyConsole.printLine("X's turn");
			row 
		} else if(turns % 2 == 1) {
			MyConsole.printLine("O's turn");
			
		}
	}
	
	private static void displayBoard() {
		String boardRow = "| 1 | 2 | 3 |";
		String boardString = boardBoarder+"\n";
		
		
		
		// loop through the rows
		for (int r = 0; r < board.length; r++) {
			// loop through the columns
			boardString += "|";
			for (int c = 0; c < board[r].length; c++) {
				boardString += " " + (board[r][c])+" |";
			}
			boardString += "\n"+ boardBoarder+"\n";
		}
		MyConsole.printLine(boardString);
	}

}
