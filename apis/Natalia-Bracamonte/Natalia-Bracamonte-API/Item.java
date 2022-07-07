/**
 * Designed for items
 */
public abstract class Item{
    protected int itemValue;
    protected String itemName;

    /**
     * Creating an Item that has a value and a name
     * 
     * @param itemValue is the value of the item
     * @param itemName is the name of the item
     */
    public Item(int itemValue, String itemName){
        this.itemValue = itemValue;
        this.itemName = itemName;
    }

    /**
     * @return The item value and item name
     */

    public int getItemValue(){
        return itemValue;
    }

    /**
     * Sets the item value
     */
    public void setItemValue(int itemValue){
        this.itemValue = itemValue;
    }

    /**
     * @return The item name
     */

    public String getItemName(){
        return itemName;
    }

    /**
     * Sets the item name
     */
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
} // end of class Item