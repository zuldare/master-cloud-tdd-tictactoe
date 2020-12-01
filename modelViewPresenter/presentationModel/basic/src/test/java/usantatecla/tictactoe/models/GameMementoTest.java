package usantatecla.tictactoe.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GameMementoTest {

    private GameMemento gameMemento;

    @Test
    private void testGameMemento(){
        this.gameMemento = new GameMemento();
        assertFalse(this.gameMemento != null);
    }

}
