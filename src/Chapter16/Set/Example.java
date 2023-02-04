package Chapter16.Set;

import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.add("Abia");
        states.add("Bauchi");
        states.add("Zamfara");
        states.add("Borno");
        System.out.println("states:: "+ states);

    }
}
