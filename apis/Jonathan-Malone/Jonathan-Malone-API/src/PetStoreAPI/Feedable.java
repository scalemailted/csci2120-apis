package PetStoreAPI;

/**
 * This interface is used to track whether animals in the store inventory have been fed.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 */
public interface Feedable {

    /**
     * This method is abstract and overridden in the Animal class.
     * @since 6/29/22
     */
    public void feed();
}