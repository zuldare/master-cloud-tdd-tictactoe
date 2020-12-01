package usantatecla.tictactoe.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class GameRegistryTest {

    private GameRegistry gameRegistry;

    private Game game;

    @BeforeEach
    private void beforeTest(){
        this.gameRegistry = new GameRegistry(new Game());
    }

    @Test
    public void testGameRegistry(){
        assertNotNull(this.gameRegistry);
    }

    @Test
    public void testInitializationIsOk(){
        assertTrue(this.gameRegistry.getAttempt() == 0);
        assertTrue(this.gameRegistry.getGameMementos().size() == 0);
    }

    @Test
    public void testIsUndoable(){
        assertFalse(this.gameRegistry.isUndoable());
    }

    @Test
    public void testUndo(){
        this.gameRegistry.undo();
        assertTrue(this.gameRegistry.getAttempt() == 0);
        assertTrue(this.gameRegistry.getGameMementos().size() ==0);
    }

}
