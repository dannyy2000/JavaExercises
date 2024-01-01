package Snacks;

public class SlidingWindow2 {

        public static double findMaxAverage(int[] nums, int k) {

            double max = 0.0;
            for (int i = 0; i < k; i++) {
              max+= nums[i];
            }
            double current_sum = max;

            for (int i = k; i < nums.length ; i++) {
                current_sum += nums[i] - nums[i - k];

                if(current_sum > max){
                    max = current_sum;
                }
            }

            return max/k;


    }

    public static void main(String[] args) {
        int [] number = {1,12,-5,-6,50,3};
        int s = 4;
        System.out.println(findMaxAverage(number, s));
    }

}
