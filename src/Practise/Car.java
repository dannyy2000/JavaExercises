package Practise;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        int counter = 0;


        Scanner input = new Scanner(System.in);

        System.out.println(">");
        String enter = input.next();

        while (counter <= 5) {
            if (enter.equals("help")) {
                System.out.println("""
                        1. Start
                        2.Stop
                        3.Quit
                        """);
            } else {
                System.out.println("I do not understand");
            }

            System.out.println(">");
            String enter1 = input.next();
            if (enter1.equals("Start")){
                System.out.println("Ready to start");
            }
            else{
                System.out.println("i do not understand");
            }
            System.out.println(">");
            String enter2 = input.next();
            if (enter2.equals("Stop")){
                System.out.println("Car stopped");
            }
            else{
                System.out.println("i do not understand");
            }
            System.out.println(">");
            String enter3 = input.next();
            if (enter3.equals("Quit")){
                System.out.println();
                break;
            }
            counter++;


        }


    }

}