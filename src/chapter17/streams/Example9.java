package chapter17.streams;

import java.util.Set;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        Set<Employee> employees = Set.of(
                new Employee("Amirah",20),
                new Employee("Daniel",50),
                new Employee("waaa",100)
        );

        System.out.println(employees.stream()
                .sorted()
                .collect(Collectors.toList()));
    }
    }

