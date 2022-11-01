package Chapter7;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[][] array = {{'X','0','X'},{'X','O','X'},{'X','X','O'}};
       // System.out.println(Arrays.deepToString(array));

        for (int index = 0; index < array.length; index++) {
          for (int count = 0;count < array.length;count++){
              System.out.print(array[index][count] + " ");
          }
            System.out.println();
        }


    }
}
