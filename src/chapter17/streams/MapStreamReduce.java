package chapter17.streams;

import java.util.stream.IntStream;

public class MapStreamReduce {

    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is: %d%n",
                IntStream.rangeClosed(1,10)
                        .map((int x) -> {return x * 2;})
                        .sum());
    }
}
