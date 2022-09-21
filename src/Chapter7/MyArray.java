package Chapter7;

public class MyArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        for(int i = 0;i < array.length;i++){
            array[i] = i*10;
            System.out.printf("The element %d value is %d%n",i,array[i]);

        }
    }
}
