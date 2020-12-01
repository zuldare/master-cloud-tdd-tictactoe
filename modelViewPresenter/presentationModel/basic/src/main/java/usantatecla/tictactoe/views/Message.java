package usantatecla.tictactoe.views;

import usantatecla.utils.Console;

public enum Message {
  	TITLE("--- TIC TAC TOE ---"),
	NUMBER_PLAYERS("Number of user"), 
	SEPARATOR("-------------"), 
	VERTICAL_LINE_LEFT("| "), 
	VERTICAL_LINE_CENTERED(" | "),
	VERTICAL_LINE_RIGHT(""), 
	ENTER_COORDINATE_TO_PUT("Enter a coordinate to put a token:"),
	ENTER_COORDINATE_TO_REMOVE("Enter a coordinate to remove a token:"), 
	COORDINATE_TO_PUT("Coordinate to put"),
	COORDINATE_TO_REMOVE("Origin coordinate to move"), 
	COORDINATE_TO_MOVE("Target coordinate to move"),
	PLAYER_WIN(" Player: You win!!! :-)"), 
	RESUME("Do you want to continue");

	private String message;

	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void write() {
		Console.getInstance().write(this.message);
	}

	public void writeln() {
		Console.getInstance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
  }

}
