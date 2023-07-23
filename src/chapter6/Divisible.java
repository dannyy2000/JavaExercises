package chapter6;

import java.util.Scanner;

public class Divisible {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            boolean result = isDivisible(number);
            if(result){
                System.out.println("it is divisible by 5");
            }
            else {
                System.out.println("it is not divisible by 5");
            }

        }
    }

    private static boolean isDivisible(int number) {
        return number % 5 == 0;
    }
}
