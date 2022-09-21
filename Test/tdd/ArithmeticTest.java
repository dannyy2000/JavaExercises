package tdd;

import Tdd.Arithmetic;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
Arithmetic arithmetic;
    @BeforeEach
    void startAllTestWith(){
        arithmetic = new Arithmetic();
    }
    @Test
     void testThatObjectExists(){
        Arithmetic arithmetic = new Arithmetic();
        assertNotNull(arithmetic);
    }
    @Test
     void squareOfNumbers(){
        Arithmetic arithmetic = new Arithmetic();

        assertEquals(16, arithmetic.squareOfNumbers(4));
    }
    @Test
     void sumOfSquareOfNumbers(){
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(8,arithmetic.sumOfSquares(2,2));
    }
    @Test
     void differenceOfSquareOfNumbers(){
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(0,arithmetic.differenceOfSquares(5,5));
    }
    }


