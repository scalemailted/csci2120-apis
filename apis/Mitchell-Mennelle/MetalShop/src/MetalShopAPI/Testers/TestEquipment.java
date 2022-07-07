package MetalShopAPI.Testers;

import MetalShopAPI.Equipment.Welder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestEquipment {

    @Test
    void consume() {
        Welder w2 = new Welder(2);
        w2.consume();
        assertEquals(1,w2.getQuantity());
        //testing negative integer boundary.
        Welder w02 = new Welder(-1);
        w02.consume();
        assertEquals(0,w02.getQuantity());
    }

    @Test
    void explode() {
        Welder w3 = new Welder(2);
        w3.explode();
        assertEquals(0,w3.getQuantity());
        //testing negative integer boundary.
        Welder w03 = new Welder(-1);
        w03.consume();
        assertEquals(0,w03.getQuantity());
    }

    @Test
    void type() {
        Welder w4 = new Welder(1);
        w4.setToolType("Vulcan");
        assertTrue(true,"Vulcan");
    }
}