package chapter3;

import java.util.Scanner;

public class AccountTest{
 public static void main(String[] args){

  Account account1 = new Account("Akinsanya daniel",50.00);
  Account account2 = new Account("Fanu samuel",-7.53);

  Scanner input = new Scanner(System.in);
   
  System.out.printf("Enter withdrawal amount for account1: ");
  double withdrawalAmount = input.nextDouble();
  account1.withdrawal(withdrawalAmount);

  System.out.printf("%s balance: $%.2f%n",
    account1.getName(), account1.getBalance());

  System.out.printf("Enter withdrawal amount for account2: ");
  withdrawalAmount = input.nextDouble();
  account2.withdrawal(withdrawalAmount);
  
  System.out.printf("%s balance: $%.2f%n",
    account2.getName(), account2.getBalance());
 
 }

}