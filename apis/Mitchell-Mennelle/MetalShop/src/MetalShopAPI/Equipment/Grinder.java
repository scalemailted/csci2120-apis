package MetalShopAPI.Equipment;

import MetalShopAPI.Interfaces.Consumable;
import MetalShopAPI.Interfaces.Flammable;
import MetalShopAPI.Interfaces.Namable;
import MetalShopAPI.Interfaces.Typeable;

/*
this class is just for an example of the variety of tool that can be created.
 */

/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An example class for creating a grinder tool.
 *
 */

public class Grinder extends Equipment implements Namable, Consumable, Typeable, Flammable {

    public Grinder(int quantity) {
        super("PowerTool", "toolName", quantity, 10);
    }


    public Grinder(){

        this(1);
    }

    @Override
    public String name(String n) {

        this.setToolName(this.toolName);
        return null;
    }

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
    @Override
    public int explode() {
        this.quantity = 0;
        return this.quantity;
    }


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
