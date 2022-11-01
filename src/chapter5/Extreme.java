package chapter5;
// todo Write an application that finds the minimum and maximum amongst several
  // todo integers and then computes the sum of the two extremes. The user will be prompted to input how
    // todo  many values the application should ask the user to input

import java.util.Scanner;
public class Extreme {
    public static void main(String[] args) {
        int minimum = 999999999;
        int maximum1 = 0;
        int maximum2 = 1;
        int sum = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        while (counter != 5) {
            System.out.println("Enter an integer: ");
            int number = input.nextInt();

            if (number < minimum) {
                minimum = number;
            }

            if (number > maximum1) {
                maximum1 = number;
            }
            else if (number > maximum2) {
                maximum2 = number;
            }
                sum = maximum1 + maximum2;
                counter++;

        }
            if (counter == 5) {
                System.out.printf("The maximum of the numbers is:%d%n", maximum1);
                System.out.printf("The sum of the two extremes are %d%n", sum);
                System.out.printf("The minimum of the two extremes are %d%n", minimum);

            }


    }
}
