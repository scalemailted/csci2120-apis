import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChipsTest {

    Chips chips;
    @BeforeEach
    void setUp() {
        chips = new Bet(10);
    }

    @Test
    void buyChips() {
        chips.buyChips(new Bet(10));
        assertEquals(200, chips.getChipQuantity());
    }

    @Test
    void cashOut() {
        chips.cashOut(new Bet(10));
        assertEquals(0, chips.getChipQuantity());
    }

    @Test
    void getChipQuantity() {
        chips.setChipQuantity(10);
        assertEquals(10, chips.getChipQuantity());
    }

    @Test
    void setChipQuantity() {
        //see getChipQuantity() test above
    }

    @Test
    void getBetQuantity() {
        chips.setBetQuantity(10);
        assertEquals(10, chips.getBetQuantity());
    }

    @Test
    void setBetQuantity() {
        //see getBetQuantity() test above
    }

    @Test
    void getMinBuyin() {
        chips.setMinBuyin(10);
        assertEquals(10, chips.getMinBuyin());
    }

    @Test
    void setMinBuyin() {
        //see getMinBuyin() test above
    }

    @Test
    void getChipValue() {
        chips.setChipValue(10);
        assertEquals(10, chips.getChipValue());
    }

    @Test
    void setChipValue() {
        //see getChipValue() test above
    }
}