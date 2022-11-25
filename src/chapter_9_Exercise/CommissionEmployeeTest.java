package chapter_9_Exercise;

import chapter_9_Exercise.BasePlusCommissionEmployee;
import chapter_9_Exercise.CommissionEmployee;

public class CommissionEmployeeTest {
    public static void main(String[] args) {

//
        CommissionEmployee commissionEmployee = new CommissionEmployee("Daniel","Akinsanya",
                "333-333-333",5000,0.06);
       BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(commissionEmployee,2000);
        System.out.printf("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",commissionEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",commissionEmployee.getLastName());
        System.out.printf("%s %.2f%n","Gross sales is",commissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n","Commission rate is",commissionEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n","Base salary is",basePlusCommissionEmployee.getBaseSalary());

        basePlusCommissionEmployee.setBaseSalary(1000);
//        System.out.println(basePlusCommissionEmployee.earnings());

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                basePlusCommissionEmployee.toString());



    }
}