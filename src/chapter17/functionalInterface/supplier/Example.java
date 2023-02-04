package chapter17.functionalInterface.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(10);
        for (int i = 0;i < 10;i++){
            System.out.println(supplier.get() + " ");
        }

    }
}
