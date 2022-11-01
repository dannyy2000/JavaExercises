package tdd;

import Tdd.ArrayUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUnitTest  {

    @Test
    public void reverseArrayTest(){
        int[] array = {1,2,3,4,5};
        int[] reverseArray = ArrayUnit.reverse(array);
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, reverseArray);
    }
    @Test
    public void reverseStringTest(){
        String input = "Adeleke";
        String output = ArrayUnit.reverse(input);
        assertEquals("ekeledA",output);
    }
    @Test
    public void reverseOneLineStringTest(){
        String input = "Adeleke";
        String output = ArrayUnit.oneLineReverse(input);
        assertEquals("ekeledA",output);
    }
    @Test
    public void capitalizeFirstStringTest(){
        String input = "adeleke";
        String output = ArrayUnit.capitalize(input);
        assertEquals("Adeleke",output);
    }
    @Test
    public void changeCasesToCapitalizeTest(){
        String input = "ADELEKE";
        String output = ArrayUnit.capitalize(input);
        assertEquals("Adeleke",output);
    }
}
