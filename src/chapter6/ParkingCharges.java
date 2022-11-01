package chapter6;

public class ParkingCharges {
    private String nameOfCustomer;
     private double noOfHours;

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public double calculateCharges(double noOfHours){
        this.noOfHours = noOfHours;
        double charges = 0;
        double minimumCharge = 2.00;
        if(noOfHours <= 3){
            charges += minimumCharge;
        }
        else if (noOfHours > 3){
            double extraHours = (noOfHours - 3) * 0.5;
             //extraHours * 0.5;
            charges = extraHours + minimumCharge;
        }
        return charges;
    }

    public void displayCharges(){
        System.out.printf("Customer charge is:%.2f", calculateCharges(noOfHours));
    }


}
