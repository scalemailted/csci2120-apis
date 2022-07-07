package org.rpg.items;

/**
 * Players implementation class
 */
public class Warrior extends Player {
    /**
     * Parametrized constructor
     *
     * @param name         org.rpg.items.Player name
     * @param backpackSize backpack size
     */
    public Warrior(String name, int backpackSize) {
        super(name, backpackSize);
    }


    /**
     * {@inheritDoc}
     */
    public void move() {
        System.out.println(getName() + "moving...");
    }
}
