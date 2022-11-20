package tdd;

import TurtleGraphics.Direction;
import TurtleGraphics.Position;
import TurtleGraphics.Turtle;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;

import static org.testng.Assert.*;

public class TurtleTest {
    @Test
    public void turtleExistTest(){
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUpTest(){
        Turtle ijapa = new Turtle();
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }
    @Test
    public void turtleCanMovePenDownTest(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        Turtle ijapa = new Turtle();
        assertEquals(EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH,ijapa.getCurrentDirection());
        }

        @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
            Turtle ijapa = new Turtle();
            ijapa.turnRight();
            assertEquals(SOUTH,ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(WEST,ijapa.getCurrentDirection());
        }

        @Test
        public void turtleCanTurnRightWhileFacingWestTest(){
            Turtle ijapa = new Turtle();
            ijapa.turnRight();
            assertEquals(SOUTH,ijapa.getCurrentDirection());

            ijapa.turnRight();
            assertEquals(WEST,ijapa.getCurrentDirection());

            ijapa.turnRight();
            assertEquals(NORTH,ijapa.getCurrentDirection());
        }

        @Test
    public void turtleCanTurnRightWhileFacingNorthTest(){
            Turtle ijapa = new Turtle();
            ijapa.turnRight();
            assertEquals(SOUTH,ijapa.getCurrentDirection());

            ijapa.turnRight();
            assertEquals(WEST,ijapa.getCurrentDirection());

            ijapa.turnRight();
            assertEquals(NORTH,ijapa.getCurrentDirection());

            ijapa.turnRight();
            assertEquals(EAST,ijapa.getCurrentDirection());

        }

        @Test
       public void turtleCanTurnLeftWhileFacingEastTest(){
            Turtle ijapa = new Turtle();
            assertEquals(EAST,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(NORTH,ijapa.getCurrentDirection());
        }

        @Test
        public void turtleCanTurnLeftWhileFacingNorthTest(){
            Turtle ijapa = new Turtle();
            ijapa.turnLeft();
            assertEquals(NORTH,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(WEST,ijapa.getCurrentDirection());


        }
        @Test
        public void turtleCanTurnLeftWhileFacingWestTest(){
            Turtle ijapa = new Turtle();
            ijapa.turnLeft();
            assertEquals(NORTH,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(WEST,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(SOUTH,ijapa.getCurrentDirection());
        }

        @Test
        public void turtleCanTurnLeftWhileFacingSouthTest(){
            Turtle ijapa = new Turtle();
            ijapa.turnLeft();
            assertEquals(NORTH,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(WEST,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(SOUTH,ijapa.getCurrentDirection());

            ijapa.turnLeft();
            assertEquals(EAST,ijapa.getCurrentDirection());
        }

        @Test
        public void turtleCanMoveForwardWhileFacingEastTest(){
            Turtle ijapa = new Turtle();
            assertEquals(new Position(0,0),ijapa.getCurrentPosition());
            ijapa.move(5);
            assertEquals(new Position(0,5),ijapa.getCurrentPosition() );
        }
        @Test
       public void turtleCanMoveForwardWhileFacingSouthTest(){
            Turtle ijapa = new Turtle();
            assertEquals(new Position(0,0),ijapa.getCurrentPosition() );
            ijapa.move(5);
            assertEquals(new Position(0,5),ijapa.getCurrentPosition() );
            ijapa.move(4);
            assertEquals(new Position(0,1),ijapa.getCurrentPosition());
        }
    }

