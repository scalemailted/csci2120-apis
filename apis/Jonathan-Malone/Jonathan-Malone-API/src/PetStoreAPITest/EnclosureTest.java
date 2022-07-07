package PetStoreAPITest;

import PetStoreAPI.Enclosure;
import PetStoreAPI.ItemBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnclosureTest {

    public enum AnimalType {Mammal, Reptile, Fish, Bird}

    Enclosure t1;
    Enclosure t2;
    Enclosure t3;

    @BeforeEach
    public void setUp() {
        t1 = new Enclosure(199.99, "bird cage", ItemBase.AnimalType.Bird,
                "parrot", 1, 36, 40);
        t2 = new Enclosure(600.01, "terrarium", ItemBase.AnimalType.Reptile,
                "king snake", 1, 20, 48);
    }

    @Test
    public void testInitialState() {
        assertEquals(199.99, t1.getItemValue());
        assertEquals("bird cage", t1.getItemName());
        assertEquals(ItemBase.AnimalType.Bird, t1.getAnimalType());
        assertEquals("parrot", t1.getSpecies());
        assertEquals(1, t1.getQuantity());
        assertEquals(36, t1.getHeight());
        assertEquals(40, t1.getWidth());

        assertEquals(600.01, t2.getItemValue());
        assertEquals("terrarium", t2.getItemName());
        assertEquals(ItemBase.AnimalType.Reptile, t2.getAnimalType());
        assertEquals("king snake", t2.getSpecies());
        assertEquals(1, t2.getQuantity());
        assertEquals(20, t2.getHeight());
        assertEquals(48, t2.getWidth());
    }
}