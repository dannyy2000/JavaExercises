package Chapter2;
import java.util.Scanner;
public class ArirthmeticSmallestLargest {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int  number1;
            int number2;
            int number3;
            int sum;
            int average;
            int product;
            int smallest;
            int largest;

            System.out.print("Enter the first integer: ");
            number1 = input.nextInt();

            System.out.print("Enter the second integer: ");
            number2 = input.nextInt();

            System.out.print("Enter the third integer: ");
            number3 = input.nextInt();

            sum = number1 + number2 + number3;

            average = sum / 2;

            product = number1 * number2 * number3;

            smallest = number1;
            if (number2 < smallest) {
                smallest = number2;
            }
            if (number3 < smallest) {
                smallest = number3;
            }
            largest = number1;
            if (number2 > largest) {
                largest = number2;
            }
            if (number3 > largest) {
                largest = number3;
            }

            System.out.printf("The sum is %d%n: ",sum);
            System.out.printf("The average is %d%n: ",average);
            System.out.printf("The products is %d%n: ",product);
            System.out.printf("The smallest is %d%n: ", smallest);
            System.out.printf("The largest is %d%n: ",largest);
        }
}

