package chapter3;

public class CarApplication{
    public static void main(String[] args){

        Car car1 = new Car("Toyota Camry","2020",20000.00);
        Car car2 = new Car("Acura","2018",12000.00);

        System.out.printf("Toyota camry %s price is: $%.2f%n",car1.getYear(),car1.getPrice());
        System.out.printf("Acura %s price is: $%.2f%n",car2.getYear(),car2.getPrice());
        System.out.printf("Applying a 5 percent discount on Toyota camry is: $%.2f%n",car1.getDiscount1());
        System.out.printf("Applying a 7 percent discount on Acura is: $%.2f%n",car2.getDiscount2());
    }
}