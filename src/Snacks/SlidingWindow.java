package Snacks;

public class SlidingWindow {

    public static int sliding(int[] arr,int k){
        int max_sum = 0;

        for (int i = 0; i < k ; i++) {
            max_sum += arr[i];
        }
        int current_sum = max_sum;
        for (int i = k; i < arr.length; i++) {
            current_sum += arr[i] - arr[i - k];

            if(current_sum > max_sum){
                max_sum = current_sum;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 9, 4, 12, 2, -1};
        int k = 2;
        System.out.println(sliding(nums,k));
    }
}
