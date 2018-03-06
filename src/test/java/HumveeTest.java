import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumveeTest {

    Humvee humvee;
    GiantTortoise giantTortoise;

    @Before
    public void before(){
        humvee = new Humvee("Carrier", 15);
        giantTortoise = new GiantTortoise("Pascal", 200, 50);
    }

    @Test
    public void getType(){
        assertEquals("Carrier", humvee.getType());
    }

    @Test
    public void getHealth(){
        assertEquals(15, humvee.getHealth());
    }

    @Test
    public void canAttackKaiju(){
        assertEquals("Carrier has attacked Pascal", humvee.armyAttack(giantTortoise));
    }
}
