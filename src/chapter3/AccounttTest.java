package chapter3;

import java.util.Scanner;

public class AccounttTest {
    public static void main(String[] args) {
        Accountt accountt1 = new Accountt("David",70.00);
        Accountt accountt2 = new Accountt("Daniel",80.0);

        System.out.printf("The name on my account and balance is: %s and %f%n",accountt1.getName(),accountt1.getBalance());
        System.out.printf("The name on my account and balance is: %s and %f%n",accountt2.getName(),accountt2.getBalance());


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your withdrawal:");
        double withdrawalAmount = input.nextDouble();
        accountt1.withdrawal(withdrawalAmount);
        System.out.printf("my balance is %f%n",accountt1.getBalance());
        System.out.printf("my balance is %f%n",accountt2.getBalance());

        System.out.println();

        System.out.println("Enter your withdrawal:");
         withdrawalAmount = input.nextDouble();
        accountt2.withdrawal(withdrawalAmount);
        System.out.printf("my balance is %f%n",accountt1.getBalance());
        System.out.printf("my balance is %f%n",accountt2.getBalance());





    }
}
