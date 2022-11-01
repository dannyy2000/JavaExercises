package tdd;

import chapter8.Human;
import chapter8.Native;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class NativeTest {

    @Test
    void constructorSetTest(){
        Human human = new Human();
        human.setFirstName("Tomiwa");
        human.setLastName("Akinsanya");
        human.setPhoneNumber("09081167465");
        human.setEmailAddress("@akinsanyadaniel665@gmail.com");

        Native fineBoy = new Native(human);
        assertEquals("Tomiwa",fineBoy.getFirstName());
        assertEquals("Akinsanya",fineBoy.getLastName());

    }

}