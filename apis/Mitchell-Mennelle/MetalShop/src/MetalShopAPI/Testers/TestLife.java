package MetalShopAPI.Testers;

import MetalShopAPI.Person.Life;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLife {

    @Test
    void hurt() {
        Life l1 = new Life(2);
        l1.hurt(new Life(l1.getLifeQty()));
        assertEquals(1,l1.getLifeQty());
        l1.hurt(new Life(l1.getLifeQty()));
        assertEquals(0,l1.getLifeQty());
        //Testing 0 boundary.
        l1.hurt(new Life(l1.getLifeQty()));
        assertEquals(0,l1.getLifeQty());
        //Testing min health boundary.
        l1.setLifeQty(2);
        l1.setMinHealth(2);
        l1.hurt(new Life(l1.getLifeQty()));
        assertEquals(2,l1.getLifeQty());
    }

    @Test
    void stack() {
       Life l2 = new Life(7);
        l2.stack(new Life(l2.getLifeQty()));
        assertEquals(8,l2.getLifeQty());
        //Testing max health boundary.
        l2.setMaxHealth(8);
        l2.stack(new Life(l2.getLifeQty()));
        assertEquals(8,l2.getLifeQty());
    }

    @Test
    void getMaxHealth() {
        Life l3 = new Life(1);
        l3.setMaxHealth(5);
        assertEquals(5,l3.getMaxHealth());
        //Testing negative integer boundary
        l3.setMaxHealth(-1);
        assertEquals(0,l3.getMaxHealth());
    }

    @Test
    void setMaxHealth() {
        Life l4 = new Life(1);
        l4.setMaxHealth(6);
        assertEquals(6,l4.getMaxHealth());
        //Testing negative integer boundary
        l4.setMaxHealth(-1);
        assertEquals(0,l4.getMaxHealth());
    }

    @Test
    void setMinHealth() {
        Life l5 = new Life(1);
        l5.setMinHealth(5);
        assertEquals(5,l5.getMinHealth());
        //Testing negative integer boundary.
        l5.setMinHealth(-5);
        assertEquals(0,l5.getMinHealth());
    }

    @Test
    void getMinHealth() {
        Life l6 = new Life(1);
        l6.setMinHealth(6);
        assertEquals(6,l6.getMinHealth());
        //Testing negative integer boundary
        l6.setMinHealth(-1);
        assertEquals(0,l6.getMinHealth());

    }

    @Test
    void getLifeQty() {
        Life l7 = new Life(10);
        assertEquals(10,l7.getLifeQty());
        //Testing negative integer boundary.
        l7.setLifeQty(-1);
        assertEquals(0,l7.getLifeQty());
    }

    @Test
    void setLifeQty() {
        Life l8 = new Life(1);
        l8.setLifeQty(6);
        assertEquals(6,l8.getLifeQty());
        //Testing negative integer boundary.
        l8.setLifeQty(-1);
        assertEquals(0,l8.getLifeQty());
    }
}