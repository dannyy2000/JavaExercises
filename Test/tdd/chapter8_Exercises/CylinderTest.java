package tdd.chapter8_Exercises;

import chapter8_Exercises.Cylinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    private Cylinder cylinder;

    @BeforeEach
    public void setUp(){
        cylinder = new Cylinder(1,1);
    }

    @Test
    public void testThatClassExist(){
        assertNotNull(cylinder);
    }

    @Test
    public void heightHasDefaultValueOfOneTest(){
        assertEquals(1,cylinder.getHeight());
    }

    @Test
    public void radiusHasDefaultValueOfOneTest(){
        assertEquals(1,cylinder.getRadius());
    }

    @Test
    public void radiusCanSetValuesTest(){
        cylinder.setRadius(2);
        assertEquals(2,cylinder.getRadius());
    }

    @Test
    public void heightCanSetValuesTest(){
        cylinder.setHeight(5);
        assertEquals(5,cylinder.getHeight());
    }

    @Test
    public void calculatesVolumeTest(){
//        cylinder.calculateVolume(2262.4);
        cylinder.setHeight(7.2);
        cylinder.setRadius(10.0);
        assertEquals(2261,cylinder.calculateVolume());

    }

    @Test
    public void heightAndRadiusArePositiveNumbersTest(){
        cylinder.setHeight(8.9);
        cylinder.setRadius(6.9);
        assertEquals(8.9,cylinder.getHeight());
        assertEquals(6.9,cylinder.getRadius());

    }
}