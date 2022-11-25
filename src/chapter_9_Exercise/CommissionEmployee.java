package chapter_9_Exercise;

import chapter_9_Exercise.BasePlusCommissionEmployee;

public class CommissionEmployee {


    private final String firstName;
    private final String lastName;

    private final String socialSecurityNumber;

    private double grossSales;

    private double commissionRate;

    private BasePlusCommissionEmployee basePlusCommissionEmployee;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate) {

        validateGrossSales(grossSales);
        validateCommissionRate(commissionRate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
//        this.basePlusCommissionEmployee = basePlusCommissionEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public BasePlusCommissionEmployee getBasePlusCommissionEmployee() {
        return basePlusCommissionEmployee;
    }

    public void setBasePlusCommissionEmployee(BasePlusCommissionEmployee basePlusCommissionEmployee) {
        this.basePlusCommissionEmployee = basePlusCommissionEmployee;
    }

    public static void validateCommissionRate(double commissionRate) {
        boolean commissionRateIsInvalid = commissionRate <= 0.0 || commissionRate >= 1.0;

        if(commissionRateIsInvalid){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0 ");
        }
     }

    private static   void validateGrossSales(double grossSales) {
        boolean grossSalesIsInvalid = grossSales < 0.0;

        if(grossSalesIsInvalid){
            throw new IllegalArgumentException("Gross sales must be > 0.0");
        }
    }

    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
 
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n",
                "base-salaried commission employee",firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales",grossSales, "commission rate", commissionRate
                );
    }
}
