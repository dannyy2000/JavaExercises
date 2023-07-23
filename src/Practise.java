import java.util.Arrays;

public class Practise {

    public static int[] reverse(int[] numbers) {

        int[] num = new int[numbers.length];
        for (int i = 0,j= numbers.length - 1;i < numbers.length;i++,j--){
            num[j]=numbers[i];
        }
        return num;
}

    public static void main(String[] args) {
        int[] nums = {12,13,14,15};
        System.out.println(Arrays.toString(reverse(nums)));
    }
    }