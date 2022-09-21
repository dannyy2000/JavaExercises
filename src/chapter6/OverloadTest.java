package chapter6;

public class OverloadTest {
    public static void main(String[] args) {

        Overload overload = new Overload();
        System.out.print(overload.addTwoNumbers(2,3));
        System.out.println();
        System.out.print(overload.addTwoNumbers(2,2.5));
        System.out.println ();
        System.out.print(overload.addTwoNumbers(3.5,2));
        System.out.println();
        System.out.print(overload.addTwoNumbers(3.5,6.5));

    }
}
