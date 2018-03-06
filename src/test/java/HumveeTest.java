import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumveeTest {

    Humvee humvee;

    @Before
    public void before(){
        humvee = new Humvee("Carrier", 15);
    }

    @Test
    public void getType(){
        assertEquals("Carrier", humvee.getType());
    }

    @Test
    public void getHealth(){
        assertEquals(15, humvee.getHealth());
    }
}
