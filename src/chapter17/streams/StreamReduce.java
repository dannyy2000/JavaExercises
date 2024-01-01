package chapter17.streams;

import java.util.stream.IntStream;

public class StreamReduce {

    public static void main(String[] args){
        System.out.printf("Sum of 1 through 10 is: %d%n",
                IntStream.range(1,10).sum());
    }
}
