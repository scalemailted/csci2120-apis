package MetalShopAPI.Person;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An abstract class for creating a life object.
 *
 */
public abstract class LifeBase {
    protected int maxHealth;
    protected int minHealth;

    /**
     *
     * @param maxHealth set max available health.
     * @param minHealth set min available health.
     *
     */

    public LifeBase(int maxHealth,int minHealth) {
        this.maxHealth = 10;
        this.minHealth = 0;
    }

    /**
     *
     * @return current set maxHealth.
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     *
     * @param maxHealth Takes in a value for maxHealth and sets it.
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    /**
     *
     * @return current set minHealth.
     */
    public int getMinHealth() {
        return minHealth;
    }

    /**
     *
     * @param minHealth Takes in a value for minHealth and sets it.
     */
    public void setMinHealth(int minHealth) {
        this.minHealth = minHealth;
    }
}
