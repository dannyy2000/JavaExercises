package tdd;

import Tdd.ComparingInteger;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComparingIntegerTest {

    @BeforeMethod
    public void setUp(){
       ComparingInteger comparingInteger = new ComparingInteger();
    }
    @Test
    public void testThatObjectsExists(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertNotNull(comparingInteger);
    }
    @Test
    public void testThatNumberIsLessThan100(){
        ComparingInteger comparingInteger = new ComparingInteger();
       assertEquals("less than 100",comparingInteger.numberIsLessThan100(40));
    }
    @Test
    public void testThatNumberIsGreaterThan100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Greater than 100",comparingInteger.numberisGreaterThan100(150));
    }
    @Test
    public void testThatNumberIsEqualTo100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Equal to 100",comparingInteger.numberIsEqualTo100(100));
    }
    @Test
    public void testThatNumberIsNotEqualTo100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Not equal to 100", comparingInteger.numberIsNotEqualTo100(80));
    }
    @Test
    public void testThatSquareIsLessThan100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Square is less than 100",comparingInteger.squareIsLessThan100(4));
    }
    @Test
    public void testThatSquareIsGreaterThan100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Square is greater than 100",comparingInteger.squareIsGreaterThan100(15));
    }
    @Test
    public void testThatSquareIsEqualTo100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Square is equal to 100",comparingInteger.squareIsEqualTo100(10));
    }
    @Test
    public void testThatSquareIsNotEqualTo100(){
        ComparingInteger comparingInteger = new ComparingInteger();
        assertEquals("Square is not equal to 100",comparingInteger.squareIsNotEqualTo100(20));
    }
}
