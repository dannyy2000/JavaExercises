package chapter3;

public class Accountt {
    private String name;
    private double balance;

    public Accountt(String name, double balance) {

        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }
        public void deposit(double depositAmount){
            if (depositAmount > 0.0) {
                balance = balance + depositAmount;
            } else {
                this.balance = balance;
            }
        }
        public void withdrawal(double withdrawalAmount){
            if (withdrawalAmount <= balance) {
                balance = balance - withdrawalAmount;
            } if(withdrawalAmount > balance) {
                this.balance = balance;
                System.out.println("Withdrawal amount exceeded account balance");
            }

        }
        public void setName(String name){
           this.name = name;
        }
        public String getName(){
          return name;
        }
        public double getBalance(){
            return balance;
        }

}