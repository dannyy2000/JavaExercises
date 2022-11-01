package Chapter7;

public class MethodArrayTest {
    public static void main(String[] args) {

        MethodArray addition = new MethodArray();
        int[] numbers = {20,60,79,40};
        System.out.printf("The sum is %d%n",addition.addNumbers(numbers));
    }
}
