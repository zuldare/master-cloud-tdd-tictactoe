package usantatecla.tictactoe.models;

public class GameMemento {

    private Board board;
    private Turn turn;

    public GameMemento(Board board, Turn turn){
        this.board = board;
        this.turn =  turn;
    }

    public Board getBoard() {
        return board;
    }

    public Turn getTurn() {
        return turn;
    }
}
