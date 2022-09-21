  package Snacks;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

        int counter = 0;

        Scanner input = new Scanner(System.in);


        String answer = "";
        do {
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.printf("the sum of the numbers is %d%n", sum);
            counter++;
            System.out.print("Do you wish to perform  another operation?(yes/no): ");
            answer = input.next();
        } while (answer.equals("yes"));


    }
}
