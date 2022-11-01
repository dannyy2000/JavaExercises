package Chapter4;
import java.util.Scanner;
public class LargestNumber2 {
    public static void main(String[] args) {

        int largest = 0;
        int secLargest = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        while (counter <= 5) {
            System.out.println("Enter the number: ");
            int number = input.nextInt();

//            if(number > largest && number > secLargest){
//                largest = number;
//            }
//            if(number > secLargest && number < largest){
//                secLargest = number;
//            }


            if (number > secLargest) {
                largest = secLargest;
                secLargest = number;

            }
            if (number < secLargest) {
                if (number > largest) {
                    largest = number;

                }
                //counter++;
            }
            counter++;
            //System.out.printf("The largest of the numbers are:%d,%d%n",largest,secLargest);
        }
        System.out.printf("The largest of the numbers are:%d,%d%n", largest, secLargest);
    }
}
