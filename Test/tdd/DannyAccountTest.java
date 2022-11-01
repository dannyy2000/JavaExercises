package tdd;

import Tdd.DannyAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DannyAccountTest {
    

    @BeforeEach
    public void startAllTestWith(){
        DannyAccount myAccount = new DannyAccount();
    }
    @Test
    @DisplayName("testThatAccountExists")
    void testThatAccountExists(){
        DannyAccount myAccount = new DannyAccount();
        assertNotNull(myAccount);
    }
    @Test
    @DisplayName("testThatAccountDeposit")
    void testThatAccountDeposit(){
        DannyAccount myAccount = new DannyAccount();
        myAccount.deposit(-1);
        assertEquals(-1,myAccount.getBalance());
    }
    @Test
    @DisplayName("depositAmountAboveZeroTest")
    void depositAmountAboveZeroTest(){
        DannyAccount myAccount = new DannyAccount();
        assertTrue(myAccount.depositAboveZero(20));

    }
    @Test
    @DisplayName("testThatAccountWithdraws")
    void testThatAccountWithdraws(){
        DannyAccount myAccount = new DannyAccount();
        myAccount.deposit(250);
        myAccount.withdraws(100);
        assertEquals(150,myAccount.getBalance());
    }
    @Test
    @DisplayName("withdrawalAmountAbove500Test")
    void withdrawalAmountAbove500Test(){
        DannyAccount myAccount = new DannyAccount();
        assertTrue( myAccount.withdawalAbove500(500));
    }

}
