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
 *An example class for creating a Cutting torch obj.
 *
 */
public class CuttingTorch extends Equipment implements Namable, Consumable, Typeable, Flammable {
    /**
     *
     * @param quantity Requires quantity input.
     */
    public CuttingTorch(int quantity) {
        super("Welder", "toolName", quantity, 10);
    }

    /**
     *
     * @return sets toolname to given value and returns.
     */
    @Override
    public String name(String n) {
        this.setToolName(n);
        return this.getToolName();
    }

    /**
     * @ensures quantity is > 0 and > maxQuantity.
     * @return quantity - 1.
     */
    @Override
    public int consume() {
        if(this.quantity <= this.getMaxQuantity() && this.quantity >= 0) {
            this.setQuantity(this.quantity - 1);
        }
        else if(this.quantity < 0){
            this.setQuantity(0);
        }
        else{
            this.setQuantity(this.maxQuantity);
        }
        return this.quantity;
    }

    /**
     *
     * @return Quantity set to 0.
     */
    @Override
    public int explode() {
        this.quantity = 0;
        return this.quantity;
    }

    /**
     *
     * @return returns current toolType.
     */
    @Override
    public String type(String s) {
        this.setToolType(s);
        return this.getToolType();

    }
    public String toString(){
        String text = String.format(" %s/ %s/ %d",toolName,toolType,quantity);
        return text;
    }

}
