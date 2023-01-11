package chapter10_exercices.PayrollSystem;

import chapter10_exercices.PayrollSystem.Employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);

        validateWeeklySalary(weeklySalary);
        this.weeklySalary = weeklySalary;
    }

    private void validateWeeklySalary(double weeklySalary) {
         if(weeklySalary < 0.0) throw new IllegalArgumentException("Weekly salary must be >=0.0");
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        validateWeeklySalary(weeklySalary);
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employee:%s%n%s:$%.2f%n%s:$%.2f%n",super.toString(),"weekly salary:",
                getWeeklySalary(),"The total earnings is",earnings());
    }
}
