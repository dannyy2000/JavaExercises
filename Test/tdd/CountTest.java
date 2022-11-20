package tdd;

import Practise.Count;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class CountTest {

    private Count count;

    @BeforeEach
    public void setUp(){
        count = new Count();
    }

    @Test
    public void testThatObjectsExists(){
        assertNotNull(count);
    }

    @Test
    public void testNumberOfString(){
      assertEquals(6,count.noOfStrings("!+A1B23467"));
    }

}