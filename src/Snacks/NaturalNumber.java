package Snacks;
import java.util.Scanner;
public class NaturalNumber {

    public static void main(String[] args) {

        int counter = 1;
        int total = 0;

        Scanner input = new Scanner(System.in);

        while(counter <= 10){
            System.out.print("Enter the first 10 natural number: ");
            int number = input.nextInt();
            if(number <= 10) {
                total += number;
            }
            counter++;
        }
        System.out.printf("The sum is: %d%n",total);
    }
}
