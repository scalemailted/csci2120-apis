package MetalShopAPI.Testers;

import MetalShopAPI.Safety.Protection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestProtection {

    @Test
    void breakIt() {
        Protection s1 = new Protection("eyes",4);
        s1.breakIt();
        assertEquals(2,s1.getProtectQty());
        //testing negative integer boundary.
        Protection s01 = new Protection("eyes",-1);
        s01.breakIt();
        assertEquals(0,s01.getProtectQty());
    }

    @Test
    void consume() {
        Protection s2 = new Protection("eyes",4);
        s2.consume();
        assertEquals(3,s2.getProtectQty());
        //testing negative integer boundary.
        Protection s02 = new Protection("eyes",-1);
        s02.consume();
        assertEquals(0,s02.getProtectQty());
    }
}