package Chapter4;
// The sales person recieves $200 per week plus 9% of their gross sale
import java.util.Scanner;
public class SalesCommission {

    public static void main(String[] args) {
       // double item1 = 239.99;
        int Total = 0;
        int counter = 0;
        Total += counter*counter;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item: ");
        double item = input.nextDouble();
        for(int i=0; i<item; i++){

        }


        while(item != -1){
            item += Total;
            counter += counter;
            System.out.println("Enter the item");
             item = input.nextDouble();
        }
        while(counter != 0){
            double earnings = 200 + (0.09 * item);
            System.out.printf("The earnings is %.2f%n",earnings);
        }

    }
}
