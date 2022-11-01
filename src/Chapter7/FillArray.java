package Chapter7;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {


        int[] numbers = new int[10];
        for (int index = 1; index <= numbers.length; index++) {
            numbers[index - 1] = index;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
//}
