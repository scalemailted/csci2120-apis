/**
 * FriedChicken class is extending FryingFood to fry the chicken in this class to make it consumable and disposable
 * @author Suliman Esmail
 * @since 6/13/2022
 * @version 0.1
 *
 */



public class FriedChicken extends FryingFood implements Consumable, Disposable{

    /**
     * This method is getting the aspects of the FriedChicken constructor.
     *
     * @param quantity is being used to get the amount of chicken when calling for the FriedChicken class
     */
    public FriedChicken(int quantity) {
        super("Chicken", 20, "Thick crispy outer crust", "Still food in the plate", quantity);
    }



    /**
     *   this interface consume() is subtracting one of the quantity of the food to consume
     */

    @Override
    public void consume() {
        if (this.quantity > 0) {
            this.setQuantity(this.quantity - 1);
        }
        else {
            this.setQuantity(0);
        }
    }

    /**
     *  this interface dispose() is setting the CheckFood to a new name showing that the food is being disposed
     */
    @Override
    public void dispose(){

        if(this.quantity == 0) {
            this.setCheckFood("The bones are in the garbage");
        }

    }


    @Override
    public String toString() {
        return "FriedChicken{" +
                "quantity=" + quantity +
                ", Crust='" + Crust + '\'' +
                ", NumOfMinsToCook=" + NumOfMinsToCook +
                ", foodName='" + foodName + '\'' +
                '}';
    }


}