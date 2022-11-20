package Practise;

public class Sudoku {
    public static void main(String[] args) {
        int[][] array = new int[9][9];

        for (int row = 0; row < array.length; row++) {
            for (int column = 1; column < array[row].length; column++) {
                array[row][column] = row + column + 1;
                if (array[row][column] > 9) {
                    array[row][column] -= 9;
                }
                System.out.printf("%d" + "  ", array[row][column]);
            }
            System.out.println();
        }
    }
}
