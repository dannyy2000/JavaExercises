package Practise;

import java.util.Scanner;

public class ChargeParkingTest {
    public static void main(String[] args) {
        ChargeParking myCharge = new ChargeParking();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no of customer: ");
        int numberOfCustomer = input.nextInt();

        for (int counter = 0;counter < numberOfCustomer;counter++){
            System.out.println("Enter the name of the customer: ");
            String name = input.next();
            myCharge.setNameOfCustomer(name);
            System.out.println("Enter the number of hours: ");
            double numberOfHours = input.nextDouble();
            System.out.println(myCharge.getNameOfCustomer());
            myCharge.calculateCharges(numberOfHours);
            myCharge.displayCharges();
            System.out.println();
        }
    }
}
