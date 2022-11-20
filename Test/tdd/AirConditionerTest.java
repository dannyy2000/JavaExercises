package tdd;

import Tdd.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatAcExist() {
        AirConditioner myAc = new AirConditioner();
        assertNotNull(myAc);
    }

    @Test
    public void testThatAcIsOn() {
        // given that I have an A.c
        AirConditioner myAc = new AirConditioner();
        // I turn it on
        myAc.setOn(true);
        // check that A.c is on
        assertEquals(true,myAc.getAcIsOn());
    }

    @Test
    public void testThatAcIsOff() {
        // given that I have an A.c, and it is on
        AirConditioner myAc = new AirConditioner();
        myAc.setOn(true);
        // when I turn it off
        myAc.setOff(false);
        // check that A.c is off
        assertEquals(false,myAc.isOff());

    }

    @Test
    public void increaseTempTest() {
        // given that I have an A.c, and it is on
        AirConditioner myAc = new AirConditioner();
        myAc.setOn(true);
        // The initial temp is 0
        assertEquals(0, myAc.getTemperature());
        // when I increase temperature
        myAc.increaseTemperature();
        // check that temperature increases
        assertEquals(1, myAc.getTemperature());
    }

    @Test
    public void decreaseTempTest() {
        // given that I have an A.c, and it is on
        AirConditioner myAc = new AirConditioner();
        myAc.setOn(true);
        // The temp is fixed
        myAc.setTemperature(17);
        // when i decrease temperature
        myAc.decreaseTemperature();
        // check that temperature decreases
        assertEquals(16, myAc.getTemperature());
    }
    @Test
    public void maximumTempTest(){
        // given that I have an A.c, and it is on
        AirConditioner myAc = new AirConditioner();
        myAc.setOn(true);
        // when temperature is 30
        myAc.setTemperature(30);
        // when I increase temp beyond 30
        myAc.increaseTemperature();
        // check that temperature is still 30
        assertEquals(30,myAc.getTemperature());

    }
    @Test
    public void minimumTempTest(){
        // given that I have an A.c, and it is on
        AirConditioner myAc = new AirConditioner();
        myAc.setOn(true);
        // when temp is 16
        myAc.setTemperature(16);
        // when I decrease temp below 16
        myAc.decreaseTemperature();
        // check that temperature is still 16
        assertEquals(16,myAc.getTemperature());

    }
}
