package PetStoreAPITest;

import PetStoreAPI.Animal;
import PetStoreAPI.Fish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    public enum Sex {M, F, U}

    Fish t1;
    Fish t2;

    @BeforeEach
    public void setUp() {
        t1 = new Fish("guppy", 2.00, 2, Animal.Sex.U, 1, 2,
                "blue", "none", "none", true, "none");
        t2 = new Fish("shark", 1999.49, 1, Animal.Sex.M, 2, 28,
                "gray", "scar on snout", "none", false,"mean");
    }

    @Test
    public void testInitialState() {
        assertEquals("guppy", t1.getSpecies());
        assertEquals(2.00, t1.getItemValue());
        assertEquals(2, t1.getQuantity());
        assertEquals(Animal.Sex.U, t1.getSex());
        assertEquals(1, t1.getAge());
        assertEquals(2, t1.getLength());
        assertEquals("blue", t1.getColor());
        assertEquals("none", t1.getIdMarks());
        assertEquals("none", t1.getImage());
        assertTrue(t1.getBeenFed());
        assertEquals("none", t1.getComments());

        assertEquals("shark", t2.getSpecies());
        assertEquals(1999.49, t2.getItemValue());
        assertEquals(1, t2.getQuantity());
        assertEquals(Animal.Sex.M, t2.getSex());
        assertEquals(2, t2.getAge());
        assertEquals(28, t2.getLength());
        assertEquals("gray", t2.getColor());
        assertEquals("scar on snout", t2.getIdMarks());
        assertEquals("none", t2.getImage());
        assertFalse(t2.getBeenFed());
        assertEquals("mean", t2.getComments());
    }
}