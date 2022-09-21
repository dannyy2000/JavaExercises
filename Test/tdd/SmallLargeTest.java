package tdd;

import Tdd.SmallLarge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SmallLargeTest {

    @Test
    void testThatObjectExists() {
        SmallLarge smallLarge = new SmallLarge();
        assertNotNull(smallLarge);
    }

    @Test
    void sumOfThreeIntegersTest() {
        SmallLarge smallLarge = new SmallLarge();
        assertEquals(20, smallLarge.sumOfThreeIntegers(5, 5, 10));
    }

    @Test
    void AverageOfThreeIntegersTest() {
        SmallLarge smallLarge = new SmallLarge();
        assertEquals(5, smallLarge.AverageOfThreeIntegers(5, 5, 5));
    }

    @Test
    void productOfThreeIntegersTest() {
        SmallLarge smallLarge = new SmallLarge();
        assertEquals(1000, smallLarge.productOfThreeIntegers(10, 10, 10));
    }

    @Test
    void smallestIntegersTest() {
        SmallLarge smallLarge = new SmallLarge();
        assertEquals(10, smallLarge.smallestOfThreeIntegers(20, 10, 30));
    }

    @Test
    void largestIntegersTest() {
        SmallLarge smallLarge = new SmallLarge();
        assertEquals(20, smallLarge.largestOfThreeIntegers(5, 10, 20));
    }
}

