package Tdd;

public class Integers {
    public static int firstIndex(int[] numbers) {
        int total1 = 0;
        for(int counter = 1; counter<=numbers.length;counter++){
            if(counter == numbers[0]){
                total1 -= numbers[0];
            }
            total1+=counter;
        }
        return total1;
    }

    public static int secondIndex(int[] numbers) {
        int total2 = 0;
        for(int counter = 1; counter<=numbers.length;counter++){
            if(counter == numbers[1]){
                total2 -= numbers[1];
            }
            total2+=counter;
        }
        return total2;
    }

    public static int thirdIndex(int[] numbers) {
        int total3 = 0;
        for(int counter = 1; counter<=numbers.length;counter++){
            if(counter == numbers[2]){
                total3 -= numbers[3];
            }
            total3+=counter;
        }
        return total3;
    }
    }
//}
