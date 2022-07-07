package org.rpg.items;

import org.rpg.interfaces.Armor;
import org.rpg.interfaces.Protection;

public class Shield extends Item implements Armor, Protection {

    /**
     * Max org.rpg.items.Shield protection value
     */
    private final double max_protection;

    /**
     * {@inheritDoc}
     *
     * @param max_protection Max org.rpg.items.Shield protection value
     */
    public Shield(String name, double weight, double cost, double max_protection) {
        super(name, weight, cost);
        this.max_protection = max_protection;
    }

    /**
     * {@inheritDoc}
     *
     */
    public double protection() {
        return ((Math.random() * (max_protection - min_protection)) + min_protection);
    }


    /**
     * {@inheritDoc}
     *
     */
    public double getMax_protection() {
        return max_protection;
    }
}
