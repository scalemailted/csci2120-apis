package org.rpg.items;

import org.rpg.interfaces.Damage;
import org.rpg.interfaces.Weapon;

public class Axe extends Item implements Weapon, Damage {

    /**
     * Max org.rpg.items.Axe damage value
     */
    private final double max_damage;

    /**
     * Parametrized constructor.
     * @param name   org.rpg.items.Item name
     * @param weight org.rpg.items.Item weight
     * @param cost   org.rpg.items.Item cost
     * @param max_damage maximum weapon damage
     */
    public Axe(String name, double weight, double cost, double max_damage) {
        super(name, weight, cost);
        this.max_damage = max_damage;
    }

    /**
     * {@inheritDoc}
     *
     */
    public double getMax_damage() {
        return max_damage;
    }

    /**
     * {@inheritDoc}
     *
     */
    public double damage() {
        return ((Math.random() * (max_damage - min_damage)) + min_damage);
    }
}
