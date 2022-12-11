package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        BeansMessenger daniel =  new BeansMessenger();
        Beans beans = daniel.buyBeans(500,2,false,true);
        System.out.println(beans );
    }
}
