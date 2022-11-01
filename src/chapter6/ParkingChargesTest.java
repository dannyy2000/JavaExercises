package chapter6;

import java.util.Scanner;

public class ParkingChargesTest {
    public static void main(String[] args) {
        ParkingCharges myParkingCharge = new ParkingCharges();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of customers: ");
        int numberOfCustomers = input.nextInt();

        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println("Enter customer name: ");
            String name = input.next();
            myParkingCharge.setNameOfCustomer(name);

            System.out.println("Enter no of hours to park for: ");
            double noOfHours = input.nextDouble();
            myParkingCharge.calculateCharges(noOfHours);
            System.out.println(myParkingCharge.getNameOfCustomer());
            myParkingCharge.displayCharges();
            System.out.println();
        }
    }
}
