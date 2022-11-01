package tdd;

import Chapter7.ConcatList;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class ConcatListTest {

    @Test
    public void joinTwoListTest(){
        int[] list1 = {2,4,5,6};
        int[] list2 = {5,6,2,8};
        int [] join = ConcatList.concatList(list1,list2);
        assertEquals(new int[]{2,4,5,6,5,6,2,8},join);
    }

}