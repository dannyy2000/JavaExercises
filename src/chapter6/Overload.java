package chapter6;

public class Overload {

    public int addTwoNumbers(int number1,int number2){
        return number1 + number2;
    }
    public int addTwoNumbers(int number1,double number2){
        return (int) (number1 + number2);
    }
    public double addTwoNumbers(double number1,double number2){
        return number1 + number2;
    }
    public int addTwoNumbers(double number1,int number2){
        return (int) (number1 + number2);
    }
}
