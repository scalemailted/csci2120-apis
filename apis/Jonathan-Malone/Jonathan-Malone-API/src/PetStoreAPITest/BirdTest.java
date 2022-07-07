package PetStoreAPITest;

import PetStoreAPI.Animal;
import PetStoreAPI.Bird;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    public enum Sex {M, F, U}

    Bird t1;
    Bird t2;

    @BeforeEach
    public void setUp() {
        t1 = new Bird ("parrot", 800.00, 1, Animal.Sex.M, 20, 5.2, 18,
                "green", "olive", "none", "none", true, "none");
        t2 = new Bird("macaw", 2500.49, 1, Animal.Sex.F, 8, 12.34, 32,
                "red", "pied", "microchip", "none", false, "none");
    }

    @Test
    public void testInitialState() {
        assertEquals("parrot", t1.getSpecies());
        assertEquals(800.00, t1.getItemValue());
        assertEquals(1, t1.getQuantity());
        assertEquals(Animal.Sex.M, t1.getSex());
        assertEquals(20, t1.getAge());
        assertEquals(5.2, t1.getWeight());
        assertEquals(18, t1.getLength());
        assertEquals("green", t1.getColor());
        assertEquals("olive", t1.getMorphology());
        assertEquals("none", t1.getIdMarks());
        assertEquals("none", t1.getImage());
        assertTrue(t1.getBeenFed());
        assertEquals("none", t1.getComments());

        assertEquals("macaw", t2.getSpecies());
        assertEquals(2500.49, t2.getItemValue());
        assertEquals(1, t2.getQuantity());
        assertEquals(Animal.Sex.F, t2.getSex());
        assertEquals(8, t2.getAge());
        assertEquals(12.34, t2.getWeight());
        assertEquals(32, t2.getLength());
        assertEquals("red", t2.getColor());
        assertEquals("pied", t2.getMorphology());
        assertEquals("microchip", t2.getIdMarks());
        assertEquals("none", t2.getImage());
        assertFalse(t2.getBeenFed());
        assertEquals("none", t2.getComments());
    }

}