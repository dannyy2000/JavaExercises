package BinarySearch;

import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int [] tempNum = new int[2];
        int count = 0;


        for (int i = start; i <= end ; i++) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            }

            else {
                tempNum[count] = start;
                count++;


            }

            if(count > 0) {
                while (count < 2 && tempNum[count - 1] < nums.length - 1 && nums[tempNum[count - 1] + 1] == target ) {
                    tempNum[count] = tempNum[count - 1] + 1;
                    count++;
                }
            }
            if(count == 2){
                return tempNum;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int [] num = {1};
        int target = 1;
        System.out.println((Arrays.toString(searchRange(num,target))));

    }
}
