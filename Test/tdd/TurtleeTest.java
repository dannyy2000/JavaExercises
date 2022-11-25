package tdd;

import Chapter7.Penn;
import Chapter7.PennPosition;
import Chapter7.Turtlee;
import TurtleGraphics.Pen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;

public class TurtleeTest {
    private Turtlee ijapa;

@BeforeEach
public void setUp(){
    ijapa = new Turtlee();
    Penn biro = new Penn();
    ijapa.setPenn(biro);
}

@Test
    public void changePenPosition(){
    assertEquals(PennPosition.UP,ijapa.getPenn().getPosition());
}
}