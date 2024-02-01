package BinarySearch;

import java.util.Arrays;

public class SearchRanges {

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int [] tempNum = new int[2];



        for (int i = start; i < end ; i++) {

            int mid = start + (end - start) / 2;

            if(nums[mid] > target || nums[mid] == target){
                end = mid;

            }
            else {
                start = mid + 1;

            }

           tempNum[0] = start;
            tempNum[1] = end + 1;

        }

        if(tempNum.length == 2){
            return tempNum;
        }



        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int [] num = {5,7,7,8,8,10};
    int target = 6;
        System.out.println(Arrays.toString(searchRange(num, target)));
    }
}
