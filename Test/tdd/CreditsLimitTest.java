package tdd;

import Practise.CreditLimit;
import Tdd.CreditLimits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditsLimitTest {

    @Test
    public void testThatObjectsExits(){
        CreditLimits myCl = new CreditLimits();
        assertNotNull(myCl);
    }
    @Test
    public void newBalanceTest(){
        CreditLimits myCl = new CreditLimits();
        assertEquals(350,myCl.newBalance(300,100,50));
    }

    @Test
    public void newBalanceExceedCreditLimitTest(){
        CreditLimits myCl = new CreditLimits();
        //assertEquals(350,myCl.newBalance(300,100,50));
        assertTrue(myCl.isExceeded(200,50,50,100));

    }
}
