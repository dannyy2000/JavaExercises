package Practise;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number >= 100 && number <= 999){
            int digits1 = number / 100;
            int digits2 = number % 100 / 10;
            int digits3 = number % 100 % 10;
            sum = digits1 + digits2 + digits3;
            System.out.println(sum);
        }

        else if (number >= 10 && number <= 99) {
            int digits1 = number / 10;
            int digits2 = number % 10 ;
            sum = digits1 + digits2;
            System.out.println(sum);
        }
        else if (number >= 1 && number <= 9) {
            int digits1 = number;
            sum = digits1;
            System.out.println(sum);
        }
        else if (number == 1000) {
            int digits1 = number / 1000;
            int digits2 = number % 1000 / 100;
            int digits3 = number % 1000 % 100 / 10 ;
            int digits4 = number % 1000 % 100 % 10;
            sum = digits1 + digits2 + digits3 + digits4;
            System.out.println(sum);

        }
        else {
            System.out.println("The number is not in range");
        }
    }
}
