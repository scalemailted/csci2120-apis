package PetStoreAPITest;

import PetStoreAPI.ItemBase;
import  PetStoreAPI.Bedding;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BeddingTest {

    public enum AnimalType{Mammal, Reptile, Fish, Bird}
    Bedding t1;
    Bedding t2;

    @BeforeEach
    public void setUp() {
        t1 = new Bedding(19.99, "wood shavings", ItemBase.AnimalType.Reptile,
                "ball python", 1);
        t2 = new Bedding(9.99, "puppy pad", ItemBase.AnimalType.Mammal,
                "dog", 10);
    }

    @Test
    public void testInitialState() {
        assertEquals(19.99, t1.getItemValue());
        assertEquals("wood shavings", t1.getItemName());
        assertEquals(ItemBase.AnimalType.Reptile, t1.getAnimalType());
        assertEquals("ball python", t1.getSpecies());
        assertEquals(1, t1.getQuantity());

        assertEquals(9.99, t2.getItemValue());
        assertEquals("puppy pad", t2.getItemName());
        assertEquals(ItemBase.AnimalType.Mammal, t2.getAnimalType());
        assertEquals("dog", t2.getSpecies());
        assertEquals(10, t2.getQuantity());
    }
    }