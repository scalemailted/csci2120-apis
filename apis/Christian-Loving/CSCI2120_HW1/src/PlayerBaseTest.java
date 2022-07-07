import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerBaseTest {

    PlayerBase player;
    @BeforeEach
    void setUp() {
            player = new Bet(10);
        }

    @Test
    void getPlayerName() {
        player.setPlayerName("Chet Manly");
        assertEquals("Chet Manly", player.getPlayerName());
    }

    @Test
    void setPlayerName() {
        //see getPlayerName() test above
    }

    @Test
    void getPlayerValue() {
        player.setPlayerValue(1000000);
        assertEquals(1000000, player.getPlayerValue());
    }

    @Test
    void setPlayerValue() {
        //see getPlayerValue() test above
    }
}