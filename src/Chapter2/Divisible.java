package Chapter2;
import java.util.Scanner;
public class Divisible {

    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int number;

            System.out.print("Enter the integer: ");
            number = input.nextInt();

            if (number % 3 == 0)
                System.out.printf("%d is divisible by 3",number);

            if (number % 3 != 0)
                System.out.printf("%d is not divisible by 3",number);

        }
    }

