package PetStoreAPITest;

import PetStoreAPI.Food;
import PetStoreAPI.ItemBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodTest {

    public enum AnimalType{Mammal, Reptile, Fish, Bird}
    Food t1;
    Food t2;
    Food t3;

    @BeforeEach
    public void setUp() {
        t1 = new Food(1.99, "Meow Mix", ItemBase.AnimalType.Mammal, "cat", 5);
        t2 = new Food(10.00, "flies", ItemBase.AnimalType.Reptile, "crested gecko", 10);
        t3 = new Food(10, "seed", ItemBase.AnimalType.Bird, "African Grey Parrot", 15);
    }

    @Test
    public void testInitialState() {
        assertEquals(1.99, t1.getItemValue());
        assertEquals("Meow Mix", t1.getItemName());
        assertEquals(ItemBase.AnimalType.Mammal, t1.getAnimalType());
        assertEquals("cat", t1.getSpecies());
        assertEquals(5, t1.getQuantity());

        assertEquals(10.00, t2.getItemValue());
        assertEquals("flies", t2.getItemName());
        assertEquals(ItemBase.AnimalType.Reptile, t2.getAnimalType());
        assertEquals("crested gecko", t2.getSpecies());
        assertEquals(10, t2.getQuantity());

        assertEquals(10, t3.getItemValue());
        assertEquals("seed", t3.getItemName());
        assertEquals(ItemBase.AnimalType.Bird, t3.getAnimalType());
        assertEquals("African Grey Parrot", t3.getSpecies());
        assertEquals(15, t3.getQuantity());
    }

    @Test
    void use() {
    }

    @Test
    void sell() {
    }

    @Test
    void stock() {
    }

    @Test
    void getQuantity() {
    }

    @Test
    void setQuantity() {
    }

    @Test
    void getItemValue() {
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

    @Test
    void getAnimalType() {
    }

    @Test
    void setAnimalType() {
    }

    @Test
    void getSpecies() {
    }

    @Test
    void setSpecies() {
    }
}