package chapter6;
import java.security.SecureRandom;
public class Craps {
    private static final SecureRandom randomNumber = new SecureRandom();

    private enum Status{Won,Lose,Continue};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;

        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN, YO_LEVEN -> gameStatus = Status.Won;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.Lose;
            default -> {
                gameStatus = Status.Continue;
                sumOfDice = myPoint;
                System.out.printf("my point is:%d%n",myPoint);
            }
        }

        while(gameStatus == Status.Continue){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint){
                gameStatus = Status.Won;

            } else if (sumOfDice == SEVEN) {
                gameStatus = Status.Lose;
            }
        }
        if(gameStatus == Status.Won){
            System.out.println("Player wins!!!");
        }
        else{
            System.out.println("Player lose!!");
        }
    }

    private static int rollDice() {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("player rolled %d + %d = %d%n",die1,die2,sum);

        return sum;
    }
}
