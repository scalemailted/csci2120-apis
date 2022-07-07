package org.rpg.items;

/**
 * Abstract class for any item
 */
public abstract class Item {

    private String name;
    private double weight;
    private double cost;

    /**
     * Parametrized constructor.
     *
     * @param name   org.rpg.items.Item name
     * @param weight org.rpg.items.Item weight
     * @param cost   org.rpg.items.Item cost
     */
    public Item(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    /**
     * Returns org.rpg.items.Item name.
     *
     * @return String.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns org.rpg.items.Item weight.
     *
     * @return double
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns org.rpg.items.Item cost.
     *
     * @return double.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Method of equivalence of two objects.
     * Returns true if the values of the fields name, weight and cost are equivalent
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.weight, weight) != 0) return false;
        if (Double.compare(item.cost, cost) != 0) return false;
        return name != null ? name.equals(item.name) : item.name == null;
    }

    /**
     * Returns the integer hash code value of the object.
     *
     * @return int.
     */
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
