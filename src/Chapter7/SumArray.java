package Chapter7;
// Initialize the array to a value
// Initialize the Sum to zero to store the sum of the values in the array
// loop through each value and calculate the values
// Add each element value to total
// print sum

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
