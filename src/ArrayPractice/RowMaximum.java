package ArrayPractice;

public class RowMaximum {
    private int [][] numbers = new int[4][2];


    public int[][] getNumbers() {
        return numbers;
    }

//    private int [][] numbers = new int[4][2];

    public RowMaximum(int[][] numbers){
        this.numbers = numbers;
    }

    public int LargestRow(int[][] numbers) {
        int maxRow = 0;
        int totalRow = 0;
        int indexMaximum = 0;

//

        for(int row = 0;row < numbers.length;row++){
            for(int column = 0; column < numbers[row].length;column++){
                totalRow += numbers[row][column];
                if(totalRow > maxRow){
                    maxRow = totalRow;
                    indexMaximum = row;
                }
            }
        }
            return indexMaximum;
    }
}
