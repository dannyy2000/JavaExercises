package Tdd;

public class ComparingInteger {
    String result;

    public String numberIsLessThan100(int number) {
        if (number < 100) {
            result = "less than 100";
        }
        return result;
    }

    public String numberisGreaterThan100(int number) {
        if (number > 100) {
            result = "Greater than 100";
        }
        return result;

    }

    public String numberIsEqualTo100(int number) {
        if (number == 100) {
            result = "Equal to 100";
        }
        return result;
    }

    public String numberIsNotEqualTo100(int number) {
        if (number != 100) {
            result = "Not equal to 100";
        }
        return result;
    }

    public String squareIsLessThan100(int number) {
        int squaredNumber = (int) Math.pow(number,2);
         if (squaredNumber < 100){
             result = "Square is less than 100";
        }
        return result;
    }

    public String squareIsGreaterThan100(int number) {
        int squaredNumber = (int) Math.pow(number,2);
         if(squaredNumber > 100){
             result = "Square is greater than 100";
         }
         return result;
    }

    public String squareIsEqualTo100(int number) {
        int squaredNumber = (int) Math.pow(number,2);
        if(squaredNumber == 100){
            result = "Square is equal to 100";
        }
        return result;
    }

    public String squareIsNotEqualTo100(int number) {
        int squaredNumber = (int) Math.pow(number,2);
        if(squaredNumber != 100){
            result = "Square is not equal to 100";
        }
        return result;
    }
}