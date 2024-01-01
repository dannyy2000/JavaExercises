package chapter17.streams;

public class Majorly {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int countArray = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {

                if (nums[i] == nums[j]) {
//                    nums[count] = nums[i];
                    count++;

                }

            }


            if(count > nums.length / 2){
                countArray = nums[i];
                break;
            }else {
                count = 0;
            }
        }

        return countArray;
    }

    public static void main(String[] args) {
        int[] numbs = {8,8,7,7,7};
        System.out.println(majorityElement(numbs));


    }
}
