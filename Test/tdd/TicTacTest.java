package tdd;

import Snacks.TicTac;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class TicTacTest {

    @BeforeEach
    public void setUp(){

    }

    @Test
    public void testThatGameExists(){
        TicTac game = new TicTac();
        assertNotNull(game);
    }

    @Test
    public void displayBoardTest(){
        TicTac game = new TicTac();
        game.displayBoard();
    }

    @Test
    public void makeMoveTest(){
        TicTac game = new TicTac();
        game.displayBoard();
        game.makeMove("x",9);

    }
    @Test
    public void clearMoveTest(){
        TicTac game = new TicTac();
        game.makeMove("x",5);
        game.clearMove();
    }

    @Test
    public void gameStatusTest(){
        TicTac game = new TicTac();
        game.makeMove("o",1);
        game.makeMove("o",2);
        game.makeMove("o",3);
        System.out.println(game.isWin());
    }
}
