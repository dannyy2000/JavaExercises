package Chapter7;
// Initialize the array to a value
// Initialize the Sum to zero
// Add each element value to total
// print total

public class SumArray {
    public static void main(String[] args) {

        int [] numbers = {50,40,70,20,10,90,25,45,80};
        int Sum = 0;

        for(int index = 0;index < numbers.length;index++){
            Sum+=numbers[index];
        }
        System.out.printf("The sum of the elements is:%d%n",Sum);
    }
}
