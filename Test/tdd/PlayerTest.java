package tdd;

import Chapter7.Player;
import Practise.P;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp(){
        player = new Player();
    }

    @Test
    public void testThatPlayerCanBeCreated(){
        assertNotNull(player);
    }
}
