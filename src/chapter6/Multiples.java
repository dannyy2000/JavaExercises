package chapter6;

import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int number1,int number2){

        return number2 % number1 == 0;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {

            System.out.println("Enter a number: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            boolean result = isMultiple(number1,number2);

            if(result){
                System.out.println("It is a multiple");
            }
            else{
                System.out.println("It is not a multiple");
            }

        }
    }
}
