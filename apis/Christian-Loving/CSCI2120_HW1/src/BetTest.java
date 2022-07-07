import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetTest {

    Bet bet;
    @BeforeEach
    void setUp() {
        bet = new Bet(10);
    }

    @Test
    void win() {
        bet.win();
        assertEquals(110, bet.getChipQuantity());
    }

    @Test
    void lose() {
        bet.lose();
        assertEquals(90, bet.getChipQuantity());
    }

    @Test
    void testToString() {
        bet.lose();
        assertEquals("Chet Manly has $1000000 in his account and is holding 90 chips.", bet.toString());
    }
}