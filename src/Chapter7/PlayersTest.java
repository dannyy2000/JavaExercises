package Chapter7;

import chapter8.Players;
import chapter8.TicTaCToe;

public class PlayersTest {
    public static void main(String[] args) {
        TicTaCToe game = new TicTaCToe();
        Players player = new Players();

        boolean isNext = true;

        System.out.printf("Round %d%n",player.getGameCount());
        game.displayBoard();
        while (player.getMove() <= 9){
            if(isNext){
                player.player1();

                if(player.getPlayer1Move() == -1){
                    break;
                }
            }

            if(!isNext){
                player.player2();

                if(player.getPlayer2Move() == -1){
                    break;
                }
            }

            isNext = !isNext;
            if(player.getMove() == 9){
                System.out.println("It is a draw");
                player.displayNext();
            }
        }
    }
}
