package Practise;

public class CreditLimit {
    private int balance;
    private int charges;
    private int credits;
    private int creditLimits;


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void setCreditLimits(int creditLimits){
        this.creditLimits = creditLimits;
    }
    public int getBalance(){
        return balance;
    }
    public int getCharges(){
        return charges;
    }
    public int getCredits(){
        return credits;
    }
    public int getCreditLimits(){
        return creditLimits;
    }
    public int newBalance(){
        return getBalance() + getCharges() - getCredits();
    }
    public boolean isExceeded(){
        if (newBalance() > getCreditLimits()){
            return true;
        }
      else {
            return false;
        }
    }
}
