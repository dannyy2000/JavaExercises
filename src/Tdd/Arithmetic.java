package Tdd;

public class Arithmetic {

    public int squareOfNumbers(int num1) {
        return (int) Math.pow(num1,2);
    }

    public int sumOfSquares(int num1, int num2){
        int num1Sqr = (int) Math.pow(num1,2);
        int num2Sqr = (int) Math.pow(num2,2);

        return  num1Sqr + num2Sqr;
    }

    public int differenceOfSquares(int num2, int num1) {
        int num1Sqr = (int) Math.pow(num1,2);
        int num2Sqr = (int) Math.pow(num2,2);

        return num2Sqr - num1Sqr;
    }
}
