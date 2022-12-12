package tdd;

import chapter8.TicTaCToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @BeforeEach
    public void setUp(){

    }

    @Test
    public void testThatGameExists(){
        TicTaCToe game = new TicTaCToe();
    }

    @Test
    public void displayBoardTest(){
        TicTaCToe game = new TicTaCToe();
        game.displayBoard();
    }

    @Test
    public void makeMoveTest(){
        TicTaCToe game = new TicTaCToe();
        game.displayBoard();
        game.makeMove("x",6);
    }

    @Test
    public void clearBoardTest(){
        TicTaCToe game = new TicTaCToe();
        game.makeMove("o",5);
        game.makeMove("o",2);
        game.makeMove("o",8);
        game.clearBoard();
    }

    @Test
    public void gameStatusTest(){
        TicTaCToe game = new TicTaCToe();
        game.makeMove("x",1);
        game.makeMove("x",2);
        game.makeMove("x",3);

        System.out.println(game.isWin());
    }
}
