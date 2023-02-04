package chapter17.streams;

import java.util.stream.Stream;

public class ExampleTwo {
    public static void main(String[] args) {
        Stream<Integer>stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(n -> System.out.println(n));

        Stream<Integer> emptyStream = Stream.empty();
    }
}
