package Snacks;

public class RemoveDuplicates2 {

    public static int removeDuplicates(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length ; i++) {

//            if(i == 0 || i == 1|| nums[i] != nums[i -1] ||){
//              nums[temp] = nums[i];
//                temp++;
//            }

        }

        return temp;

    }

    public static void main(String[] args) {
        int[] number = {1,1,1,34,2,3};
        System.out.println(removeDuplicates(number));
    }
}
