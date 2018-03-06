import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantTortoiseTest {

    GiantTortoise giantTortoise;
    Humvee humvee;
    ApartmentBlock apartmentBlock;

    @Before
    public void before(){
        giantTortoise = new GiantTortoise("Frank", 150, 25);
        humvee = new Humvee("Carrier", 20);
        apartmentBlock = new ApartmentBlock("three storey mass dwelling", 20);
    }

    @Test
    public void getName(){
        assertEquals("Frank", giantTortoise.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(150, giantTortoise.getHealth());
    }

    @Test
    public void getAttack(){
        assertEquals(15, giantTortoise.getAttack());
    }

    @Test
    public void roar(){
        assertEquals("ROAR!!", giantTortoise.roar());
    }

    @Test
    public void canAttack(){
        assertEquals("Carrier has been damaged and health is currently 5", giantTortoise.attackVechile(humvee));
    }

    @Test
    public void canMove(){
        assertEquals("Frank has just Magic Rolled", giantTortoise.move("Magic Rolled"));
    }

    @Test
    public void canAttackBuilding(){
        assertEquals("a three storey mass dwelling has been destroyed by Frank!", giantTortoise.buildingAttack(apartmentBlock));
    }

}
