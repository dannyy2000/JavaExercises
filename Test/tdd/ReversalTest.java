package tdd;

import Snacks.Reversal;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class ReversalTest {
    @Test
    public void reverseArrayTest(){
        Reversal reversal = new Reversal();
        int[] list = {12,13,14,15};
        int[] reverseArray = Reversal.reverseArray(list);
        assertEquals(new int[]{15,14,13,12},reverseArray);

    }

}