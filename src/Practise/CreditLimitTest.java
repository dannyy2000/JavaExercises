package Practise;

import java.util.Scanner;

public class CreditLimitTest {
    public static void main(String[] args) {

        CreditLimit myCl = new CreditLimit();
        Scanner input = new Scanner(System.in);

        System.out.println("balance at the beginning of the month: ");
        int balance = input.nextInt();

        System.out.println("total of all items charged by the customer this month: ");
        int charges = input.nextInt();

        System.out.println("total of all credits applied to the customer account this month: ");
        int credits = input.nextInt();

        System.out.println("allowed credits limits: ");
        int creditsLimit = input.nextInt();

        myCl.setBalance(balance);
        myCl.setCharges(charges);
        myCl.setCredits(credits);
        myCl.setCreditLimits(creditsLimit);

        myCl.newBalance();

        if(myCl.isExceeded()){
            System.out.println("Credits limit exceeded");
        }
    }
}
