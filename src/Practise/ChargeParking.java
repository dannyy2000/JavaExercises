package Practise;

public class ChargeParking {
    private String nameOfCustomer;
    private double numberOfHours;

    public void setNameOfCustomer(String nameOfCustomer){
        this.nameOfCustomer = nameOfCustomer;
    }
    public String getNameOfCustomer(){
        return nameOfCustomer;
    }

    public double calculateCharges(double numberOfHours){
        this.numberOfHours = numberOfHours;
        double charges = 0;
        double minimumFee = 2.00;
        
        if(numberOfHours <= 3){
            charges += minimumFee;
        } else if (numberOfHours > 3) {
            double additionHours = (numberOfHours - 3) * 0.5;
            charges = additionHours  + minimumFee;
        }
        return charges;
    }
    public void displayCharges(){
        System.out.printf("The charge for the customer is %s",calculateCharges(numberOfHours));
    }
}
