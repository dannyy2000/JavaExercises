package chapter10_exercices.PayrollSystem;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales,
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
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f%n%s: $%.2f%n","Base-salaried",super.toString()
                ,"Base salary",getBaseSalary(),"The total earnings",earnings());
    }
}
