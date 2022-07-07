package PetStoreAPITest;

import PetStoreAPI.Animal;
import PetStoreAPI.Reptile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReptileTest {

    public enum Sex {M, F, U}

    Reptile t1;
    Reptile t2;

    @BeforeEach
    public void setUp() {
        t1 = new Reptile("anole", 9.00, 2, Animal.Sex.U, 1, 0.1,
                6, "green", "none", "no tail", "none", false,
                "none");
        t2 = new Reptile("box turtle", 59.39, 1, Animal.Sex.F, 5, 5.3,
                12, "brown", "none", "shell missing", "none", true,
                "none");
    }

    @Test
    public void testInitialState() {
        assertEquals("anole", t1.getSpecies());
        assertEquals(9.00, t1.getItemValue());
        assertEquals(2, t1.getQuantity());
        assertEquals(Animal.Sex.U, t1.getSex());
        assertEquals(1, t1.getAge());
        assertEquals(0.1, t1.getWeight());
        assertEquals(6, t1.getLength());
        assertEquals("green", t1.getColor());
        assertEquals("none", t1.getMorphology());
        assertEquals("no tail", t1.getIdMarks());
        assertEquals("none", t1.getImage());
        assertFalse(t1.getBeenFed());
        assertEquals("none", t1.getComments());

        assertEquals("box turtle", t2.getSpecies());
        assertEquals(59.39, t2.getItemValue());
        assertEquals(1, t2.getQuantity());
        assertEquals(Animal.Sex.F, t2.getSex());
        assertEquals(5, t2.getAge());
        assertEquals(5.3, t2.getWeight());
        assertEquals(12, t2.getLength());
        assertEquals("brown", t2.getColor());
        assertEquals("none", t2.getMorphology());
        assertEquals("shell missing", t2.getIdMarks());
        assertEquals("none", t2.getImage());
        assertTrue(t2.getBeenFed());
        assertEquals("none", t2.getComments());
    }
}