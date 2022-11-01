package chapter5;
//todo Modify the compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.00;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (double rate = 0.05; rate<=0.09;rate+=0.01){
        for (int year = 1; year <= 10; ++ year){
            //for (double rate = 0.05; rate<=0.09;rate+=0.01){
                double amount = principal * Math.pow(1.0 + rate,year);

                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            System.out.println();
        }
        //System.out.println();
    }
}
