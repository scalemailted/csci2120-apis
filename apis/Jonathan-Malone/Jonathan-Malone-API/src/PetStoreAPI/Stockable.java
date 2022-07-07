package PetStoreAPI;

/**
 * This interface is used to change inventory totals when items are stocked.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public interface Stockable {

    /**
     * This method is abstract and overridden in the Animal and ItemBase class.
     * @since 6/29/22
     */
    public void stock(Stockable s);
}