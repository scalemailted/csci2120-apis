public abstract class StackableItem extends Item implements Stackable{
    /**
     * @param quantity is the quantity of the item
     * @param maxStack is for the max number of items in a stack
     */
    protected int quantity;
    protected int maxStack;

    /**
     * We have created a StackableItem constructor, we invoke using the super keyword in order to pass in parameters
     * We set quanity = to quanity and maxStack = to maxStack
     */
    //Constructor
    public StackableItem(int itemValue, String itemName, int quantity, int maxStack){
        super(itemValue, itemName); //whenever we inherit from a class, we have to invoke using the super keyword and pass in parameters
        this.quantity = quantity;
        this.maxStack = maxStack;
    }

    /**
     * In the stack method, we have made Stackable s. If s is an instance of StackableItem, we can stack. In the if statement, we are grabbing the quantity and adding it to the quantity that is getting passed into the stack. If the sum is < the maxStack, we'll update the quantity to match it
     * In the else if statement, we are checking if the sum is greater than the maxStack, we check the difference, we set quantity so that it can add up to become the maxValue and, we set the quantity of what was passed in so it can be the difference.
     */
    @Override
    public void stack(Stackable s){
        if(s instanceof StackableItem){
            StackableItem si = (StackableItem) s; //stack
            if(this.getQuantity() + si.getQuantity() < maxStack){ //grabbing the quantity and adding it to the quantity that is getting passed into the stack. If the sum is < the maxStack, we'll update the quantity to match it
                this.setQuantity(this.getQuantity()+si.getQuantity());
                si.setQuantity(0);
            }
            else if(this.getQuantity() + si.getQuantity() > maxStack){ //otherwise, we will see if the sum is > the maxStack
                int difference = maxStack - this.getQuantity(); //compute the difference
                this.setQuantity(this.getQuantity() + difference); //set quantity so that it adds up to be the maxValue
                si.setQuantity(si.getQuantity() - difference); //set quantity of what was passed in, to be the difference
            }
        }
    }

    /**
     * @return the quantity
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * In setQuantity, we are setting the quantity
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
} //end of class StackableItem