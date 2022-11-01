package Chapter4;
import java.util.Scanner;

public class CreditLimitCal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" account number: ");
        int accNO = input.nextInt();
        System.out.println("balance at the end of the month");
        int balance = input.nextInt();
        System.out.println("total of all items charged by the customer this month");
        int charges = input.nextInt();
        System.out.println("total of all credits applied to the customers account this month");
        int totalCredit = input.nextInt();
        System.out.println("allowed credit limit");
        int creditLimit = input.nextInt();

        int newBalance = balance + charges - totalCredit;
        System.out.printf("The new  balance is %d%n",newBalance);

        if(newBalance < creditLimit){
            System.out.println("Credit limit exceeded");
        }
        else{
            System.out.printf("The new balance is %d%n",newBalance);
        }

    }
}
