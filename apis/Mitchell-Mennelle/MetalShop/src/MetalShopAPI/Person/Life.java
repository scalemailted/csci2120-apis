package MetalShopAPI.Person;

import MetalShopAPI.Interfaces.Hurtable;
import MetalShopAPI.Interfaces.Stackable;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *A class that extends LifeBase. Used for creating a life object.
 *
 */
public class Life extends LifeBase implements Stackable,Hurtable {
    protected int lifeQty;

    /**
     *
     * @param lifeQty Requires a lifeQty value
     * @ensures obj is created with expected lifeQty Value.
     */

    public Life(int lifeQty) {
        super(10, 0);
        this.maxHealth = maxHealth;
        this.minHealth = minHealth;
        this.lifeQty = lifeQty;

    }

    /**
     *
     * @param h Requires an object of type Hurtable to be passed in.
     * @ensures that lifeQty is decresed by 1 if < maxHealth.
     */
    @Override
    public void hurt(Hurtable h) {
        if (h instanceof Life) {
            Life health = (Life) h;
            if (health.getLifeQty() > this.getMinHealth()) {
                this.setLifeQty(health.getLifeQty());
                this.lifeQty--;

            }
            else{
                this.lifeQty = this.minHealth;
            }
        }
    }

    /**
     *
     * @param add Requires an object passed in of type stackable.
     * @ensures That lifeQty will be increased by 1 UNLESS it is > maxHealth.
     */
    @Override
    public void stack(Stackable add) {

        if (add instanceof Life) {
            Life addLife = (Life) add;
            if (addLife.getLifeQty() < this.getMaxHealth() && this.getMaxHealth() > 0) {
                this.setLifeQty(addLife.getLifeQty());
                this.lifeQty++;
            } else if(this.getLifeQty() > this.getMaxHealth()){
                this.setLifeQty(this.getMaxHealth());
            }
        }
    }

    /**
     *
     * @return current set maxHealth.
     */
    public int getMaxHealth() {

        return this.maxHealth;
    }

    /**
     *
     * @param maxH Takes in a value for maxHealth and sets it.
     */
    public void setMaxHealth(int maxH) {
        if(maxH > 0) {
            this.maxHealth = maxH;
        }
        else{
            this.maxHealth = 0;
        }
    }

    /**
     *
     * @param minH Takes in a value for minHealth and sets it.
     * @ensures mminimum health cannot be > than maximum health or < zero.
     */
    public void setMinHealth(int minH) {
        if(minH < this.maxHealth && minH > 0) {
            this.minHealth = minH;
        }
        else{
            this.minHealth = 0;
        }
    }

    /**
     *
     * @return current set value for min health.
     */

    public int getMinHealth() {

        return this.minHealth;
    }

    /**
     *
     * @return current set value for lifeQty.
     */
    public int getLifeQty() {

        return this.lifeQty;
    }

    /**
     *
     * @param lifeQty Requires an integer for lifeQty
     * @return new value of set lifeQty.
     */
    public int setLifeQty(int lifeQty) {
        if(lifeQty > 0) {
            this.lifeQty = lifeQty;
    }
        else{
            this.lifeQty = 0;
        }
        return this.lifeQty;
    }
    public String toString(){
        String text = String.format(" %d/ %d/ %d",lifeQty,maxHealth,minHealth);
        return text;
    }
}