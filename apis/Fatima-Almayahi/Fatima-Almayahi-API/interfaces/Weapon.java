package org.rpg.interfaces;

/**
 * Interface for org.rpg.items.Item
 */
public interface Weapon {
    /**
     * org.rpg.interfaces.Damage range constant.
     */
    final double min_damage = 0;

    /**
     * Generates and returns random damage value
     * @return double
     */
    double damage();
}
