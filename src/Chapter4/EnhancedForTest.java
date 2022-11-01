package Chapter4;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        for (int number : array) {
            System.out.printf("Total of array elements: %d%n", number);
        }

        //System.out.printf("Total of array elements: %d%n",);
    }
}