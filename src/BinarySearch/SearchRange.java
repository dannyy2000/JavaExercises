package BinarySearch;

import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {

//        int start = 0;
//        int end = nums.length - 1;
//        int [] tempNum = new int[2];
//        int count = 0;
//
//
//        for (int i = start; i <= end ; i++) {
//            int mid = start + (end - start) / 2;
//
//            if(target < nums[mid]){
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//
//            }
//
//            else {
//                tempNum[count] = mid;
//                count++;
//
//
//            }
//
//            if(count > 0) {
//                while (count < 2 && tempNum[count - 1] < nums.length - 1 && nums[tempNum[count - 1] + 1] == target ) {
//                    tempNum[count] = tempNum[count - 1] + 1;
//                    count++;
//                }
//            }
//            if(count == 2){
//                return tempNum;
//            }
//        }
//
//        return new int[]{-1, -1};

        int[] result = {-1, -1};


        int left = binarySearch(nums, target, true);
        if (left == nums.length || nums[left] != target) {
            return result; // Target not found
        }


        int right = binarySearch(nums, target, false);

        result[0] = left;
        result[1] = right - 1;
        return result;
    }


    private static int binarySearch(int[] nums, int target, boolean findLeftmost) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target || (findLeftmost && nums[mid] == target)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }







    public static void main(String[] args) {

        int [] num = {5,7,7,8,8,10};
        int target = 8;
        System.out.println((Arrays.toString(searchRange(num,target))));

    }
}
