package chapter5;

import java.util.Scanner;

// todo Write an application that calculates the sum of those integers between 1 and 30 that are divisible by 3
public class Divisible {
    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        //System.out.println("Enter an integer:");
        //int number = input.nextInt();

        int number = 0;
        while (number != 30) {
            System.out.println("Enter an integer:");
            number = input.nextInt();

            if (number % 3 == 0) {
                System.out.println("it is divisible by 3");
                sum += number;
            } else
                System.out.println("It is not divisible by 3");

            //sum += number;
            counter++;
        }
        if (number == 30) {
            System.out.printf("The sum of integers that are divisible by 3 is: %d%n", sum);
        }
    }
}