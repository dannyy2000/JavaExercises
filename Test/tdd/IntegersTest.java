package tdd;

import Tdd.Integers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegersTest {
    @Test
    public void firstIndexTest() {
        Integers.firstIndex(new int[]{5, 2, 3, 1, 4});
        assertEquals(10, Integers.firstIndex(new int[]{5, 2, 3, 1, 4}));
    }

    @Test
    public void secondIndexTest() {
        Integers.secondIndex(new int[]{5, 2, 3, 1, 4});
        assertEquals(13, Integers.secondIndex(new int[]{5, 2, 3, 1, 4}));

        /// }
//    @Test
//    public void thirdIndexTest(){
//        Integers.thirdIndex()
//    }
//}
    }
}