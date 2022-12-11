package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;



public class DivisionByZero {
    private static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            int numerator = input("Enter a numerator");
            int denominator = input("Enter a denominator");
// ("Your integer quotient is " + numerator / denominator);
//            System.out.println("\n".repeat(50));
        }
    }

    private static int input(String prompt) {
        System.out.println(prompt);
        int userInput = 0;
        try {
            return keyboardInput.nextInt();
        } catch (InputMismatchException daniel) {
            System.out.println("wrong input type");
            input(prompt);
        }
        return input(prompt);
    }
}
