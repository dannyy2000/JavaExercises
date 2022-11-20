package ArrayPractice;

public class Hundred {
    public static void main(String[] args) {

        int [] array1 = {2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[array1.length];

        for(int i = 0;i < array1.length;i++){

            array2[i] = array1[array1.length - 1] - i ;
            System.out.println(array2[i]);
        }

    }
}
