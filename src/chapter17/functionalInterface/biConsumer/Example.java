package chapter17.functionalInterface.biConsumer;

import java.util.function.BiConsumer;

public class Example {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer =
                (name,age) -> {
                    System.out.println(name + "is" + age + "years old");
                } ;
    }
}
