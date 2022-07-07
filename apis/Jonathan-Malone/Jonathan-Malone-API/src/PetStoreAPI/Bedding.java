package PetStoreAPI;

/**
 * This class extends class ItemBase and is used to create animal bedding that is added to the store inventory.
 *
 * @author Jonathan Malone
 * @version 0.5
 * @since 6/29/22
 */
public class Bedding extends ItemBase {
    /**
     * @param itemValue  dollar amount of item > 0.00
     * @param itemName   name of bedding (puppy pad, litter, etc.)
     * @param animalType ItemBase.AnimalType.Bird, ItemBase.AnimalType.Fish, ItemBase.AnimalType.Mammal, ItemBase.AnimalType.Reptile
     * @param species    name of species using bedding
     * @param quantity   amount of items to be changed, - or +
     * @since 6/29/22
     */

    public Bedding(double itemValue, String itemName, AnimalType animalType, String species, int quantity) {
        super(itemValue, itemName, animalType, species, quantity);
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     *
     * @return toString list of variables entered for Bedding on separate lines
     * @since 6/29/22
     */
    @Override
    public String toString() {
        return "Bedding" + '\n' +
                "itemName= " +itemName + '\n' +
                "animalType= " + animalType + '\n' +
                "species= " + species + '\n' +
                "itemName= " + itemName + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n';
    }
}