package Snacks;
import java.util.Scanner;
public class FactorialNumber {

    public static void main(String[] args) {
        int fact = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        for (int count = 1; count<= number; count++){
            fact *= count;
        }
        System.out.printf("%n the factorial of the number is:%d",fact);

        }

    }

