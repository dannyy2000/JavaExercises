package chapter17.streams;

import java.util.stream.IntStream;

public class ReduceExample {

    public static void main(String[] args) {
        int [] values = {3,4,7,2,9,8};

        System.out.printf("%nProduct via reduce method: %d%n",
        IntStream.of(values)
                .reduce(1,(x,y) -> x * y));
    }
}
