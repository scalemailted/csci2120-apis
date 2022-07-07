package MetalShopAPI.Equipment;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An abstract class that extends EquipBase for creating a tool object.
 *
 */

public abstract class Equipment extends EquipBase {

    protected int quantity;
    protected int maxQuantity;

    /**
     *
     * @param toolType Type of tool being created
     * @param toolName Name of tool being created
     * @param quantity Amount of a given tool
     * @param maxQuantity The maximum allowed number of a specified tool.
     *
     */
    public Equipment(String toolType, String toolName,int quantity,int maxQuantity) {
        super(toolType, toolName);
        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
    }

    /**
     *
     * @return Returns Quantity of a given tool.
     */
    public int getQuantity() {

        return this.quantity;
    }

    /**
     *
     * @param newQuantity Sets the instance variable to the passed in quantity.
     */
    public void setQuantity(int newQuantity) {

        this.quantity = newQuantity;
    }

    /**
     *
     * @return Returns the set maxQuantity
     */

    public int getMaxQuantity() {

        return this.maxQuantity;
    }

    /**
     *
     * @param maxQuantity Sets maxQuantity instance variable to passed in quantity.
     */

    public void setMaxQuantity(int maxQuantity) {

        this.maxQuantity = maxQuantity;
    }
}
