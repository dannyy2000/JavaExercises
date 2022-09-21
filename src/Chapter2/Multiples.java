package Chapter2;
import java.util.Scanner;
public class Multiples {

        public static void main(String[] args){

            int number1;
            int number2;

            Scanner input = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            number1 = input.nextInt();

            System.out.print("Enter second integer: ");
            number2 = input.nextInt();

            if (number1 * 3 % number2 * 2 == 0)
                System.out.printf("%d tripled is a multiple of %d%n doubled",number1,
                        number2);
            if (number1 * 3 % number2 * 2 != 0)
                System.out.printf("%d tripled is not a multiple of %d%n doubled",number1,
                        number2);
        }
    }

