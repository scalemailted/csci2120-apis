package PetStoreAPI;

/**
 * This class is extended by Bedding, Enclosure, Food, and Toy and implements Sellable, Stockable, and Usable and is used to create items for the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public class ItemBase implements Sellable, Stockable, Usable {

    /**
     * enum used to restrict values of AnimalType to Mammal, Reptile, Fish, or Bird
     */
    public enum AnimalType{
        /** Animal type Mammal */
        Mammal,
        /** Animal type Reptile */
        Reptile,
        /**Animal Type Fish */
        Fish,
        /** Animal Type Bird */
        Bird}

    /** cost of item created */
    protected double itemValue;
    /** name of item created */
    protected String itemName;
    /** name of species that uses item created */
    protected String species;
    /** animal type that uses item created */
    protected AnimalType animalType;
    /** amount of items created */
    protected int quantity;

    /**
     * @param itemValue dollar amount of item > 0.00
     * @param itemName name of item
     * @param animalType ItemBase.AnimalType.Mammal, ItemBase.AnimalType.Reptile, ItemBase.AnimalType.Fish, ItemBase.AnimalType..Bird
     * @param species name of species using item
     * @since 6/29/22
     */
    public ItemBase(double itemValue, String itemName, AnimalType animalType, String species, int quantity) {
        this.itemValue = itemValue;
        this.itemName = itemName;
        this.animalType = animalType;
        this.species = species;
        this.quantity = quantity;
    }

    /**
     * This method queries the itemValue in dollars of the item(s).
     * @return itemValue in dollars
     * @since 6/29/22
     */
    public double getItemValue() {
        return itemValue;
    }

    /**
     * This method is used to set the itemValue in dollars of the item(s) being created.
     * @param itemValue > 0.00 and must be in dollars
     * @since 6/29/22
     */
    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    /**
     * This method queries the itemName of the item(s).
     * @return name of item
     * @since 6/29/22
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method is used to set the itemName of the item(s) that are being created.
     * @param itemName sets name of item
     * @since 6/29/22
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * This method queries the animalType of the animal that uses the item(s).
     * @return animalType
     * @since 6/29/22
     */
    public AnimalType getAnimalType() {
        return animalType;
    }

    /**
     * This method is used to set the animalType of the animal that used the item(s) that are being created.
     * @param animalType PetStoreAPI.Bird, PetStoreAPI.Fish, PetStoreAPI.Reptile, PetStoreAPI.Mammal
     * @requires PetStoreAPI.Bird, PetStoreAPI.Fish, PetStoreAPI.Reptile, PetStoreAPI.Mammal
     * @since 6/29/22
     */
    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    /**
     * This method queries the species of the animal that uses the item(s).
     * @return name of species using item
     * @since 6/29/22
     */
    public String getSpecies() {
        return species;
    }

    /**
     * This method is used to set the species of the animal that used the item(s) that are being created.
     * @param species set name of species
     * @since 6/29/22
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * This method queries the amount of item(s).
     * @return quantity of item
     * @since 6/29/22
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * This method is used to add or subtract the quantity of item(s) from/to the items in inventory.
     * @param quantity used to change quantity of item
     * @since 6/29/22
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * This method is used by invoking the setQuantity method to subtract from the current inventory.
     * @param s < 0
     * @requires < 0
     * @ensures inventory is removed by amount when sold(food, housing, bedding, animals)
     * @since 6/29/22
     */
    @Override
    public void sell(Sellable s) {
        if (s instanceof ItemBase) {
            ItemBase si = (ItemBase) s;
            this.setQuantity(this.getQuantity() - si.getQuantity());
        }
    }

    /**
     * This method is used by invoking the setQuantity method to add to the current inventory.
     * @param s > 0
     * @requires > 0
     * @ensures inventory is added by amount when item is stocked(food, housing, bedding, animals)
     * @since 6/29/22
     */
    @Override
    public void stock(Stockable s) {
        if (s instanceof ItemBase) {
            ItemBase si = (ItemBase) s;
            this.setQuantity(this.getQuantity() + si.getQuantity());
        }
    }

    /**
     * This method is used by invoking the setQuantity method to subtract from the current inventory.
     * @param s < 0
     * @requires < 0
     * @ensures inventory is subtracted by amount when item is used for in-store purposes(food, housing, bedding
     * for stocked animals)
     * @since 6/29/22
     */
    @Override
    public void use(Usable s) {
        if (s instanceof ItemBase) {
            ItemBase si = (ItemBase) s;
            this.setQuantity(this.getQuantity() - si.getQuantity());
        }
    }
}

