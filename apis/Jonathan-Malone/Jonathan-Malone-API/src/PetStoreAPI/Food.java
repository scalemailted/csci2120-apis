package PetStoreAPI;

/**
 * This class extends class ItemBase and is used to create animal food that is added to the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public class Food extends ItemBase {

    /**
     * @param itemValue dollar amount of item > 0.00
     * @param itemName name of food
     * @param quantity amount of items to be changed, - or +
     * @param animalType ItemBase.AnimalType.Bird, ItemBase.AnimalType.Fish, ItemBase.AnimalType.Mammal, ItemBase.AnimalType.Reptile
     * @param species name of species eating food
     * @since 6/29/22
     */
    public Food(double itemValue, String itemName, AnimalType animalType, String species, int quantity) {
        super(itemValue, itemName, animalType, species, quantity);
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     * @return toString list of variables entered for PetStoreAPI.Food on separate lines
     * @since 6/29/22
     */
    @Override
    public String toString() {
        return "Food" + '\n' +
                "animalType= " + animalType + '\n' +
                "species =" + species + '\n' +
                "itemName= " + itemName + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n';
    }
}