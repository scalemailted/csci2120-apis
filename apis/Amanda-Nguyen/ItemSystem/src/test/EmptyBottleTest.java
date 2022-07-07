package src.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.EmptyBottle;

class EmptyBottleTest {

    @Test
    void fill() {
        EmptyBottle eb = new EmptyBottle();
        eb.fill();


    }
    @Test
    void destroy(){
        EmptyBottle eb = new EmptyBottle();
        eb.destroy();
        Assertions.assertEquals("Broken Bottles", eb.getItemName());

    }
}