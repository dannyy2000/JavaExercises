package Chapter16.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SampleTwo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Index of element 3 in numbers -> "+numbers.indexOf(3));
        System.out.println("last index of element 3 in numbers -> "+numbers.lastIndexOf(3));

        ListIterator<Integer> numberIterator = numbers.listIterator(6);

        while(numberIterator.hasPrevious()){
            System.out.println(numberIterator.previous());
            numberIterator.remove();
            System.out.println("Iterator:: "+numbers);
        }

    }
}
