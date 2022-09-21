package Snacks;
import java.util.Scanner;
public class LargestSmallest {

    public static void main(String[] args) {


        int smallest = 0;
        int largest = 0;

        Scanner input = new Scanner(System.in);
        String answer ="";

        do{
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            if(number < smallest) {
                smallest = number;
            }
           else if(number > largest){
                largest = number;
            }
            System.out.print("do you wish to continue(yes/no): ");
            answer = input.next();
        }while(answer.equals("yes"));

        System.out.printf("The smallest number is:%d%n",smallest);
        System.out.printf("The largest number is:%d%n",largest);

    }
}
