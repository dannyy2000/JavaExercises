package Chapter7;

import java.util.Arrays;

public class ArraySum {
    public static int[] largestTwo(int[] list) {
//        int[] result = new int[list.length];
        int largest = list[0];
        int secondLargest = list[1];

       for(int number: list){
           if(number > largest){
               secondLargest = largest;
               largest = number;
           }
           if(number > secondLargest && number < largest){

               secondLargest = number;

           }
       }

        return new int[]{largest, secondLargest};
    }

//    public static int maxArray(int[] list){
//        int max = list[0];
//        for(int i = 0;i < list.length;i++){
//            if(list[i] > max){
//                max = list[i];
//            }
//        }
//        return max;
//    }
//
//    public static String findSecondMax(int[] arr){
//
//        int max =  maxArray(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == max) {
//                arr[i] = 0;
//                break;
//            }
//        }
//        return max + " " + maxArray(arr);
//
//    }



//    public static void main(String[] args) {
//        int[] arr = {3,4,5,6,8,8};
//        System.out.println(Arrays.toString(ArraySum.largestTwo(arr)));
//       // System.out.println(ArraySum.findSecondMax(arr));
//    }

    public static int[] smallestTwo(int[] list) {
      int smallest = list[list.length - 1];
        int secSmallest = list[list.length - 2];

        for(int numbers:list){
            if (numbers < smallest){
                secSmallest = smallest;
               smallest = numbers;
            }
            if(numbers < secSmallest && numbers > smallest){
                secSmallest = numbers;
                //smallest = numbers;
            }
        }
        return new int[]{smallest,secSmallest};
    }

    public static int[] sumLargest(int[] list) {
        int largest = list[0];
        int secondLargest = list[1];

        for(int number: list){
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            if(number > secondLargest && number < largest){

                secondLargest = number;

            }
        }

        return new int[]{largest + secondLargest};

    }

}
