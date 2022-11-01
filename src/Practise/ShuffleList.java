package Practise;

import java.security.SecureRandom;
import java.util.Arrays;

public class ShuffleList {
    public static SecureRandom randomNumbers = new SecureRandom();

    public static int[] shuffle(int[] list){
        for (int index = 0;index < list.length;index++){
            int i = randomNumbers.nextInt(list.length);
            int j = randomNumbers.nextInt(list.length);

            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = {2,5,7,1,0,9,8,7};
        System.out.println(Arrays.toString(ShuffleList.shuffle(list)));
    }
}
