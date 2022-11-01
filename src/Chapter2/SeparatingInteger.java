package Chapter2;

import java.util.Scanner;

public class SeparatingInteger {
    public static void main(String[] args) {

        int digits1 ;
        int digits2;
        int digits3;
        int digits4;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer: ");
        int number = input.nextInt();

        digits1 = number % 10;
        digits2 = number % 100 / 10;
        digits3 = number % 1000 / 100;
        digits4 = number % 10000 / 1000;

        System.out.printf("%d %d %d %d",digits1,digits2,digits3,digits4);

    }
}
