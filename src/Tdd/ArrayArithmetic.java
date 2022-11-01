package Tdd;

public class ArrayArithmetic {
    public static int sumArray(int [] numbers) {
        int sum = 0;
        for(int number: numbers){
            sum +=number;
        }
       return sum;
    }

    public static int minimumArray(int [] numbers) {
        int minimum = numbers[0];
        for(int index:numbers ){
            if(index < minimum){
                minimum = index;
            }
        }
        return minimum;
    }

    public static int maximumArray(int [] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }
}
