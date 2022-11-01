package Tdd;

public class DannyAccount {
    private int balance;

    public void deposit(int depositAmount) {
        balance = balance + depositAmount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean depositAboveZero(int depositAmount) {
        if(depositAmount > 0.0){
            return true;
        }
        else{
            return false;
        }

    }

    public void withdraws(int withdrawAmount) {
        balance = balance - withdrawAmount;
    }

    public boolean withdawalAbove500(int withdrawalAmount) {
        if (withdrawalAmount >= 500){
            return true;
        }
        else {
            return false;
        }
    }
}

