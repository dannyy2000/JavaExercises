package tdd;

import Snacks.SevenSegment;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class SevenSegmentTest {
    @Test
    public void printThreeTest(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setScreen(String.valueOf(11110011));
        sevenSegment.display();
    }

    @Test
    public void printSixTest(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setScreen(String.valueOf(10111101));
        sevenSegment.display();
    }
    @Test
    public void printEightTest(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setScreen(String.valueOf(11111111));
        sevenSegment.display();
    }

}