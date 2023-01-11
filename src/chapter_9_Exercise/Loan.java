package chapter_9_Exercise;

public class Loan {
    private double loanAmount;
    private double loanTenure;


    public Loan(double loanAmount, double loanTenure) {
        this.loanAmount = loanAmount;
        this.loanTenure = loanTenure;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(int loanTenure) {
        this.loanTenure = loanTenure;
    }

    public String toString(){
        return String.format("%s:  %s%n%s:  %s","The loan amount is:",loanAmount,
                "The tenure of the loan is:",loanTenure);
    }




}
