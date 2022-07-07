/**
 * GrilledChicken class is extending GrillingFood to grill the chicken in this class to make it consumable and disposable
 * @author Suliman Esmail
 * @since 6/13/2022
 * @version 0.1
 *
 */


public class GrilledChicken extends GrillingFood implements Consumable, Disposable {
    /**
     * This method is getting the aspects of the GrilledChicken constructor.
     * @param quantity is being used to get the amount of chicken when calling for the GrilledChicken class
     */
    public GrilledChicken(int quantity) {
        super("Chicken", 20, "Thick crispy outer crust", "Still food in the plate", quantity);
    }


    /**
     * this interface consume() is substructing one of the quantity of the food which the consume() method is called
     */
    @Override
    public void consume() {
        this.setQuantity(this.quantity - 1);
    }

    /**
     * this interface dispose() is setting the CheckFood to a new name showing that the food is being disposed
     */
    @Override
    public void dispose() {

        if (this.quantity == 0) {
            this.setCheckFood("Empty plate in the sink");
        }
    }


}
