abstract class Weapon extends StackableItem implements Consumable, Breakable{
    public int damage;
    public int attackPower;
    public int weaponHealth;
    public boolean weaponBreak;

    /**
     * @param itemValue is the value of the item
     * @param itemName is the name of the item
     * @param quantity is the quantity of items
     * @param maxStack is the max number of items we can stack
     * @param damage is the amount of damage that the weapon can make
     */

    public Weapon (int itemValue, String itemName, int quantity, int maxStack, int damage){
        super(itemValue, itemName, quantity, maxStack);
        this.damage = damage;
        this.attackPower = attackPower;
        this.weaponHealth = weaponHealth;
    }

    /**
     * @return The getDamage method returns the weapon damage
     */

    public int getDamage(){
        return damage;
    }
    /**
     * @return The getAttackPower method returns the attack power
     */

    public int getAttackPower(){
        return attackPower;
    }

    /**
     * @return The getWeaponHealth method returns the health of the weapon
     */

    public int getWeaponHealth(){
        return weaponHealth;
    }

    /**
     * The setDamage method sets this.damage equal to damage
     */
    public void setDamage(int damage){
         this.damage = damage;
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
        this.setItemName("Your" +itemName+ "has been broken!");
    }
} //end of weapons class