package HashMaps;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int count = 0;
        int[] tempNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    tempNums[count] = i;
                    count++;
                    tempNums[count] = j;
                    break;
                } else {
                    count = 0;
                }


            }


        }
        return tempNums;
    }

    public static void main(String[] args) {

        int[] number = {3,2,4 };
        int target = 6;
        System.out.println(Arrays.toString(twoSum(number, target)));


    }
}