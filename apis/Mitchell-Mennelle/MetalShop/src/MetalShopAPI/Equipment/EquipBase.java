package MetalShopAPI.Equipment;

/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An abstract class for setting basic equipment attributes
 *
 */

public abstract class EquipBase {
    protected String toolType;
    protected String toolName;

    /**
     *
     * @param toolType The type of tool being created. like power tool, or hand tool, ETC.
     * @param toolName The Name of the tool being created. Could be a brand name or generic name.
     *
     */
    public EquipBase(String toolType, String toolName) {
        this.toolType = toolType;
        this.toolName = toolName;
    }

    /**
     *
     * @return returns the tool name.
     */
    public String getToolName() {

        return toolName;
    }

    /**
     *
     * @param toolName takes in tool name and sets the instance variable accordingly.
     */
    public void setToolName(String toolName) {

        this.toolName = toolName;
    }

    /**
     *
     * @return Returns the tool type.
     */
    public String getToolType() {

        return toolType;
    }

    /**
     *
     * @param toolType takes in tool type and sets the instance variable accordingly.
     */
    public void setToolType(String toolType) {

        this.toolType = toolType;
    }
}
