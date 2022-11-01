package Chapter4;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {

        int largest = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        while(counter <= 10){
            System.out.println("Enter the number:");
             int number = input.nextInt();
             if(number > largest){
                 largest = number;
             }
            counter++;
        }
        System.out.printf("The largest of the number is:%d%n",largest);
    }
}
