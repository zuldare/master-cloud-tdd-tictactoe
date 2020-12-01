package usantatecla.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

    private Game game;
    private GameMemento gameMemento;
    private int attempt;
    private List<GameMemento> gameMementos;

    public GameRegistry(Game game) {
        this.game = game;
        this.attempt = 0;
        this.gameMementos = new ArrayList<>();
    }

    public int getAttempt(){
        return this.attempt;
    }

    public List<GameMemento> getGameMementos(){
        return this.gameMementos;
    }

    public void undo(){
        this.attempt--;
        this.gameMemento = gameMementos.get(attempt);
    }

    public boolean isUndoable(){
        return this.attempt > 0;
    }
}
