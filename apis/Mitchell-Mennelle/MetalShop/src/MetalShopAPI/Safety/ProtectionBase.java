package MetalShopAPI.Safety;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An abstract class for creating a Protection object.
 * this is for creating a safety object that could be used with equipment and life in order to simulate real
 * world outcomes from using power tools with/without safety equipment.
 */
public abstract class ProtectionBase {
    protected String protectType;
    protected int protectQty;

    /**
     *
     * @param protectType Type of safety equipment.
     * @param protectQty Amount needed. (2 gloves, 1 long sleeve shirt, ETC).
     */
    public ProtectionBase(String protectType, int protectQty) {
        this.protectType = protectType;
        this.protectQty = protectQty;
    }

    /**
     *
     * @return current set type.
     */
    public String getProtectType() {
        return this.protectType;
    }

    /**
     *
     * @param protectType Requires a protectType passed in
     * @ensures new value is set to instance variable.
     */
    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    /**
     *
     * @return Current value stored for protectQty.
     */
    public int getProtectQty() {
        return this.protectQty;
    }

    /**
     *
     * @param protectQty requires a protectQty amount passed in.
     * @ensures passed in value is set to instance variable.
     */
    public void setProtectQty(int protectQty) {
        this.protectQty = protectQty;
    }
}
