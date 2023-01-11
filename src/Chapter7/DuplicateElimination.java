package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    static Scanner input = new Scanner(System.in);
    public static int[] duplicate(){


        int [] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] temp;

        for(int i = 1; i < array.length;i++){
           for(int j = 1; j < 10 ;j++){
               System.out.println("Enter numbers");
               int numbers = input.nextInt();

               int[] numbers1 = {numbers};
               temp = numbers1;
               numbers1 = array;
               array = temp;
           }
        }
        return array;
    }


}
