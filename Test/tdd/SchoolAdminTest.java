package tdd;

import Chapter7.SchoolAdmin;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class SchoolAdminTest {
    private int [][] scores = {{98,79,77,95,84},{83,89,74,91,90}};
    private SchoolAdmin admin;

//    @BeforeMethod
//    public void setUp() {
//        admin = new SchoolAdmin(scores);
//    }

    @Test
    public void calculateAverageScore(){
        SchoolAdmin admin = new SchoolAdmin(scores);
       admin.calculateAverage();
       double[] averages = admin.getAverageScores();
       assertTrue(averages[0] > 0);
       assertTrue(averages[1] > 0);
        assertTrue(averages[0] > 86.6);
        assertTrue(averages[1] > 85.4);

    }
    }


