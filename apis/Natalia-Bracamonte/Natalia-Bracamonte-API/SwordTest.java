import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordTest {

    @Test
    void consume() {
    }

    @Test
    void destroy() {
    }

    @Test
    void testToString() {
        Sword sword = new Sword();
        String expected = "Iron Sword/5gp [2/2]" ;
        assertEquals(expected, sword.toString());
    }
}