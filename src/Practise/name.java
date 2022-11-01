package Practise;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();

        if (name.length() < 3){
            System.out.println("Name must be 3 characters long");
        } else if (name.length() > 50) {
            System.out.println("name can be a maximum of 50 characters long");
        }
        else
            System.out.println("name looks good");
    }
}
