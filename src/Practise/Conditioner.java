package Practise;

import java.util.Scanner;

public class Conditioner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter an integer: ");
        int n = input.nextInt();

        if (n >= 1 && n <= 100) {
            boolean range1 = n >= 2 && n <= 5;
            boolean range2 = n >= 6 && n <= 20;
            boolean range3 = n > 20;

            if (n % 2 != 0) {
                System.out.println("Weird");
            }

            if (n % 2 == 0 && range1) {
                System.out.println("Not Weird");
            }

            if (n % 2 == 0 && range2) {
                System.out.println("Weird");
            }
            if (n % 2 == 0 && range3) {
                System.out.println("Not weird");
            }
        }
//


        // Just one STDOUT, see? Cleaner.
//
    }
}