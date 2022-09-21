package chapter6;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();
        myIphone.setColor("black");
        Iphone.setPrice(2000.00);
        System.out.printf("The color of the iphone is %s%n",myIphone.getColor());
        System.out.printf("The price of the iphone is $ %.2f%n",Iphone.getPrice());

    }
}
