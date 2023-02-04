package chapter17.functionalInterface.predicate;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)-> word.length()>3;
        predicate.test("semicolon");

        };


    }

