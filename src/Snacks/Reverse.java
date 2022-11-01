package Snacks;

public class Reverse {

    public static int[] reverse(int[] original){

        int[]reverse = new int[original.length];


        for(int index = 0; index < original.length;index++){
            reverse[index] = original[original.length   - 1 - index];
//
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5};

        int[] values = Reverse.reverse(original);
        for(int numbers : values){
            System.out.print(numbers + " ");
        }
    }
}
