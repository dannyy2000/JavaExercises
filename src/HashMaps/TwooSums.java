package HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwooSums {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            numMap.put(i, nums[i]);
            numMap.put(i+1, nums[i + 1]);

            if (numMap.get(i) + numMap.get(i + 1) == target) {
                return new int[]{i, i + 1};
            }


        }
        return new int[]{-1, -1};
    }



    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));


    }

}
