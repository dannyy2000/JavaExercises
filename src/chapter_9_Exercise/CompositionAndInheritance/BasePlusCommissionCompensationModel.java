package chapter_9_Exercise.CompositionAndInheritance;

public class BasePlusCommissionCompensationModel extends CompensationModel {


    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    private static   void validateGrossSales(double grossSales) {
        boolean grossSalesIsInvalid = grossSales < 0.0;

        if(grossSalesIsInvalid){
            throw new IllegalArgumentException("Gross sales must be > 0.0");
        }
    }

    public static void validateCommissionRate(double commissionRate) {
        boolean commissionRateIsInvalid = commissionRate <= 0.0 || commissionRate >= 1.0;

        if(commissionRateIsInvalid){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0 ");
        }
    }

    private void validateBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }



    @Override
    public double earnings() {
        return getBaseSalary() + (getGrossSales() * getCommissionRate());
    }
}
