public class Crossbow extends StackableItem implements Consumable, Breakable{
    public Crossbow(int quantity){ //constructor of quantity

        super(5,"Crossbow", quantity, 2);
    }

    public Crossbow(){ //default constructor that will invoke the other constructor with the quantity set at 2
        this(2);
    }

    @Override //overriding abstract methods
    public void consume(){
        this.setQuantity(this.quantity-1);
    }

    @Override
    public void destroy(){
        this.setItemName("Your " +itemName+ " has been broken!");
    }

    @Override
    public String toString(){ //overring toString method to print out a string to see how the state of the object has changed over time
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemValue, quantity, maxStack);
        return text;
    }
} //end class Furnace