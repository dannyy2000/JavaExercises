 package Snacks;

import java.util.Arrays;

public class RotateArrays {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];


        for (int i = 0;  i < nums.length; i++) {
            temp[(i + k) % n] = nums[i];
        }

        System.out.println(Arrays.toString(temp));

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
