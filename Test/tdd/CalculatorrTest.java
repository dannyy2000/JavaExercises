package tdd;

import Chapter4.Calculatorr;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class CalculatorrTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void getFactorial(){
        long factorial = Calculatorr.factorial(5);
        assertEquals(120,factorial);
         factorial = Calculatorr.factorial(13);
        assertEquals(6227020800L,factorial);
    }


}