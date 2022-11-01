package tdd;

import Tdd.ArrayArithmetic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayArithmeticTest {


    @Test
    @DisplayName("sum of Array")
    public void sumArray(){
        assertEquals(28, ArrayArithmetic.sumArray(new int[]{2,7,9,10}));
    }
    @Test
    @DisplayName("minimum of Array")
    public void minimumArray(){
        assertEquals(2, ArrayArithmetic.minimumArray(new int[]{2,5,8}));
    }
    @Test
    @DisplayName("maximum Of Array")
    public void maximumArray(){
        assertEquals(9,ArrayArithmetic.maximumArray(new int[]{2,4,9}));
    }
}
