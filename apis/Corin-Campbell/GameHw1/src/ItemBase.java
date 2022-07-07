public class ItemBase {

    // instance variables

    protected int itemValue;
    protected String itemName;



    // constructor
    public ItemBase( int itemValue, String itemName){
        this.itemValue = itemValue;
        this.itemName = itemName;
    }

    /**
     *
     * @return returns items name
     */

    //getter

    public String getItemName(){
        return this.itemName;
    }

    /**
     *
     * @return returns items Value
     */
    public int getItemValue(){
        return this.itemValue;
    }

    /**
     *
     * @param itemName sets items name
     */
    //setters
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    /**
     *
     * @param itemValue sets items value
     */
    public void setItemValue(int itemValue){
        this.itemValue = itemValue;
    }

}
