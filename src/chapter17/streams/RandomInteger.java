package chapter17.streams;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomInteger {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        String numbers = random.ints(10,1,7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println("This is the numbers"+ numbers);
    }
}
