import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ItemTester {

    @Test
    public void testItemVal(){
        Sword s1 = new Sword();
        assertEquals(2, s1.getQuantity());
    }

    @Test
    void setItemValue() {
    }

    @Test
    void getItemName() {
    }

    @Test
    void setItemName() {
    }
}