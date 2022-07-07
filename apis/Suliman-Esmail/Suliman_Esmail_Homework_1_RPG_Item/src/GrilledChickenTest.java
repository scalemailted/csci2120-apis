import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrilledChickenTest {

    @Test
    void consumeCheck(){
        GrilledChicken a = new GrilledChicken(4);
        a.consume();
        assertEquals(3, a.getQuantity());

    }

    @Test
    void checkDisposeIfThereIsChicken(){
        GrilledChicken a = new GrilledChicken(4);
        a.dispose();
        assertEquals("Still food in the plate", a.getCheckFood());

    }

    @Test
    void checkDisposeIfNoChicken(){
        GrilledChicken a = new GrilledChicken(0);
        a.grill();
        a.dispose();
        assertEquals("Empty plate in the sink", a.getCheckFood());

    }

    @Test
    void grillingMethod(){
        GrilledChicken a = new GrilledChicken(4);
        a.grill();
        assertEquals("Grilled Chicken", a.getFoodName());

    }
    @Test
    void consumeAndDisposeCheck(){
        GrilledChicken f = new GrilledChicken(1);
        f.grill();
        f.consume();
        f.dispose();
        assertEquals("Empty plate in the sink", f.getCheckFood());

    }






}