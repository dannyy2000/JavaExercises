package Tdd;

public class SmallLarge {
    public int sumOfThreeIntegers(int num1,int num2,int num3) {
        return num1 + num2 + num3;
    }

    public int AverageOfThreeIntegers(int num1,int num2,int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int productOfThreeIntegers(int num1,int num2,int num3) {
        return num1 * num2 * num3;
    }

    public int smallestOfThreeIntegers(int num1,int num2,int num3) {
        int smallest = num1;
        if(num2 < smallest){
            smallest = num2;
        }
        if(num3 < smallest){
            smallest = num3;
        }
         return smallest;
    }

    public int largestOfThreeIntegers(int num1,int num2,int num3) {
        int largest = num1;
        if(num2 > largest){
            largest = num2;
        }
        if(num3 > largest){
            largest = num3;
        }
        return largest;
    }
}
