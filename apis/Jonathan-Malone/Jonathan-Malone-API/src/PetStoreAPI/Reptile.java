package PetStoreAPI;

/**
 * This class extends class Animal and is used to create reptile species that are added to the store inventory.
 * @author Jonathan Malone
 * @since 6/29/22
 * @version 0.5
 *
 */
public class Reptile extends Animal {

    /** morphology of reptile created */
    protected String morphology;
    /** length in inches of reptile created */
    protected double length;
    /** weight in inches of reptile created */
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
     * @param comments any other documentation to enter. if none, type "none"
     * @param morphology name of morphology if other than normal(pastel, albino,etc.) if none, type "none".
     * @param length > 0.00 in inches
     * @param weight > 0.00 in pounds
     * @since 6/29/22
     */
    public Reptile(String species, double itemValue, int quantity, Sex animalSex, int age,
                   double weight, double length, String color, String morphology, String idMarks, String image,
                   boolean beenFed, String comments) {
        super(species, itemValue, quantity, animalSex, age, color, idMarks, image, beenFed, comments);
        this.morphology = morphology;
        this.length = length;
        this.weight = weight;
    }

    /**
     * This method queries the morphology of the reptile(s).
     * @return morphology (albino, etc.)
     * @since 6/29/22
     */
    public String getMorphology() {
        return morphology;
    }

    /**
     * This method is used to set the morphology of the reptile(s) that are being created.
     * @param morphology (albino, etc.)
     * @since 6/29/22
     */
    public void setMorphology(String morphology) {
        this.morphology = morphology;
    }

    /**
     * This method queries the length in inches of the reptile(s).
     * @return length in inches
     * @since 6/29/22
     */
    public double getLength() {
        return length;
    }

    /**
     * This method is used to set the length in inches of the reptile(s) that are being created.
     * @param length > 0.00 inches
     * @since 6/29/22
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * This method queries the weight in pounds of the reptile(s).
     * @return weight in pounds
     * @since 6/29/22
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method is used to set the weight in pounds of the reptile(s) being created.
     * @param weight > 0.00 in pounds
     * @since 6/29/22
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * This method is used to print the variable values on separate lines to the client.
     * @return toString list of variables entered for PetStoreAPI.Reptile on separate lines
     * @since 6/29/22
     */
    @Override
    public String toString() {
        return "Reptile" + '\n' +
                "species= " + species + '\n' +
                "itemValue= $" + itemValue + '\n' +
                "quantity= " + quantity + '\n' +
                "sex= " + sex + '\n' +
                "age= " + age + " years old" + '\n' +
                "weight= " + weight + " pounds" + '\n' +
                "length= " + length + " inches" + '\n' +
                "color= " + color + '\n' +
                "morphology= " + morphology + '\n' +
                "idMarks= " + idMarks + '\n' +
                "image= " + image + '\n' +
                "beenFed= " + beenFed + '\n' +
                "comments= " + comments + '\n';
    }
}