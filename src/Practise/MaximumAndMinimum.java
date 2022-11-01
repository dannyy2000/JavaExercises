package Practise;

import java.util.Scanner;

import static Practise.ArrayMinAndMax.*;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrays = new int[5];
        for(int i = 0; i < 5;i++){
            System.out.println("Enter a number between 0 to 100");
            int number = input.nextInt();
            if(number >= 0 && number <= 100){
                arrays[i] = number;
            }
//            int[] max = maximAndMin(arrays);
//            System.out.printf("%nThe maximum is %d and%n the minimum is %d", max[0], max[1]);
        }
        int[] max = maximAndMin(arrays);
        System.out.printf("%nThe maximum is %d and%n the minimum is %d", max[0], max[1]);
    }

    public static int[] maximAndMin(int[] arrays) {
        int max = arrays[0];
        int min = arrays[0];
        int[] result = new int[2];
        for (int array : arrays) {
            if (array > max) {
                max = array;
            }
            result[0] = max;
            if (array < min) {
                min = array;
            }
            result[1] = min;
        }
        return result;
    }
}
