package chapter17.streams;

import Chapter16.Collection.Person;
import chapter8.Human;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<String> names = List.of("Daniel","Akin","Tomiwa");
        int[] numbers = {10,11,12,13,14,15};
        System.out.println(Arrays.stream(numbers)
                .mapToObj(element -> buildPerson(element))
                .collect(Collectors.toList()));

    }

    private static Person buildPerson(int age) {
       Person person = new Person();
       return person;
    }


}
