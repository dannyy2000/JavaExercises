package chapter17.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

       numbers.stream()
               .forEach((n) ->System.out.println(n));
    }
}
