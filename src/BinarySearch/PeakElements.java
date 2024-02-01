package BinarySearch;

public class PeakElements {

    public  static int findPeakElement(int[] nums) {


        for (int i = 1; i < nums.length - 1  ; i++) {

            if(nums.length > 1 && nums[i] >= nums[i -1] && nums[i] >= nums[i + 1]){
                return i;
            }

        }

        if (nums.length > 1 && nums[0] >= nums[1]) {
            return 0;
        }


        if (nums.length > 1 && nums[nums.length - 1] >= nums[nums.length - 2]) {
            return nums.length - 1;
        }

        return 0;
    }


    public static void main(String[] args) {

        int [] nums = {2,1};
        System.out.println(findPeakElement(nums));

    }
}
