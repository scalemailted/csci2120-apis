import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriedChickenTest {


        @Test
        void consumeCheck(){
            FriedChicken f = new FriedChicken(4);
            f.consume();
            assertEquals(3, f.getQuantity());

        }

        @Test
        void checkDisposeIfThereIsChicken(){
            FriedChicken f = new FriedChicken(4);
            f.dispose();
            assertEquals("Still food in the plate", f.getCheckFood());

        }

        @Test
        void checkDisposeIfNoChicken(){
            FriedChicken f = new FriedChicken(0);
            f.fry();
            f.dispose();
            assertEquals("Fried Chicken", f.getFoodName());
            assertEquals("The bones are in the garbage", f.getCheckFood());

        }

        @Test
        void fryingMethod(){
            FriedChicken f = new FriedChicken(4);
            f.fry();
            assertEquals("Fried Chicken", f.getFoodName());

        }
        @Test
        void consumeAndDisposeCheck(){
            FriedChicken f = new FriedChicken(1);
            f.fry();
            f.consume();
            f.dispose();
            assertEquals(0, f.getQuantity());
            assertEquals("The bones are in the garbage", f.getCheckFood());

        }

    @Test
    void toStringcheck(){
        FriedChicken f = new FriedChicken(1);
        f.fry();
        f.consume();
        assertEquals("FriedChicken{quantity=0, Crust='Thick crispy outer crust', NumOfMinsToCook=20, foodName='Fried Chicken'}", f.toString());

    }






}