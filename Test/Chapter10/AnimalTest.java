package Chapter10;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class AnimalTest {

    @Test
    public void polymorphismTest(){
        Animal aja = new Cat();
        aja.speak();
    }

}