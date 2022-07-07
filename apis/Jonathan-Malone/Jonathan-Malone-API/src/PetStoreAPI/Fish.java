package PetStoreAPI;

/**
 * This class extends class Animal and is used to create fish species that are added to the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public class Fish extends Animal {

    /** length in inches of fish created */
    protected double length;

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
     * @param length > 0.00 in inches
     * @since 6/29/22
     */
   public Fish(String species, double itemValue, int quantity, Sex animalSex, int age, double length,
               String color, String idMarks, String image, boolean beenFed, String comments) {
        super(species, itemValue, quantity, animalSex, age, color, idMarks, image, beenFed, comments);
        this.length = length;
    }

    /**
     * This method queries the length of the fish in inches.
     * @return length in inches
     * @since 6/29/22
     */
    public double getLength() {
        return length;
    }

    /**
     * This method is used to set the length of the fish in inches that are being created.
     * @param length > 0.00 inches
     * @since 6/29/22
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     * @return toString list of variables entered for Fish on separate lines
     * @since 6/29/22
     */
    @Override
    public String toString() {
        return "Fish" + '\n' +
                "species= " + species + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n' +
                "sex= " + sex + '\n' +
                "age= " + age + " years old" + '\n' +
                "length= " + length + " inches" + '\n' +
                "color= " + color + '\n' +
                "idMarks= " + idMarks + '\n' +
                "image= " + image + '\n' +
                "beenFed= " + beenFed + '\n' +
                "comments= " + comments + '\n';
    }
}