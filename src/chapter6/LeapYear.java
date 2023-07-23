package chapter6;

import java.util.Scanner;

public class LeapYear {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean checkLeapYear = isLeapYears(year);
        if(checkLeapYear){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }

    private static boolean isLeapYears(int year) {
        return year % 4 == 0;
    }
}
