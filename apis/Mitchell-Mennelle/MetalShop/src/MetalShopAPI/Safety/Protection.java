package MetalShopAPI.Safety;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *A class providing methods for a safety object.
 * this is for creating a safety object that could be used with equipment and life in order to simulate real
 * world outcomes from using power tools with/without safety equipment.
 */
public class Protection extends ProtectionType {
    /**
     *
     * @param protectType Type
     * @param protectQty How many are needed.
     */

    public Protection(String protectType, int protectQty) {
        super(protectType, protectQty);
        this.protectType = protectType;
        this.protectQty = protectQty;
    }

    /**
     *
     * @return Sets protectQty to 0.
     */
    @Override
    public int breakIt() {
        if(this.protectQty > 0) {
            this.setProtectQty(this.protectQty - 2);
        }
        else{
            this.protectQty = 0;
        }
        return this.protectQty;
    }

    /**
     *
     * @return subtracts on from current setProtect value.
     */
    @Override
    public int consume() {
        if(this.protectQty > 0) {
            this.setProtectQty(this.getProtectQty() - 1);
        }
        else{
            this.protectQty = 0;
        }
    return this.protectQty;
    }
    public String toString(){
        String text = String.format(" %s/%d",protectType,protectQty);
        return text;
    }


}
