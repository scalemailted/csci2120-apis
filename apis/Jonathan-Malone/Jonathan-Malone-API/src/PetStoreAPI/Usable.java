package PetStoreAPI;

/**
 * This interface is used to change inventory totals when items are used for in-store purposes.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public interface Usable {

    /**
     * This method is abstract and overridden in the ItemBase class.
     * @since 6/29/22
     */
    public void use(Usable s);
}