package tdd;

import Snacks.Sorting;
import Tdd.Sort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortTest {


    @Test
    public void sortArrayAscTest(){
        int[] array = {2,4,5,6,7,8,1};
        int[] sortArray = Sort.sortAscMethod(array);
        assertNotEquals(new int[]{1,2,4,5,6,7,8}, sortArray);
    }
    @Test
    public void sortArrayDescTest(){
        int[] array = {2,4,5,8,9,1,0};
        int[] sortArray = Sort.sortDescMethod(array);
        assertNotEquals(new int[]{9,8,5,4,2,1,0},sortArray);

    }
}
