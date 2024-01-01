package Snacks;

public class RemoveDuplicates1 {

        public static   int removeDuplicates(int[] nums) {


//            int temp = 1;

//            for (int i = 1; i < nums.length; i++) {
//                if (nums[i] != nums[i - 1]) {
//                    nums[temp] = nums[i];
//                    temp++;
//                }
//            }

            int temp = 0;
            for (int i = 0; i < nums.length -1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[temp] = nums[i];
                    temp++;

                }
            }
            nums[temp] = nums[nums.length - 1];
            temp++;

//            System.out.println(nums[temp]);


           return temp;


        }

    public static void main(String[] args) {
        int[] number = {1,2,2};
        System.out.println(removeDuplicates(number));

    }



    }



