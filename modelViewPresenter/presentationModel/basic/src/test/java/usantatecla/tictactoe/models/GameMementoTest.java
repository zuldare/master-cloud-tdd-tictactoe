package usantatecla.tictactoe.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameMementoTest {

    private GameMemento gameMemento;

    @Test
    public void testGameMemento(){
        this.gameMemento = new GameMemento();
        assertNotNull(this.gameMemento);
    }

}
