package chapter17.functionalInterface.biFunction;

import java.util.function.BiFunction;

public class Sample {
    public static void main(String[] args) {
        BiFunction<String,Integer,Boolean> biFunction =
                (word,number) -> word.length() == number;
        System.out.println(biFunction.apply("daniel", 2));
    }
}
