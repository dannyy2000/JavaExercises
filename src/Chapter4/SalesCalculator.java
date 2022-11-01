package Chapter4;
import java.util.Scanner;
public class SalesCalculator {

    public static void main(String[] args) {
        double soldItem = 0.0;
       // double total = 0.0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the quantity of item sold or -1 : ");
        double item = input.nextDouble();


        //int quantity = 0;
        while (item != -1) {
            soldItem = soldItem + item;
            counter = counter + 1;

             System.out.println("Enter the value of items or -1: ");
            item = input.nextInt();

        }


        double earnings = 200 + (0.09 * soldItem);
        System.out.printf("The total earnings is: %.2f%n", earnings);
    }
}
