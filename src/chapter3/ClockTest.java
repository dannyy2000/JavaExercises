package chapter3;

public class ClockTest {
    public static void main(String[] args) {

        Clock myClock = new Clock(24,45,40);

        System.out.printf("The time is %s%n ",myClock.getDisplayTime());
    }
}
