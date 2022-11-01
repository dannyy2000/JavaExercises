package Snacks;

import java.security.SecureRandom;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        //int guess = 500;
        String answer = " ";
        Scanner input = new Scanner(System.in);
        int counter = 0;

        SecureRandom random = new SecureRandom();
        int randoms = random.nextInt(1000);
        System.out.println(randoms);

        System.out.println("Enter a number btw 1 and 1000 ");
        int number = input.nextInt();

        while (randoms != number) {

            if (number > randoms) {
                System.out.println("too high");
            }
            else{
                System.out.println("too low");
                System.out.println("Enter a number btw 1 and 1000 ");
                number = input.nextInt();
            }
            System.out.println("Congratulations you guessed right");
            System.out.println("Do you want to play again");
            answer = input.next();
            if(answer.equals("yes")){
                System.out.println("Enter a number btw 1 and 1000 ");
                 number = input.nextInt();

                while (randoms != number) {

                    if (number > randoms) {
                        System.out.println("too high");
                    }
                    else{
                        System.out.println("too low");
                        System.out.println("Enter a number btw 1 and 1000 ");
                        number = input.nextInt();
                    }
                    System.out.println("Congratulations you guessed right");
                    System.out.println("Do you want to play again");
                    answer = input.next();

            }
            }
        }



    }
}