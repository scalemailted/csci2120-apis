import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrossbowTester {

    @Test
        void consume() {
    }

    @Test
        void destroy(){

    }

    @Test
        void testToString() {
        Crossbow crossbow = new Crossbow();
        String expected = "Crossbow/5gp [2/2]" ;
        assertEquals(expected, crossbow.toString());
    }
}