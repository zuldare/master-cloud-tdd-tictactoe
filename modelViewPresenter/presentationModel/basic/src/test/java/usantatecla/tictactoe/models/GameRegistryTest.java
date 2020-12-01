package usantatecla.tictactoe.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameRegistryTest {

    private GameRegistry gameRegistry;

    private Game game;

    @BeforeEach
    private void beforeTest(){
        this.game = new Game();
    }

    @Test
    public void testGameRegistry(){
        this.gameRegistry = new GameRegistry(this.game);
        assertNotNull(this.gameRegistry);
    }
}
