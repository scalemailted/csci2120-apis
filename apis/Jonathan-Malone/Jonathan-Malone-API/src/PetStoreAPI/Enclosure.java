package PetStoreAPI;

/**
 * This class extends class ItemBase and is used to make animal enclosures (cage, aquarium, etc.) that are added to the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public class Enclosure extends ItemBase {

    /** height in inches of enclosure created */
    protected int height;
    /** width in inches of enclosure created */
    protected int width;

    /**
     * @param itemValue dollar amount of item > 0.00
     * @param itemName name of enclosure (cage, aquarium, etc.)
     * @param animalType ItemBase.AnimalType.Bird, ItemBase.AnimalType.Fish, ItemBase.AnimalType.Mammal, ItemBase.AnimalType.Reptile
     * @param species name of species using enclosure
     * @param quantity amount of items to be changed, - or +
     * @param height > 0 in inches
     * @param width > 0 in inches
     * @since 6/29/22
     */
    public Enclosure(double itemValue, String itemName, AnimalType animalType, String species, int quantity,
                     int height, int width) {
        super(itemValue, itemName, animalType, species, quantity);
        this.height = height;
        this.width = width;
    }

    /**
     * This method queries the height of the enclosure(s) in inches.
     * @return height of enclosure in inches
     * @since 6/29/22
     */
    public int getHeight() {
        return height;
    }

    /**
     * This method is used to set the height of the enclosure(s) in inches that are being created.
     * @param height > 0.00 in inches
     * @since 6/29/22
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * This method queries the width of the enclosure(s) in inches.
     * @return width of enclosure in inches
     * @since 6/29/22
     */
    public int getWidth() {
        return width;
    }

    /**
     * This method is used to set the width of the enclosure(s) in inches that are being created.
     * @param width > 0.00 in inches
     * @since 6/29/22
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     * @return toString list of variables entered for Enclosure on separate lines
     * @since 6/29/22
     */
    @Override
    public String toString() {
        return "Enclosure" + '\n' +
                "animalType= " + animalType + '\n' +
                "species= " + species + '\n' +
                "itemName= " + itemName + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n' +
                "height= " + height + " inches" + '\n' +
                "width= " + width + " inches" + '\n';
    }
}