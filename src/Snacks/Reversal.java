package Snacks;

public class  Reversal {


    public  static int[] reverseArray(int[] list) {
            int[] result = new int[list.length];
            for (int i = 0, j = result.length - 1;
                 i < list.length; i++, j--) {
                result[j] = list[i];
            }
            return result;
        }
    }

