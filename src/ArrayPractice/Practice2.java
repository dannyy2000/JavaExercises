package ArrayPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
//        System.out.println("array[0][1] is " + array[0][1]);
//        System.out.println(Arrays.toString(array[x]));

        System.out.println(Arrays.deepToString(array));
    }
}
