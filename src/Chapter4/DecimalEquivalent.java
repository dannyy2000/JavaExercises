package Chapter4;

public class DecimalEquivalent {

    int Numbers;
    int digits1;
    int digits2;
    int digits3;
    int digits4;
    int digits5;


    public DecimalEquivalent(String numbers) {
        this.Numbers = Integer.parseInt(numbers);
    }
    public String binaryNumbers(String numbers) {
        return numbers;
    }

    public boolean separateNumbers(int numbers) {
        this.Numbers = numbers;
         digits1 = Numbers / 10000;
           digits2 = Numbers % 10000 / 1000;
          digits3 = Numbers % 10000 % 1000 / 100;
          digits4 = Numbers % 10000 % 1000 % 100 / 10;
          digits5 = Numbers % 10000 % 1000 % 100 % 10;

        System.out.printf("The number  separates into %d   %d   %d   %d   %d%n",digits1,
                digits2,digits3,digits4,digits5);


        return true;
    }

    public void placeValue(String number) {
        digits1 = 1;
        digits2 = 2;
        digits3 = 4;
        digits4 = 8;
        digits5 = 16;

        System.out.printf("The place values for each digits are %d   %d   %d   %d   %d%n",digits5,
                digits4,digits3,digits2,digits1);
    }

    public int equivalentDecimal(int numbers) {
        this.Numbers = numbers;
        digits1 = Numbers / 10000;
        digits2 = Numbers % 10000 / 1000;
        digits3 = Numbers % 10000 % 1000 / 100;
        digits4 = Numbers % 10000 % 1000 % 100 / 10;
        digits5 = Numbers % 10000 % 1000 % 100 % 10;

        return (digits5) + (digits4 * 2) + (digits3 * 4) + (digits2 * 8) + (digits1 * 16);
    }
}
