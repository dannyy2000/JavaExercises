package tdd;

import ArrayPractice.RowMaximum;
import Chapter7.ArcheryGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class RowMaximumTest {
    private RowMaximum rowMaximum;

    int [][]numbers = {{2,2},{10,9},{8,8},{3,8}};

    @BeforeEach
    public void setUp(){
         rowMaximum = new RowMaximum(numbers);
    }

    @Test
    public void testThatObjectsExists(){
        assertNotNull(rowMaximum);
    }

    @Test
    public void testThatWeHaveRowsAndColumns(){
        rowMaximum.getNumbers();
        assertNotNull(numbers);
    }

    @Test
    public void maximumRowTest(){
        rowMaximum.LargestRow(numbers);
        assertEquals(1,rowMaximum.LargestRow(numbers));

    }

}