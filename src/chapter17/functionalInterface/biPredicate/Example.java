package chapter17.functionalInterface.biPredicate;

import java.util.function.BiPredicate;

public class Example {
    public static void main(String[] args) {

        BiPredicate<String,Integer> biPredicate =
                (word,number)-> word.length() == number;
        System.out.println(biPredicate.test("semicolon", 9));

    }
}
