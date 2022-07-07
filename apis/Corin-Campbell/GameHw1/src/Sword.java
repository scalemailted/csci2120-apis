public class Sword extends StackableItem implements Breakable{
    /**
     *
     * @param quantity gives the items quantity
     */


    public Sword(int quantity) {super("Sword", 500);

    }

    /**
     * when broken sword will display "Broken Sword"
     */

    @Override
    public void destroy() {
        this.setItemName("Broken Sword");

    }

    /**
     *
     * @return returns the required text
     */
    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]", itemName, itemValue, quantity, maxStacks );
        return text;
    }
}



