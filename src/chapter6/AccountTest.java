package chapter6;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Akinsanya daniel",50.00);
        Account account2 = new Account("Fanu samuel",-7.53);
        
        displayAccount(account1,account2);


        Scanner input = new Scanner(System.in);


        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        displayAccount(account1,account2);

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);

        displayAccount(account1,account2);
    }

    private static void displayAccount(Account account1, Account account2) {
        System.out.printf("%s balance: $%.2f%n",account1.getName() ,account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(),account2.getBalance());
    }
}
