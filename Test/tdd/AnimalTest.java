package tdd;

import chapter9.Dog;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class AnimalTest {

    @Test
    public void speakTest(){
        Dog aja = new Dog();
        aja.fatherSpeak();
    }

}