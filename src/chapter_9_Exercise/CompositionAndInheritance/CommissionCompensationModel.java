package chapter_9_Exercise.CompositionAndInheritance;

public class CommissionCompensationModel extends CompensationModel {


    private double grossSales;
    private double commissionRate;


    public CommissionCompensationModel(double grossSales, double commissionRate) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
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


    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }
}
