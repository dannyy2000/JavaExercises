package Chapter4;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

       int total = 0;
       int smallest = 999999999;
       int largest = 0;
       int counter = 0;

       Scanner input = new Scanner(System.in);

       while(counter != 7){
           System.out.print("Enter the number of cases: ");
           int number = input.nextInt();

           if(number < smallest){
               smallest = number;
           } else if (number > largest) {
               largest = number;
           }
           total += number;
           counter++;
       }
       if (counter == 7){
           int average = total / 7;
           System.out.printf("The total is %d%n",total);
           System.out.printf("The average is %d%n",average);
           System.out.printf("The smallest is %d%n",smallest);
           System.out.printf("The largest is %d%n",largest);

       }
    }
}
