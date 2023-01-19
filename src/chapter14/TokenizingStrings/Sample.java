package chapter14.TokenizingStrings;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String text = "I_love_java";
        String[] tokens = text.split("-1");
        System.out.println(Arrays.toString(tokens)) ;
    }
}
