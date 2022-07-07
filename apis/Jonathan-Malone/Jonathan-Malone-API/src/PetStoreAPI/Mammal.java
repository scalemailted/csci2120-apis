package PetStoreAPI;

/**
 * This class extends class Animal and is used to create mammal species that are added to the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *

 */
public class Mammal extends Animal {

    /** height in inces of mammal created */
    protected double height;
    /** weight in pounds of mammal created */
    protected double weight;

    /**
     * @param species name of species
     * @param itemValue dollar amount of item > 0.00
     * @param quantity amount of items to be changed, - or +
     * @param animalSex Animal.Sex.M, Animal.Sex.F, Animal.Sex.U (Unknown)
     * @param age > 0
     * @param color primary color of animal. secondary colors listed in comments.
     * @param idMarks documents unique marks on animal (scars, microchips, etc.). if none, type "none".
     * @param image picture of animal. if none, type "none".
     * @param beenFed true or false
     * @param comments any other documentation to enter. if none, type "none".
     * @param height > 0.00 in inches
     * @param weight > 0.00 in pounds
     * @since 6/29/22
     */
    public Mammal(String species, double itemValue, int quantity, Sex animalSex, int age,
                  double weight, double height, String color, String idMarks, String image,
                  boolean beenFed, String comments) {
        super(species, itemValue, quantity, animalSex, age, color, idMarks, image, beenFed, comments);
        this.height = height;
        this.weight = weight;
    }

    /**
     * This method queries the height in inches of the mammal(s).
     * @return height in inches
     * @since 6/29/22
     */
    public double getHeight() {
        return height;
    }

    /**
     * This method is used to set the height in inches of the mammal(s) that are being created.
     * @param height > 0.00 in inches
     * @since 6/29/22
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * This method queries the wight in pounds of the mammal(s).
     * @return weight in pounds
     * @since 6/29/22
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method is used to set the weight in pounds of the mammal(s) that are being created.
     * @param weight > 0.00 in pounds
     * @since 6/29/22
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     * @return toString list of variables entered for Mammal on separate lines
     * @since 6/29/22
     */
    @Override
    public String toString() {
        return "Mammal" + '\n' +
                "species= " + species + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n' +
                "sex= " + sex + '\n' +
                "age= " + age + " years old" + '\n' +
                "weight= " + weight + "pounds" + '\n' +
                "height= " + height + "inches" + '\n' +
                "color= " + color + '\n' +
                "idMarks= " + idMarks + '\n' +
                "image= " + image + '\n' +
                "beenFed= " + beenFed + '\n' +
                "comments= " + comments + '\n';
    }
}