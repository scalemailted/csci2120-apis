import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.rpg.items.Axe;
import org.rpg.items.Sword;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class SwordTest {
    private static Sword sword;

    @BeforeAll
    static void setup() {
        sword = new Sword("Long sword", 7.2, 15, 8);
    }

    @Test
    void getMax_damageTest() {
        assertEquals(8, sword.getMax_damage());
    }

    @Test
    void damageTest() {
        double damage = sword.damage();
        assumeTrue(damage > 0);
        assumeTrue(damage <= sword.getMax_damage());

    }
    @Test
    void getNameTest(){
        assertEquals("Long sword", sword.getName());
    }

    @Test
    void getWeightTest(){
        assertEquals(7.2, sword.getWeight());
    }
}