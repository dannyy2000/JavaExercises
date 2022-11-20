package Practise;

public class SketchPad {
    public static void main(String[] args) {

            int[][] array = new int[5][5];
            array[1][2] = 1;
            array[2][3] = 1;
            array[1][2] = 1;
            array[2][2] = 1;


            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {

                    //array[row] = array[column];
                    if (array[row][column] == 1)
                        System.out.print("*" + " ");
                    else
                        System.out.print("-" + " ");
                }
                System.out.println();
            }


        }
    }

