package chapter_9_Exercise;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HomeLoan homeLoan = new HomeLoan(2000_00.00,16,0.04);
        VehicleLoan vehicleLoan = new VehicleLoan(1000_00.00,10,0.09);
        PersonalLoan personalLoan = new PersonalLoan(900_00.00,5,0.05);

        System.out.println("Enter your loan amount: ");
        int loanAmount = input.nextInt();
        homeLoan.setLoanAmount(loanAmount);
        System.out.println();

        System.out.print("Enter the tenure of your Loan: ");
        int tenureAmount = input.nextInt();
        homeLoan.setLoanTenure(tenureAmount);

        System.out.println();

        System.out.println(homeLoan.toString());
    }
}
