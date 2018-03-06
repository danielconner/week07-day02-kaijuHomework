import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApartmentBlockTest {

    ApartmentBlock apartmentBlock;

    @Before
    public void before(){
        apartmentBlock = new ApartmentBlock("three storey mass dwelling", 20);

    }

    @Test
    public void getName(){
        assertEquals("three storey mass dwelling", apartmentBlock.getType());
    }

    @Test
    public void getDamageLimit(){
        assertEquals(20, apartmentBlock.getDamagedLimit());
    }
}
