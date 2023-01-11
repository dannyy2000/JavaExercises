package chapter10_exercices.AccountPayable;

public class BasePlusCommissionEmployees extends CommissionEmployee{

    private double baseSalary;



    public BasePlusCommissionEmployees(String firstName, String lastName, String ssn, double grossSales,
                                       double commissionRate, double baseSalary) {
                                 super(firstName, lastName, ssn, grossSales, commissionRate);
                                 validateBaseSalary(baseSalary);
                                 this.baseSalary = baseSalary;
    }

    private void validateBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be >= 0.0");
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }



}
