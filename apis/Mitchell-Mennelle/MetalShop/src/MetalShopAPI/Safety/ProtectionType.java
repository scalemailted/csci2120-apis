package MetalShopAPI.Safety;

import MetalShopAPI.Interfaces.Breakable;
import MetalShopAPI.Interfaces.Consumable;
import MetalShopAPI.Interfaces.Stackable;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An abstract class for creating a Protection object.
 * this is for creating a safety object that could be used with equipment and life in order to simulate real
 * world outcomes from using power tools with/without safety equipment.
 */
public abstract class ProtectionType extends ProtectionBase implements Consumable, Breakable, Stackable {

    /**
     *
     * @param protectType Type of PPE.
     * @param protectQty Amount needed.
     */
    public ProtectionType(String protectType, int protectQty) {
        super(protectType, protectQty);
        this.protectType = protectType;
        this.protectQty = protectQty;
    }

    @Override
    public abstract int breakIt();


    @Override
    public abstract int consume();

    /**
     *
     * @param add obj passed in must be of type Stackable.
     * @ensures Qty will increase by 1 Unless set to 0.
     */
    @Override
    public void stack(Stackable add) {

        if (add instanceof ProtectionType) {
            ProtectionType qty = (ProtectionType) add;
            if (qty.getProtectQty() >= 0) {
                this.setProtectQty(qty.getProtectQty());
                this.protectQty += 1;
            } else {
                this.protectQty = 0;
            }
        }
    }


}
