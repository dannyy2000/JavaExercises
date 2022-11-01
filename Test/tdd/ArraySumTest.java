package tdd;

import Chapter7.ArraySum;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class ArraySumTest {
    @Test
    public void twoLargestTest(){
        int [] list = {1,3,5,6,0,2};
        int[] largest = ArraySum.largestTwo(list);
        assertEquals(new int[]{6,5},largest);

    }
    @Test
    public void twoSmallestTest(){
        int[] list = {100,30,40,60,20,90};
        int[] smallest = ArraySum.smallestTwo(list);
        assertEquals(new int[]{20,30},smallest);
    }
    @Test
    public void sumLargestTest(){
        int [] list = {2,5,7,8,5,9};
        int[] sum = ArraySum.sumLargest(list);
        assertEquals(new int[]{17},sum);
    }


}