package PetStoreAPITest;

import PetStoreAPI.Animal;
import PetStoreAPI.Mammal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MammalTest {

    public enum Sex {M, F, U}

    Mammal t1;
    Mammal t2;

    @BeforeEach
    public void setUp() {
        t1 = new Mammal("rabbit", 39.00, 2, Animal.Sex.F, 1, 5.2,
                12, "black", "missing ear", "bunny.jpg", true,
                "crazy and bites");
        t2 = new Mammal("gerbil", 20.00, 1, Animal.Sex.U, 1, 0.5,
                6, "tan", "none", "sillygerbil.png", true,
                "glad this one is gone");
    }

    @Test
    public void testInitialState() {
        assertEquals("rabbit", t1.getSpecies());
        assertEquals(39.00, t1.getItemValue());
        assertEquals(2, t1.getQuantity());
        assertEquals(Animal.Sex.F, t1.getSex());
        assertEquals(1, t1.getAge());
        assertEquals(5.2, t1.getWeight());
        assertEquals(12, t1.getHeight());
        assertEquals("black", t1.getColor());
        assertEquals("missing ear", t1.getIdMarks());
        assertEquals("bunny.jpg", t1.getImage());
        assertTrue(t1.getBeenFed());
        assertEquals("crazy and bites", t1.getComments());

        assertEquals("gerbil", t2.getSpecies());
        assertEquals(20.00, t2.getItemValue());
        assertEquals(1, t2.getQuantity());
        assertEquals(Animal.Sex.U, t2.getSex());
        assertEquals(1, t2.getAge());
        assertEquals(0.5, t2.getWeight());
        assertEquals(6, t2.getHeight());
        assertEquals("tan", t2.getColor());
        assertEquals("none", t2.getIdMarks());
        assertEquals("sillygerbil.png", t2.getImage());
        assertTrue(t2.getBeenFed());
        assertEquals("glad this one is gone", t2.getComments());
    }
}