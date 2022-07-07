package PetStoreAPI;

/**
 * This class extends class ItemBase and is used to create animal toys that are added to the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public class Toy extends ItemBase {

    /**
     * @param itemValue > 0.00 and must be dollar amount
     * @param itemName name of toy
     * @param quantity amount of items to be changed, - or +
     * @param animalType ItemBase.AnimalType.Bird, ItemBase.AnimalType.Fish, ItemBase.AnimalType.Mammal, ItemBase.AnimalType.Reptile
     * @param species name of species using toy
     * @since 6/29/22
     */
    public Toy(double itemValue, String itemName, AnimalType animalType, String species, int quantity) {
        super(itemValue, itemName, animalType, species, quantity);
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     * @return toString list of variables entered for PetStoreAPI.Food on separate lines
     * @since 6/28/22
     */
    @Override
    public String toString() {
        return "Toy" +
                "animalType= " + animalType + '\n' +
                "species= " + species + '\n' +
                "itemName= " + itemName + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n';
    }
}