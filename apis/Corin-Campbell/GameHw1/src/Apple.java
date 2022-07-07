public class Apple extends StackableItem implements Consumable, Breakable {

    public Apple(int quantity) {
        super("Apple", 5);
    }

    @Override
    public void consume() {
        this.setQuantity(this.quantity-1);
    }

    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]", itemName, itemName, quantity, maxStacks );
        return text;
    }

    @Override
    public void destroy() {
        this.setItemName("Apple was eaten");
    }
}
