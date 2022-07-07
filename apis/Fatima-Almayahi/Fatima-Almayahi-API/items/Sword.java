package org.rpg.items;

import org.rpg.interfaces.Damage;
import org.rpg.interfaces.Weapon;

public class Sword extends Item implements Weapon, Damage {

    /**
     * Max org.rpg.items.Sword damage value
     */
    private final double max_damage;

    /**
     * {@inheritDoc}
     *
     * @param max_damage Max org.rpg.items.Sword damage value
     */
    public Sword(String name, double weight, double cost, double max_damage) {
        super(name, weight, cost);
        this.max_damage = max_damage;
    }

    /**
     *
     * {@inheritDoc}
     */
    public double damage() {
        return ((Math.random() * (max_damage - min_damage)) + min_damage);
    }

    /**
     * Returns Max org.rpg.items.Sword damage value
     * @return double
     */
    public double getMax_damage() {
        return max_damage;
    }
}
