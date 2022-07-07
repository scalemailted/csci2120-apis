package PetStoreAPI;

/**
 * This interface is used to change inventory totals when items are sold.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public interface Sellable {

    /**
     * This method is abstract and is overridden in the Animal and ItemBase class.
     * @since 6/29/22
     */
    public void sell(Sellable s);
    }