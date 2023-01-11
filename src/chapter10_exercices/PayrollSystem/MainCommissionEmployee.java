package chapter10_exercices.PayrollSystem;

public class MainCommissionEmployee {
    public static void main(String[] args) {

    CommissionEmployee commissionEmployee = new CommissionEmployee("Daniel","Akinsanya",
            "145656678",280.0,0.8);

    SalariedEmployee salariedEmployee = new SalariedEmployee("Richard","Essien","234908765",
            4002);

    HourlyEmployee hourlyEmployee = new HourlyEmployee("Tomiwa","Akinsanya","34907641",
            400.50,30);

    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Michael",
            "John","75689389",450.90,0.7,30.90);

    PieceWorker pieceWorker = new PieceWorker("Seun","Oduwole","353453678",400,10);


    Employee[] employees = new Employee[5];

    employees[0] = commissionEmployee;
    employees[1] = salariedEmployee;
    employees[2] = hourlyEmployee;
    employees[3] = basePlusCommissionEmployee;
    employees[4] = pieceWorker;

    for(Employee employee:employees) System.out.println(employee);


    }
}
