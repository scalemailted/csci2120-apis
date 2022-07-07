package MetalShopAPI.Equipment;

import MetalShopAPI.Interfaces.Consumable;
import MetalShopAPI.Interfaces.Flammable;
import MetalShopAPI.Interfaces.Namable;
import MetalShopAPI.Interfaces.Typeable;

/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An example class for creating a Welder obj.
 *
 */

public class Welder extends Equipment implements Namable, Consumable, Typeable, Flammable {
    /**
     *
     * @param quantity Requires an integer for quantity of tool being created.
     */
    public Welder(int quantity) {
        super("Welder", "toolName", quantity, 10);
        this.quantity = quantity;
    }

    /**
     * No argument constructor
     */
    public Welder(){
        this(1);
    }

    /**
     *
     * @return Returns the current name of the tool.
     */
    @Override
    public String name(String n) {

        this.setToolName(this.getToolName());
        return this.toolName;
    }

    /**
     * @ensures that the Quantity is less than maxQuantity, and that the current quantity is greater than 0.
     * @return the set quantity after consume has ben called.
     */

    @Override
    public int consume() {
        if(this.quantity <= maxQuantity && this.quantity >= 0) {
            this.setQuantity(this.quantity - 1);
        }
        else if(this.quantity < 0){
            this.setQuantity(0);
        }
        else{
            this.setQuantity(maxQuantity);
        }
        return this.quantity;
    }

    /**
     * @ensures this.quantity = 0.
     * @return new this.quantity set to 0.
     */
    @Override
    public int explode() {
        if(this.quantity > 0) {
            this.quantity = 0;
        }
        else{
            this.quantity = 0;
        }
        return this.quantity;
    }

    /**
     *
     * @return returns the current toolType.
     */
    @Override
    public String type(String s) {
        this.setToolType(s);
       return this.getToolType();
/**
 * @ensures output is String.
 */
    }
    public String toString(){
        String text = String.format(" %s/ %s/ %d",toolName,toolType,quantity);
        return text;
    }

}
