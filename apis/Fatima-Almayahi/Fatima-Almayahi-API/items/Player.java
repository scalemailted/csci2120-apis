package org.rpg.items;

import org.rpg.interfaces.Armor;
import org.rpg.interfaces.Movable;
import org.rpg.interfaces.Weapon;

/**
 * Abstract class for any org.rpg.items.Player
 */
public abstract class Player implements Movable {

    /**
     * org.rpg.items.Player name
     */
    private String name;
    /**
     * org.rpg.items.Player health value
     */
    private double health;
    /**
     * org.rpg.items.Player gold value
     */
    private double goldValue;
    /**
     * org.rpg.items.Player weapon
     */
    private Weapon weapon;
    /**
     * org.rpg.items.Player armor
     */
    private Armor armor;
    /**
     * org.rpg.items.Player backpack for items
     */
    private Item[] backpack;
    /**
     * Number of things in the backpack
     */
    private int itemsCount;

    /**
     * Parametrized constructor
     * @param name org.rpg.items.Player name
     * @param backpackSize backpack size
     */
    public Player(String name, int backpackSize) {
        this.name = name;
        this.health = 100.0;
        if (backpackSize < 1) {
            throw new IllegalArgumentException("Backpack size cannot be less than one");
        }
        this.backpack = new Item[backpackSize];
        itemsCount = 0;
    }

    /**
     * Returns org.rpg.items.Player name.
     * @return String
     */
    public String getName() {
        return name;
    }
    /**
     * Returns org.rpg.items.Player gold value.
     * @return double
     */
    public double getGoldValue() {
        return goldValue;
    }

    /**
     * Sets org.rpg.items.Player gold value.
     * @param goldValue double
     */
    public void setGoldValue(double goldValue) {
        this.goldValue = goldValue;
    }

    /**
     * Returns org.rpg.items.Player weapon
     * @return org.rpg.interfaces.Weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Sets the org.rpg.items.Item in the weapon field if the org.rpg.items.Item implements an interface org.rpg.interfaces.Weapon.
     * Returns a true if successfully otherwise returns false.
     *
     * @param weapon org.rpg.items.Item
     * @return boolean
     */
    public boolean setWeapon(Item weapon) {
        if (weapon instanceof Weapon) { //check if org.rpg.items.Item implements interface org.rpg.interfaces.Weapon
            this.weapon = (Weapon) weapon; //type casting org.rpg.items.Item to org.rpg.interfaces.Weapon
            return true;
        }
        return false;
    }

    /**
     * Returns org.rpg.items.Player armor
     * @return org.rpg.interfaces.Armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Sets the org.rpg.items.Item in the armor field if the org.rpg.items.Item implements an interface org.rpg.interfaces.Armor.
     * Returns a true if successfully otherwise returns false.
     *
     * @param armor org.rpg.items.Item
     * @return boolean
     */
    public boolean setArmor(Item armor) {

        if (armor instanceof Armor) { //check if org.rpg.items.Item implements interface org.rpg.interfaces.Armor
            this.armor = (Armor) armor; //type casting org.rpg.items.Item to org.rpg.interfaces.Armor
            return true;
        }
        return false;

    }

    /**
     * returns org.rpg.items.Player backpack.
     * @return org.rpg.items.Item[]
     */
    public Item[] getBackpack() {
        return backpack;
    }

    /**
     * Add item to array.
     * Returns a true if the item has been added, otherwise returns false (array is full).
     *
     * @param item org.rpg.items.Item
     * @return boolean
     */
    public boolean addItem(Item item) {
        int slot = findFreeSlot();//Finds free index
        if (slot >= 0) { //if index != -1
            backpack[slot] = item;
            itemsCount++;//increment counter
            return true;
        }
        return false;
    }

    /**
     * Removes org.rpg.items.Item from array.
     * Returns true if the item was found and removed, otherwise returns false.
     *
     * @param item org.rpg.items.Item
     * @return boolean
     */
    public boolean removeItem(Item item) {
        for (int i = 0; i < backpack.length; i++) {
            if (item.equals(backpack[i])) {
                backpack[i] = null;//reset to null the index
                itemsCount--; //decrement counter
                return true;
            }
        }

        return false;
    }

    /**
     * Finds and returns a free index from an array.
     * Returns -1 if there is no free space in the array.
     *
     * @return index or -1.
     */
    private int findFreeSlot() {
        for (int i = 0; i < backpack.length; i++) {
            if (backpack[i] == null) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Returns org.rpg.items.Player health value
     * @return double
     */
    public double getHealth() {
        return health;
    }

    /**
     * Sets org.rpg.items.Player health value
     * @param health double
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Returns number of things in the backpack
     * @return int
     */
    public int getItemsCount() {
        return itemsCount;
    }
}
