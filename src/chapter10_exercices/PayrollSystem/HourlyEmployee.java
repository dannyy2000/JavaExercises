package chapter10_exercices.PayrollSystem;

import chapter10_exercices.PayrollSystem.Employee;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        validateWage(wage);
        validateHour(hours);
        this.wage = wage;
        this.hours = hours;
    }

    private void validateHour(double hours) {
        if ((hours < 0.0) || (hours > 168.0))  throw new IllegalArgumentException("Hour must be >= 0.0 and <= 168.0");
    }

    private void validateWage(double wage) {
        if (wage < 0.0) throw new IllegalArgumentException("Wage must be >= 0.0");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        validateWage(wage);
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        validateHour(hours);
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return getWage() * getHours();
        } else return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
      return String.format("Hourly employee:%s%n%s: $%.2f; %s: $%.2f%n%s: $%.2f%n",super.toString(),"Hourly wage",
              getWage(),"Hours worked",getHours(),"The total earnings",earnings());
    }
}
