package org.rpg.interfaces;

/**
 * Interface for org.rpg.items.Item
 */
public interface Armor {
    /**
     * org.rpg.interfaces.Protection range constant.
     */
    final double min_protection = 0;
    /**
     * Generates and returns random protection value
     * @return double
     */
    double protection();
}
