package ArrayPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int[][] matrix = new int[7][7];
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[1][3] = 4;
        matrix[2][3] = 5;
        matrix[3][2] = 8;
        matrix[4][1] = 2;
        matrix[4][3] = 2;


        int maxRow = 0;
        int indexOfMaxRow = 0;
// Get sum of the first row in maxRow
//        for (int column = 0; column < matrix[0].length; column++) {
//            maxRow += matrix[0][column];
//        }
        for (int row = 0; row < matrix.length ; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;

                indexOfMaxRow = row;
            }
            System.out.println("Row " + indexOfMaxRow
                    + " has the maximum sum of " + maxRow);

        }


//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
////        int row;
////        int column = 0;
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//                System.out.print(matrix[row][column]);
//            }
//
//        }
//        System.out.println();
//        System.out.println(matrix[row][column]);
//        for(int row = 0;row < matrix.length;row++){
//            for(int column = 0;column < matrix[row].length;column++){
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.println();
//        }
    }



}
