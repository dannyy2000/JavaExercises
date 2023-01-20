package Chapter7;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {


//        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35
//        ,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,
//        74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
//
//        for(int index = 1; index <= numbers.length;index ++){
//            if(numbers[index] % 3 == 0){
//                System.out.println("Crackle");
//            }  if (numbers[index] % 5 == 0) {
//                System.out.println("Pop");
//            } else if (numbers[index] % 3 == 0 && numbers[index] % 5 == 0) {
//                System.out.println("Crackle pop");
//            }
//            else{
//                System.out.println("No");
//            }


//        }
           int [] numbers = new int[100];
        for (int index = 1; index <= numbers.length; index++) {
            numbers[index - 1] = index;

            if(index % 3 == 0){
                System.out.println("Crackle");
            }  if (index % 5 == 0) {
                System.out.println("Pop");
            }  else if ((index % 3 == 0) && (index % 5 == 0 ) ){
                System.out.println("Crackle Pop");
            }
            else{
                System.out.println("Not divisible by any numbers");
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
//}
