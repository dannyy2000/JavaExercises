package Practise;

import java.util.Arrays;

public class Shifting {
    public static void main(String[] args) {
        int [] myList = {2,5,6,7,8,2,0,1};

        int temp = myList[0];

        for (int i = 1;i < myList.length;i++){
            myList[i - 1] = myList[i];

        }
        myList[myList.length - 1] =  temp;
        System.out.println(Arrays.toString(myList));
    }
}
