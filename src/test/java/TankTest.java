import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;

    @Before
    public void before(){
        tank = new Tank("Destroya", 35);
    }

    @Test
    public void getType(){
        assertEquals("Destroya", tank.getType());
    }

    @Test
    public void getHealth(){
        assertEquals(35, tank.getHealth());
    }
}
