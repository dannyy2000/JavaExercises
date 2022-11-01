package Snacks;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        //Sorting sort2 = new Sorting();
        int[] list1 = {2,7,1,5,6,9,0};
        //sort.bubbleSort(list);
        System.out.println(Arrays.toString(sort.bubbleSortAsc(list1)));
        int [] list2 = {1,4,3,6,7,8,2,9};
        System.out.println(Arrays.toString(sort.bubbleSortDesc(list2)));

    }
}
