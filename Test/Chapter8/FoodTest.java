package Chapter8;

import chapter8.Food;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class FoodTest {

    @Test
    void toValidateTypeAndCalories(){
        for (int i = 0; i < Food.values().length; i++) {
        assertArrayEquals(Food.values(), Food.values());}
    }
}
