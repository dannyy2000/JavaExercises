package tdd;

import Snacks.Reversal;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class ReversalTest {
    @Test
    public void reverseArrayTest(){
        Reversal reversal = new Reversal();
        int[] list = {2,4};
        int[] reverseArray = Reversal.reverseArray(list);
        assertEquals(new int[]{4,2},reverseArray);

    }

}