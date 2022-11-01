package Practise;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int counter = 1;


        Scanner input = new Scanner(System.in);
        while (counter <  5) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number < minimum && number >= 0 && number <= 100) {
                minimum = number;
            } else if (number > maximum && number >= 0 && number <= 100) {
                maximum = number;
                counter++;
            }
        }
        System.out.printf("The minimum is:%d%n ",minimum);
        System.out.printf("The maximum is:%d%n ",maximum);
    }
    }

