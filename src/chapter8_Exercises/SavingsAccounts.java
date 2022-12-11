package chapter8_Exercises;

public class SavingsAccounts {
    private static double annualInterestRate;
      private double balance;

    public SavingsAccounts(double balance) {
        this.balance =  balance;
//        SavingsAccounts.annualInterestRate = annualInterestRate;
    }

    public double calculateMonthlyInterestRate() {
        int monthlyInterestRate = (int) (balance * annualInterestRate) / 12;

//        return monthlyInterestRate;
        return monthlyInterestRate;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public static double modifyInterestRate(double annualInterestRate) {
        return SavingsAccounts.annualInterestRate = annualInterestRate;
    }

    public String toString(){
        return String.format("%s: %.2f%n%s: %.2f"
                ,"Your annual interest rate is",SavingsAccounts.annualInterestRate,"Your monthly interest rate is",calculateMonthlyInterestRate());
    }

    public double newBalance() {
        balance = calculateMonthlyInterestRate() + balance;

        return balance;



    }
}
