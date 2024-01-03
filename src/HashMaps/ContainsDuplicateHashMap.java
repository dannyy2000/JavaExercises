package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ContainsDuplicateHashMap {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> numMap = new HashMap<>();

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//
//                numMap.put(i, nums[i]);
//                numMap.put(j, nums[j]);
//
//                if (Objects.equals(numMap.get(nums[i]), numMap.get(nums[j])) && j - i <= k) {
//                    return true;
//                }
//
//
//            }
//
//
//        }
//        return false;
        for (int i = 0; i < nums.length; i++) {
            if(numMap.containsKey(nums[i]) && i - numMap.get(nums[i]) <= k){
                return true;
            }
            numMap.put(nums[i],i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {13,23,1,2,3};
        int k = 5;
        System.out.println(containsNearbyDuplicate(nums, k));

    }
}


