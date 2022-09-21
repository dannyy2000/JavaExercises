package Chapter2;
 import java.util.Scanner;
public class Arithmetic {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int square1;
            int square2;
            int sum;
            int difference;

            System.out.print("Enter the first integer: ");
            number1 = input.nextInt();

            System.out.print("Enter the second integer: ");
            number2 = input.nextInt();

            square1 = number1 * number1;

            square2 = number2 * number2;

            sum = square1 + square2;

            difference = square1 - square2;

            System.out.printf("The square of each is %d%n: ",square1);

            System.out.printf("The square of each is %d%n: ",square2);

            System.out.printf("The sum of their squares is %d%n: ",sum);

            System.out.printf("The difference of the squares is %d%n: ", difference);
        }
    }

