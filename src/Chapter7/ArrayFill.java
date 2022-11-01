package Chapter7;

public class ArrayFill {
    public static void main(String[] args) {
        int digits = 0;

        int[] numbers = new int[10];
        for (int index = 1; index <= numbers.length; index++) {
            numbers[index - 1] = index;
        }
            for (int count = 0; count < numbers.length;count++){
                System.out.print(numbers[count] + " , ");
            }
        }



    }
