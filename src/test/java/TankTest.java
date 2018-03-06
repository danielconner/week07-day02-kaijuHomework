import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    RobotJesus jesus;

    @Before
    public void before(){
        tank = new Tank("Destroya", 35);
        jesus = new RobotJesus("Dave", 100, 20);
    }

    @Test
    public void getType(){
        assertEquals("Destroya", tank.getType());
    }

    @Test
    public void getHealth(){
        assertEquals(35, tank.getHealth());
    }

    @Test
    public void canAttackKaiju(){
        assertEquals("Destroya has attacked Dave", tank.armyAttack(jesus));
    }

    @Test
    public void canNukeKiaju(){
        assertEquals("Destroya has nuked Dave", tank.nuke(jesus));
    }
}
