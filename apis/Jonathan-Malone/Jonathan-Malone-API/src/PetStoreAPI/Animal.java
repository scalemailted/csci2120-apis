package PetStoreAPI;

/**
 * This class is the superclass for classes Bird, Fish, Mammal, and Reptile and implements the interfaces Stockable, Sellable, and Feedable.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public abstract class Animal implements Stockable, Sellable, Feedable {

    /** enum used to restrict values of Sex to M, F, or U (Unknown) */
    public enum Sex {
        /** Male */
        M,
        /** Female */
        F,
        /** Unknown */
        U}

    /** species of animal being created */
    protected String species;
    /** cost of animal being created */
    protected double itemValue;
    /** amount of animals created */
    protected int quantity;
    /** sex of animal created */
    protected Sex sex;
    /** age of animal created */
    protected int age;
    /** color of animal created */
    protected String color;
    /** distinguishing marks of animal created */
    protected String idMarks;
    /** image of animal created */
    protected String image;
    /** true or false if animal has been fed */
    protected boolean beenFed;
    /** additional comments that need to be added */
    protected String comments;

    /**
     * @param species name of species
     * @param itemValue dollar amount of item > 0.00
     * @param quantity amount of items to be changed, - or +
     * @param sex Animal.Sex.M, Animal.Sex.F, Animal.Sex.U (Unknown)
     * @param age > 0
     * @param color primary color of animal. secondary colors listed in comments.
     * @param idMarks documents unique marks on animal (scars, microchips, etc.). if none, type "none".
     * @param image picture of animal. if none, type "none".
     * @param beenFed true or false
     * @param comments any other documentation to enter. if none, type "none".
     * @since 6/29/22
     */
    public Animal(String species, double itemValue, int quantity, Sex sex, int age,
                  String color, String idMarks, String image, boolean beenFed, String comments) {
        this.species = species;
        this.itemValue = itemValue;
        this.quantity = quantity;
        this.sex = sex;
        this.age = age;
        this.color = color;
        this.idMarks = idMarks;
        this.image = image;
        this.beenFed = beenFed;
        this.comments = comments;
    }

    /**
     * This method queries the species name of the animal(s).
     * @return species name
     * @since 6/29/22
     */
    public String getSpecies() {
        return species;
    }

    /**
     * This method is used to set the species name of the animal(s) being created.
     * @param species can be any animal to be sold
     * @since 6/29/22
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * This method queries the itemValue in dollars of the animal(s).
     * @return itemValue in dollars > 0.00
     * @since 6/29/22
     */
    public double getItemValue() {
        return itemValue;
    }

    /**
     * This method is used to set the itemValue in dollars of the animal(s) being created.
     * @param itemValue > 0.00 and itemValue must be dollar amount
     * @since 6/29/22
     */
    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    /**
     * This method queries the quantity of the animal(s).
     * @return quantity >= 0
     * @since 6/29/22
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * This method is used to add or subtract the quantity of animal(s) from/to the animals in inventory.
     * @param quantity can be - or + depending on interface implemented
     * @since 6/29/22
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * This method queries the sex of the animal(s).
     * @return sex of animals
     * @since 6/29/22
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * This method is used to set the sex of the animal(s) being created.
     * @param sex M, F, U (Unknown)
     * @since 6/29/22
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * This method queries the age of the animal(s).
     * @return age of animals
     * @since 6/29/22
     */
    public int getAge() {
        return age;
    }

    /**
     * This method is used to set the age of the animal(s) being created.
     * @param age >= 0
     * @since 6/29/22
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method queries the color of the animal(s).
     * @return color of animal
     * @since 6/29/22
     */
    public String getColor() {
        return color;
    }

    /**
     * This method is used to set the color of the animal(s) being created.
     * @param color must be primary color of animal. If more than 1, use comments variable
     * @since 6/29/22
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method queries the idMarks of the animal(s).
     * @return any idMarks of animal
     * @since 6/29/22
     */
    public String getIdMarks() {
        return idMarks;
    }

    /**
     * This method is used to set the idMarks of the animal(s) being created.
     * @param idMarks used to document any unique marks on the animal (scars, etc.).
     * If none, type "none".
     * @since 6/29/22
     */
    public void setIdMarks(String idMarks) {
        this.idMarks = idMarks;
    }

    /**
     * This method queries the image of the animal(s).
     * @return image of animal
     * @since 6/29/22
     */
    public String getImage() {
        return image;
    }

    /**
     * This method is used to set the image of the animal(s) being created.
     * @param image used to document picture of animal. If none, type "none".
     * @since 6/29/22
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method queries true or false if the animal(s) have been fed.
     * @return beenFed boolean true or false
     * @since 6/29/22
     */
    public boolean getBeenFed() {
        return beenFed;
    }

    /**
     * This method is used to set true or false if the animal(s) have been fed.
     * @param beenFed true or false
     * @since 6/29/22
     */
    public void setBeenFed(boolean beenFed) {
        this.beenFed = beenFed;
    }

    /**
     * This method queries the comments of the animal(s).
     * @return comments regarding animal
     * @since 6/29/22
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method is used to set the comments of the animal(s) being created.
     * @param comments used to document anything not listed in other variables. If none, type "none".
     * @since 6/29/22
     */
    public void setComments(String comments) {
        this.comments = comments;
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
        if (s instanceof Animal) {
            Animal si = (Animal) s;
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
            if (s instanceof Animal) {
                Animal si = (Animal) s;
                this.setQuantity(this.getQuantity() + si.getQuantity());
            }
        }

    /**
     * This method is used to change the variable from false to true if the animal has been fed.
     * @param () true or false
     * @requires true or false
     * @since 6/29/22
     */
    @Override
    public void feed() {
        if (!this.beenFed) {
            this.setBeenFed(true);
        }
    }
}