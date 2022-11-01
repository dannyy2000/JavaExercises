package Snacks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySnacksTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = {2,4,6,7,8,0};
        System.out.println(ArraySnacks.maximumArray(numbers));

        int [] list = {2,4,6,7,8,0};
        System.out.println(Arrays.toString(ArraySnacks.reverse(list)));

        int [] array = {9,0,7,5,4,3,8,1};
        System.out.println(Arrays.toString(ArraySnacks.evenPosition(array)));

        int [] list1 = {6,5,7,3,2,1};
        System.out.print("sum is: ");
        System.out.print(Arrays.toString(ArraySnacks.sumArray(list1)));

        System.out.println();

        int[] list2 = {6,9,0,2,1,4};
        System.out.println(Arrays.toString(ArraySnacks.oddElements(list2)));


    }
}
