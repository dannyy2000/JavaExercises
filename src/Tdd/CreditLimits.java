package Tdd;

public class CreditLimits {


    private int balance;
    private int charges;
    private int credits;
    private int creditLimits;


    public int newBalance(int balance,int charges,int credits) {
        return balance + charges - credits;
    }


    public boolean isExceeded(int balance,int charges,int credits, int creditLimits) {
        if(newBalance(balance,charges,credits) > creditLimits){
            return true;
        }
        else{
            return false;
        }
    }
}
