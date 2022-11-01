package Chapter7;


import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        ArrayList<String> daniel = new ArrayList<>();

        ArrayList<String> danielBoy = new ArrayList<>(Arrays.asList("Samuel","Michael","Jude","Martins","Grace"));
        System.out.printf("%n%s",danielBoy.get(1));

        danielBoy.add("Dean");
        System.out.printf("%n%s",danielBoy.get(5));
        danielBoy.remove("Michael");
        System.out.printf("%n%s",danielBoy.get(1));

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,5,7,3,2,5,6));
        System.out.printf("%n%s",integers.get(1));







    }
}
