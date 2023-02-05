package chapter17.streams;

import java.util.stream.IntStream;

public class Example4 {
    public static void main(String[] args) {


        int total = (IntStream.rangeClosed(2, 20)
                .filter((n) -> n % 2 == 0)
                .map((number) -> number * number)
                .sum());
        System.out.println(total);
    }
}
