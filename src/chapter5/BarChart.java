package chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i = 0;i < numbers.length;i++){
            System.out.println("Enter numbers: ");
            int nums = input.nextInt();
          nums = numbers[i];
       }
        for(int i = 0;i < numbers[i];i++) {
            for(int j = 0;j < numbers[i];j++){
                System.out.print("*");
//                System.out.println();
//                nums = numbers[i];
            }
            System.out.println();
        }
    }
}
