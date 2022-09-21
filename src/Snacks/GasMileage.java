package Snacks;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {

        int counter = 0;
        int milesPerGallon = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles or -1 to quit: ");
        int miles = input.nextInt();

        System.out.print("Enter gallon or -1 to quit: ");
        int gallon = input.nextInt();

        while(miles != -1 && gallon != -1 ){
            System.out.print("Enter the miles or -1 to quit: ");
            miles = input.nextInt();
            System.out.print("Enter the gallon or -1 to quit: ");
            gallon = input.nextInt();
            milesPerGallon = miles / gallon;
            total += milesPerGallon;
            counter++;
        }
        if(counter!= 0) {
            double average = (double) total / counter;

            System.out.printf("The total trip is %d and the total miles per gallon is %d%n  ",counter, total);
            System.out.printf("The average miles per gallon is :%f%n ", average);
        }
        else{
            System.out.println("NO TRIP");
        }

    }
}
