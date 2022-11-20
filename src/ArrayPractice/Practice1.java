package ArrayPractice;

public class Practice1 {
    public static void main(String[] args) {

        int[][] array = {{2,4,7},{5,7,9}};
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
