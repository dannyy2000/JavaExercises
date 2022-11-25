package chapter_9_Exercise;

//import chapter8.Human;

public class BasePlusCommissionEmployee {
    private  double grossSales;
    private  double commissionRate;
    private  String socialSecurityNumber;
    private  String lastName;
    private String firstName;

    private CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(CommissionEmployee commissionEmployee,double baseSalary) {
         firstName = commissionEmployee.getFirstName();
          lastName = commissionEmployee.getLastName();
          socialSecurityNumber = commissionEmployee.getSocialSecurityNumber();
          commissionRate = commissionEmployee.getCommissionRate();
          grossSales = commissionEmployee.getGrossSales();

        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }


    private void validateBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }


    public double earnings(CommissionEmployee commissionEmployee){
        return getBaseSalary() + commissionEmployee.earnings();
    }

    public String toString(CommissionEmployee commissionEmployee) {
        return String.format("%s %s%n%s: %.2f", "base-salaried",commissionEmployee.toString(),
                "base-salary",getBaseSalary());

    }



}
