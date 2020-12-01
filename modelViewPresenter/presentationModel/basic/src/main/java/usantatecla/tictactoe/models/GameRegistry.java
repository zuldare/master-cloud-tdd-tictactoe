package usantatecla.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

    private Game game;
    private int attempt;
    private List<GameMemento> gameMementos;

    public GameRegistry(Game game) {
        this.game = game;
        this.attempt = 0;
        this.gameMementos = new ArrayList<>();
    }

}
