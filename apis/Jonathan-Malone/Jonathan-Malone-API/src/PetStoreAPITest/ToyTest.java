package PetStoreAPITest;

import PetStoreAPI.ItemBase;
import PetStoreAPI.Toy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToyTest {

    public enum AnimalType {Mammal, Reptile, Fish, Bird}

    Toy t1;
    Toy t2;

    @BeforeEach
    public void setUp() {
        t1 = new Toy(4.99, "rubber ball", ItemBase.AnimalType.Mammal, "dog",
                1);
        t2 = new Toy(2.19, "castle", ItemBase.AnimalType.Fish, "goldfish",
                1);
    }

    @Test
    public void testInitialState() {
        assertEquals(4.99, t1.getItemValue());
        assertEquals("rubber ball", t1.getItemName());
        assertEquals(ItemBase.AnimalType.Mammal, t1.getAnimalType());
        assertEquals("dog", t1.getSpecies());
        assertEquals(1, t1.getQuantity());

        assertEquals(2.19, t2.getItemValue());
        assertEquals("castle", t2.getItemName());
        assertEquals(ItemBase.AnimalType.Fish, t2.getAnimalType());
        assertEquals("goldfish", t2.getSpecies());
        assertEquals(1, t2.getQuantity());
    }
}

