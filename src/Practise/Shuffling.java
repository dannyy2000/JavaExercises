package Practise;

import java.util.Arrays;

public class Shuffling {
    public static void main(String[] args) {
        //int temp = 0;
        int [] array = {2, 5, 6, 2, 9, 0};

        for(int i = 0; i < array.length;i++ ) {
            for (int j = array.length - 1; j > 0; j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
//                System.out.println(Arrays.toString(array));
            }
            //System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
