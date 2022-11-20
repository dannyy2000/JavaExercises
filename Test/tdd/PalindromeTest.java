package tdd;

import Snacks.Palindrome;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class PalindromeTest {
    @Test
    public void stringPalindromeTest(){
        String[] word = {"lol"};
        String[] reverse = Palindrome.stringPalindrome(word) ;
        assertEquals(new String[]{"lol"},reverse);

    }

    @Test
    public void intPalindromeTest(){
        int[] numbers = {1,2,3,4,5};
        int[] reverse = Palindrome.intPalindrome(numbers);
        assertNotEquals(new int[]{1,2,3,4,5},reverse);
    }

}