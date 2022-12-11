package chapter_9_Exercise;

public class VehicleLoan extends Loan{
    private double interestRate;

    public VehicleLoan(double loanAmount, double loanTenure, double interestRate) {
        super(loanAmount, loanTenure);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double MonthlyInstallments(){
        return getLoanAmount() * (getInterestRate() * Math.pow(1 + getInterestRate(),getLoanTenure())) /
                Math.pow(1 + getInterestRate(),getLoanTenure()) - 1;
    }

    @Override
    public String toString(){
        return String.format("%s:  %s%n%s:  %s%n%s:  %s","The loan amount is:",getLoanAmount(),
                "The tenure of the loan is:",getLoanTenure(),"The expected  monthly installment",MonthlyInstallments());
    }
}
