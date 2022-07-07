public abstract class StackableItem extends ItemBase implements Stackable {
    protected int quantity;
    protected int maxStacks;

    public StackableItem(String itemName, int itemValue) {
        super(itemValue, itemName);
        this.quantity = quantity;
        this.maxStacks = maxStacks;
    }

    @Override
    public void stack (Stackable s)
    {
        if (s instanceof  StackableItem)
        {
            StackableItem si = (StackableItem) s;
            if(this.getQuantity() + si.getQuantity() < maxStacks){
                this.setQuantity(this.getQuantity() + si.getQuantity());
                si.setQuantity(0);
            }
            else if(this.getQuantity() + si.getQuantity()>maxStacks){
                int diff = maxStacks - this.getQuantity();
                this.setQuantity(this.getQuantity()+diff);
                si.setQuantity(si.getQuantity() - diff);
            }
        }


    }

    /**
     *
     * @return returns the quantity
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     *
     * @param quantity gets the amount
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     *
     * @return returns max Stack amount
     */
    public int getMaxStacks(){
        return maxStacks;
    }

    /**
     *
     * @param maxStacks gets the maxStack Amount
     */

    public void setMaxStacks(int maxStacks){
        this.maxStacks = maxStacks;
    }

}
