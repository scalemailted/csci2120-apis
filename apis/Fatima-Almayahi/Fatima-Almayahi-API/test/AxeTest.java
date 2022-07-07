import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.rpg.items.Axe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class AxeTest {
    private static Axe axe;

    @BeforeAll
    static void setup() {
        axe = new Axe("Golden axe", 2.2, 12, 7);
    }

    @Test
    void getMax_damageTest() {
        assertEquals(7, axe.getMax_damage());
    }

    @Test
    void damageTest() {
        double damage = axe.damage();
        assumeTrue(damage > 0);
        assumeTrue(damage <= axe.getMax_damage());

    }
    @Test
    void getNameTest(){
        assertEquals("Golden axe", axe.getName());
    }

    @Test
    void getWeightTest(){
        assertEquals(2.2, axe.getWeight());
    }
}