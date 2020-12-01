package usantatecla.tictactoe.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

public class GameMementoTest {

    private GameMemento gameMemento;

    @Mock
    private Board board;

    @Mock
    private Turn turn;

    @BeforeEach
    private void beforeTest(){
        this.board = mock(Board.class);
        this.turn = mock(Turn.class);
    }

    @Test
    public void testGameMemento(){
        this.gameMemento = new GameMemento(board, turn);
        assertNotNull(this.gameMemento);
        assertNotNull(this.gameMemento.getBoard());
        assertNotNull(this.gameMemento.getTurn());
    }

}
