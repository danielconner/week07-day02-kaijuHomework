import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotJesusTest {

    RobotJesus robotJesus;
    Tank  tank;

    @Before
    public void before(){
        robotJesus = new RobotJesus("Chucky", 100, 25);
        tank = new Tank("Bombadier", 25);
    }

    @Test
    public void getName(){
        assertEquals("Chucky", robotJesus.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(100, robotJesus.getHealth());
    }

    @Test
    public void getAttack(){
        assertEquals(25, robotJesus.getAttack());
    }

    @Test
    public void roar(){
        assertEquals("ROAR!!", robotJesus.roar());
    }

    @Test
    public void canAttack() {
        assertEquals("Bombadier has been destroyed", robotJesus.attackVechile(tank));
    }

    @Test
    public void canMove(){
        assertEquals("Chucky has just levitated", robotJesus.move("levitated"));
    }
}
