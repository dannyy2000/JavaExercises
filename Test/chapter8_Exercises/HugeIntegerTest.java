package chapter8_Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    private HugeInteger hugeInteger;

    @BeforeEach
    void setUp(){
        hugeInteger = new HugeInteger(10);
    }

    @Test
    void parseTest(){
        String letters ="56710";
        hugeInteger.parse(letters);
        int[] array = hugeInteger.getMyArray();
        assertEquals(5,array[0]);
    }

    @Test
    void HugeIntegerAddTest(){

    }

}