package Snacks;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        if(number % 2 == 1){
            System.out.println("The number is  prime number");
        }
        else {
            System.out.println("The number is a prime number");
        }
        }

        }



