package Chapter7;
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      int[] array = getIntegers(5);
      for(int i = 0;i< array.length;i++){
          System.out.printf("The element %d value is %d%n",i,array[i]);
      }

    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter the five values: ");
        int[] values = new int[number];
         for(int i = 0;i< values.length;i++){
            values[i] = input.nextInt();
        }
        return values;
    }

}
