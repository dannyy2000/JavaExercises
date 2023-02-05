package chapter17.functionalInterface.binaryOperator;

import java.util.function.BinaryOperator;

public class Example {
    public static void main(String[] args) {
        BinaryOperator <String> binaryOperator =
                (name,word) -> name + word;

        System.out.println(binaryOperator.apply("semicolon", "native"));
    }
}
