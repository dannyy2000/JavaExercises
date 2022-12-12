package tdd.chapter8_Exercises;

import chapter8_Exercises.SavingsAccounts;

public class Main {
    public static void main(String[] args) {

        SavingsAccounts saver1 = new SavingsAccounts(2000.00);
        SavingsAccounts saver2 = new SavingsAccounts(3000.00);
        SavingsAccounts.modifyInterestRate(4);
        System.out.println(saver1.toString());
        System.out.println();
        SavingsAccounts.modifyInterestRate(5);
        System.out.println(saver2.toString());
        System.out.println();

//        saver1.setBalance(1000);
//        saver2.setBalance(500);
        System.out.println("Saver1 your new balance is:" + saver1.newBalance());
        System.out.println();
        System.out.println("Saver2 your new balance is:" + saver2.newBalance());
    }
}
