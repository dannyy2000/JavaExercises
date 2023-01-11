package chapter10_exercices.PayrollSystem;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        validateGrossSales(grossSales);
        validateCommissionRate(commissionRate);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    private void validateCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException
                ("commission rate must be >= 0.0 and <= 1.0");
    }

    private void validateGrossSales(double grossSales) {
        if(grossSales < 0.0) throw new IllegalArgumentException("gross sales must be >= 0.0");
    }

    public double getGrossSales() {
        validateGrossSales(grossSales);
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateCommissionRate(commissionRate);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f%n %s: $%.2f%n%s: $%.2f%n",
                "Commission employee",super.toString(),"Gross sales",getGrossSales(),
                "Commission rate",getCommissionRate(),"The total earnings is",earnings());
    }

}
