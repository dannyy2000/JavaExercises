package Chapter16.List;

import java.util.*;

public class ExampleOne {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(4);

        System.out.println("numbers::"+numbers);

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        System.out.println(numbers.containsAll(list));
        System.out.println("numbers:: "+numbers);

        System.out.println("element at index 2 of numbers -> "+numbers.get(2));

    }
}
