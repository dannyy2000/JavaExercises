package chapter14.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.+?d");
        Matcher matcher = pattern.matcher("endangered in end");

        while (matcher.find()) {
            System.out.println("matched-> " + matcher.group());
        }
    }
}
