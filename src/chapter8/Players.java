package chapter8;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Players {
    private final int[] madeMoves = new int[9];

    private int move;

    private int player1Score;

    private int player2Score;

    private Scanner input;

    private final TicTaCToe game = new TicTaCToe();

    private int gameCount = 1;

    private int player1Move;

    private int player2Move;

    public void player1() {
        input = new Scanner(System.in);
        try {
            System.out.print("Player1 your move: ");
            player1Move = input.nextInt();

            if (player1Move == -1) {
                System.out.printf("%nPlayer2 Win!!");
                ++player2Score;
                displayScore();
            } else if (!isNewMove(player1Move) || player1Move < 1 || player1Move > 9) {
                System.out.println("make new move");
                player1();
            } else {
                game.makeMove("x", player1Move);
                madeMoves[move] = player1Move;
                ++move;
            }

            if (game.isWin()) {
                System.out.println("Player1 win!!");
                ++player1Score;
                displayNext();
            }

        }
        catch (InputMismatchException e){
            System.out.println("make new move");
            player1();
        }
    }

     public void player2(){
         input = new Scanner(System.in);
         try {
             System.out.print("Player2 your move: ");
             player2Move = input.nextInt();

             if (player2Move == -1) {
                 System.out.printf("%nPlayer1 Win!!");
                 ++player1Score;
                 displayScore();
             } else if (!isNewMove(player2Move) || player2Move < 1 || player2Move > 9) {
                 System.out.println("make new move");
                 player2();
             } else {
                 game.makeMove("o", player2Move);
                 madeMoves[move] = player2Move;
                 ++move;
             }

             if (game.isWin()) {
                 System.out.println("Player2 win!!");
                 ++player2Score;
                 displayNext();
             }

         }
         catch (InputMismatchException e){
             System.out.println("make new move");
             player2();
         }
     }


        public void displayNext () {
        Scanner scanner = new Scanner(System.in);
            System.out.println("1---> next : -1---> quit");


            try{
                int next = scanner.nextInt();

                switch (next){
                    case 1 -> {
                        ++gameCount;
                        System.out.printf("%nRound %d%n",gameCount);
                        move = 0;
                        clearMove();
                        game.clearBoard();
                    }

                    case -1 ->{
                        displayScore();
                        move = 10;
                    }

                    default -> displayNext();
                }
            }
            catch (InputMismatchException e){
                displayNext();
            }
        }

    private void clearMove() {
        Arrays.fill(madeMoves,0);
    }

    private boolean isNewMove ( int position){
        boolean check = true;
        for(int number: madeMoves){
            if(number == position){
                check = false;
                break;
            }
        }
         return check;
        }

        private void displayScore () {
            System.out.printf("""
                              player1 score is %d
                              player2 score is %d%n""",player1Score,player2Score);
        }

    public int getPlayer1Move() {
        return player1Move;
    }

    public int getPlayer2Move() {
        return player2Move;
    }

    public int getMove() {
        return move;
    }

    public int getGameCount() {
        return gameCount;
    }
}
