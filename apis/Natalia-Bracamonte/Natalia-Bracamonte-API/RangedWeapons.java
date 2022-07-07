abstract class RangedWeapon extends StackableItem implements Consumable, Breakable{
    /**
     * @param damage is the amount of damage that the ranged weapon can make
     * @param weaponHealth is the weapon's health
     *
     */
    public int damage;
    public int weaponHealth;

    public RangedWeapon (int itemValue, String itemName, int quantity, int maxStack, int damage){
        super(itemValue, itemName, quantity, maxStack);
        this.damage = damage;
        this.weaponHealth = weaponHealth;
    }

    /**
     * @return our damage
     */
    public int getDamage(){
        return damage;
    }

    /**
     * @return our weaponHealth
     */
    public int getWeaponHealth(){
        return weaponHealth;
    }

    /**
     * Sets our damage
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
} //end of RangedWeapons class