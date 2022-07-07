public class Sword extends MeleeWeapon{
    /**
     * @param quantity is for our Sword quantity
     * We have created a Sword constructor and, we have used the super keyword to invoke using and pass in parameters
     */
    public Sword(int quantity){ //constructor of quantity
        super(5,"Iron Sword", quantity, 2, quantity);
    }

    public Sword(){
        this(2);
    }
    /**
     * In our consume method, we are subtracting 1 from the quantity
     */
    @Override //overriding abstract methods
    public void consume(){
        this.setQuantity(this.quantity-1);
    }
    /**
     * In our destroy method, we are currently just saying that the weapon has been broken.
     * Will change this.
     */
    @Override
    public void destroy(){
        this.setItemName("Your " +itemName+ " has been broken!");
    }
    /**
     * For our toString method, we are formatting our string and then returning the text
     */
    @Override
    public String toString(){ //overriding toString method to print out a string to see how the state of the object has changed over time
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemValue, quantity, maxStack);
        return text;
    }
} //end of class Swords