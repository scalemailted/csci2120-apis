package src.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Potion;

class PotionTest {

    @Test
    void consume() {
        Potion p = new Potion();
        p.consume();
    }

    @Test
    void destroy() {
        Potion p = new Potion();
        p.destroy();
        Assertions.assertEquals("Broken Bottles", p.getItemName());
    }
}