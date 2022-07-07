package src.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Arrow;

class ArrowTest {

    @Test
    void testConsume() {
        Arrow a = new Arrow();
        a.consume();
        Assertions.assertEquals(0,a.getQuantity());
    }

    @Test
    void testDestroy() {
        Arrow a = new Arrow();
        a.destroy();
        Assertions.assertEquals("Arrows", a.getItemName());
    }


}