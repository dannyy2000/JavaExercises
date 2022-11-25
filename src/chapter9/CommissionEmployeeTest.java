package chapter9;

import java.util.Scanner;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Akinsanya",
                "Daniel", "333-333-3333", 5000, 0.06, 300);

        System.out.printf("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",basePlusCommissionEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",basePlusCommissionEmployee.getLastName());
        System.out.printf("%s %.2f%n","Gross sales is",basePlusCommissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n","Commission rate is",basePlusCommissionEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n","Base salary is",basePlusCommissionEmployee.getBaseSalary());

        basePlusCommissionEmployee.setBaseSalary(1000);
        System.out.println(basePlusCommissionEmployee.earnings());

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                  basePlusCommissionEmployee.toString());


    }


}
