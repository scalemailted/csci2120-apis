import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.rpg.items.Shield;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class ShieldTest {
    private static Shield shield;

    @BeforeAll
    static void setup() {
        shield = new Shield("Bronze shield", 3.3, 8, 4);
    }

    @Test
    void getMax_protectionTest() {
        assertEquals(4, shield.getMax_protection());

    }

    @Test
    void protectionTest(){
        double protection = shield.protection();
        assumeTrue(protection > 0);
        assumeTrue(protection <= shield.getMax_protection());

    }

    @Test
    void getNameTest(){
        assertEquals("Bronze shield", shield.getName());
    }

    @Test
    void getWeightTest(){
        assertEquals(3.3, shield.getWeight());
    }
}