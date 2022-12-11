package tdd.chapter8_Exercises;

import chapter8_Exercises.SavingsAccounts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {

    private SavingsAccounts savingsAccounts;

    @BeforeEach
    public void setUp(){
        savingsAccounts = new SavingsAccounts(2000);
    }

    @Test
    public void testThatSavingsAccountExists(){
        assertNotNull(savingsAccounts);
    }


    @Test
    public void testThatSavingsBalanceCanSetValues(){
        savingsAccounts.setBalance(4);
        assertEquals(4,savingsAccounts.getBalance());

    }

    @Test
    public void modifyInterestRateTest(){
        assertEquals(20.0,SavingsAccounts.modifyInterestRate(20.0));
    }

    @Test
    public void calculateMonthlyInterestRateTest(){
        savingsAccounts.setBalance(4);
//        savingsAccounts.newBalance(4);
        SavingsAccounts.modifyInterestRate(20.0);
        assertEquals(6.0,savingsAccounts.calculateMonthlyInterestRate());
//        savingsAccounts.calculateMonthlyInterestRate();
    }

    @Test
    public void accountHasNewBalanceTest(){
        savingsAccounts.setBalance(2000);
        SavingsAccounts.modifyInterestRate(4);
        assertEquals(666.0,savingsAccounts.calculateMonthlyInterestRate());
        assertEquals(2666.0,savingsAccounts.newBalance());


    }

}
