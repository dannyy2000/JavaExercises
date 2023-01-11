package chapter_9_Exercise.CompositionAndInheritance;

public class TestApplication {
    public static void main(String[] args) {
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Daniel",
                "Akinsanya", "222-555-1222", new BasePlusCommissionCompensationModel(
                1500.00, 0.8, 850.20));

//        CompensationModel compensationModel = new BasePlusCommissionCompensationModel(1200.0,
//                0.8,200.50);

//        basePlusCommissionEmployee.setBasePlusCommissionCompensationModel(new BasePlusCommissionCompensationModel(1500,
//                0.9,1900.0));




        CommissionEmployee commissionEmployee = new CommissionEmployee("Oluwatomiwa", "Akinsanya"
                , "224-4556-1234", new CommissionCompensationModel(1200.50, 0.6));

        System.out.println(basePlusCommissionEmployee.earnings(new BasePlusCommissionCompensationModel(1500,
                0.8,850.20)));

        System.out.println(commissionEmployee.earnings(new CommissionCompensationModel(2000.0,
                0.6)));






    }
}