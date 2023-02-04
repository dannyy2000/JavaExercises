package Chapter16.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSample {

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int minimum = Collections.min(numbers);
        System.out.println("largest:: "+Collections.max(numbers));
        System.out.println("Smallest:: "+minimum);

        Collection<Integer> numbersTwo = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("elements in list numbers:: "+numbers);
        System.out.println("elements in list numbersTwo:: "+numbersTwo);
        System.out.println("adding elements of numbersTwo to numbers");
       boolean result = numbers.addAll(numbersTwo);

        System.out.println("elements in list numbers:: "+numbers);
        Iterator<Integer> numberIterator = numbers.iterator();

        while (numberIterator.hasNext()){
            System.out.println(numberIterator.next());
        }

    }
}
