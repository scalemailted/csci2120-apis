public class MeleeWeapon extends Weapon implements Consumable, Breakable{
    
    public MeleeWeapon(int itemValue, String itemName, int quantity, int maxStack, int damage){
        super(itemValue, itemName, quantity, maxStack, damage);
    }

    /**
     * We are calling our destroy method
     */
    public void destroy(){

    }

    /**
     * We are calling our consume method
     */
    public void consume(){

    }
} //end of class Swords