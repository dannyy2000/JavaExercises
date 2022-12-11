package Chapter4;

import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class DecimalEquivalentTest {

    DecimalEquivalent decimalEquivalent;

    @Test
    public void setUp(){
       decimalEquivalent = new DecimalEquivalent("1");
        assertNotNull(decimalEquivalent);
    }

    @Test
    public void testThatBinaryNumbersExistsTest(){
       DecimalEquivalent decimalEquivalent = new DecimalEquivalent("1");
        assertEquals("10101",decimalEquivalent.binaryNumbers("10101"));
    }

    @Test
    public void BinaryNumbersCanBeSeperatedIntoFiveDigitsTest(){
        DecimalEquivalent decimalEquivalent = new DecimalEquivalent("1");
        String number = decimalEquivalent.binaryNumbers("10101");
        assertEquals("10101",number);
        decimalEquivalent.separateNumbers(Integer.parseInt(number));
        assertTrue(decimalEquivalent.separateNumbers(Integer.parseInt(number)));

    }

    @Test
    public void BinaryNumbersHasAPlaceValueTest(){
        DecimalEquivalent decimalEquivalent = new DecimalEquivalent("1");
        String number = decimalEquivalent.binaryNumbers("10101");
        assertEquals("10101",number);
        decimalEquivalent.placeValue(number);
    }

    @Test
    public void decimalEquivalentForFiveDigitsBinaryNumberTest(){
        DecimalEquivalent decimalEquivalent = new DecimalEquivalent("1");
        String number = decimalEquivalent.binaryNumbers("10101");
        assertEquals("10101",number);
        decimalEquivalent.equivalentDecimal(Integer.parseInt(number));
        assertEquals(21,decimalEquivalent.equivalentDecimal(Integer.parseInt(number)));

    }
}
