package Chapter2;

import java.util.Scanner;
   public class NegativePositive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int TotalPositive = 0 ;
        int TotalNegative = 0;
        int TotalZeros = 0;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        number3 = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        number4 = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        number5 = input.nextInt();

         if (number1>0)
            TotalPositive = TotalPositive + 1;

         if (number2>0)
             TotalPositive = TotalPositive + 1;
  
         if(number3>0)
            TotalPositive = TotalPositive + 1;

         if(number4>0)
            TotalPositive = TotalPositive + 1;

         if(number5>0)
           TotalPositive = TotalPositive + 1;

         if(number1<0)
           TotalNegative = TotalNegative + 1;
       
         if(number2<0)
           TotalNegative = TotalNegative + 1;
 
         if(number3<0)
           TotalNegative = TotalNegative + 1;

         if(number4<0)
           TotalNegative = TotalNegative + 1;

         if(number5<0)
           TotalNegative = TotalNegative + 1;
      
         if(number1 == 0)
           TotalZeros = TotalZeros + 1;
    
         if(number2 == 0)
           TotalZeros = TotalZeros + 1;

         if(number3 == 0)
           TotalZeros = TotalZeros + 1;
   
         if(number4 == 0)
           TotalZeros = TotalZeros + 1;

         if(number5 == 0)
           TotalZeros = TotalZeros + 1;


         System.out.printf("The number of Positive is %d%n",TotalPositive);
         System.out.printf("The number of negative is %d%n",TotalNegative);
         System.out.printf("The number of Zeros is %d%n",TotalZeros);

    }
}