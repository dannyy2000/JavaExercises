package Practise;
import java.security.SecureRandom;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int number1 = 1 + random.nextInt(10);
        int number2 = 1 + random.nextInt(10);

        int answer = number1 + number2;

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + "+" + number2 + "=" + "?" );
        boolean result = input.hasNextBoolean();

            System.out.printf("%d + %d = %d%n, %B", number1, number2, answer,result);





    }
}
