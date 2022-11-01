package Snacks;

import java.util.Arrays;

//b) Initialize each of the six elements of one-dimensional integer array g to -1.
public class SevenPointEightB {
    public static void main(String[] args) {

        int[] numbers = new int [6];

        Arrays.fill(numbers,-1);


        for(int counter = 0;counter < numbers.length;counter++){
            System.out.printf("The elements %d of the array is:%d%n",counter,numbers[counter]);
        }








    }
}