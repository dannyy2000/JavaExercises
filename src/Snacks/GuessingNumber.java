 package Snacks;
import java.util.Scanner;
public class GuessingNumber {
    public static void main(String[] args) {

        int randomNumber = 1;
        int countNumber = 0;

        Scanner input = new Scanner(System.in);


        while( countNumber != -1){
            countNumber++;
            System.out.print("Enter the number: ");
            int number = input.nextInt();

            if(number > randomNumber){
                System.out.println("Too high, try again!!");
            }
             else if(number < randomNumber) {
                System.out.println("Too low,try again!!");
            }
             else{
                 System.out.println("Perfect");
                 break;
            }

            }
        }

    }

