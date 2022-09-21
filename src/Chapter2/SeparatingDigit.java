package Chapter2;
import java.util.Scanner;
      public class SeparatingDigit {
       public static void main(String[] args){

        int number;
        int digits1;
        int digits2;
        int digits3;
        int digits4;
        int digits5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        digits1 = number/10000;
        digits2 = number % 10000 / 1000;
        digits3 = number % 10000 % 1000 / 100;
        digits4 = number % 10000 % 1000 % 100 / 10;
        digits5 = number % 10000 % 1000 % 100 % 10;

        System.out.printf("The number %d separates into %d   %d   %d   %d   %d%n",number,digits1,
                digits2,digits3,digits4,digits5);
    }
 }