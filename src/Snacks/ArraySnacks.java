package Snacks;

public class ArraySnacks {
    int [] numbers = {2,4,6,7,8,0};
    public static int maximumArray(int [] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    public static int[] reverse(int[] list) {
         int[] result = new int[list.length];
             for (int i = 0, j = result.length - 1;
                  i < list.length; i++, j--) {
                 result[j] = list[i];
             }
             return result;
    }

    public static int [] contains(int [] list1){
        int [] array = {4,5,2,6,7,8};
        if (list1 == array){
            System.out.println("It exists");
        }
        else {
            System.out.println("It doesnt");
        }
        return array;
    }

    public static int[] evenPosition(int[] array){
        int arrayLength = 0;
        if(array.length % 2 == 0){
            arrayLength = array.length / 2;
        }
        else{
            arrayLength = array.length / 2 + 1;
        }
        int [] newArray = new int[arrayLength];
        int count = 0;

        for (int i = 0; i < array.length; i+=2){
            newArray[count++] = array[i];
        }
        return newArray;
    }
    public static int[] sumArray(int[] list1){
        int total = 0;
        int[] numbers = new int[list1.length];

        for (int i : list1) {
            total += i;
        }
        return new int[]{total};
    }

    public static int[] oddElements(int[] array){
        int [] newArray = new int[(array.length/2)];
        int count = 0;

        for (int i = 1; i < array.length;i+=2){
            newArray[count++] = array[i];
        }
        return newArray;
    }


}
