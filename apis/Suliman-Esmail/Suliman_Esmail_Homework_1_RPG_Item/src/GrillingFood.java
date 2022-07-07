/**
 *
 * GrillingFood is extending CookingFood to make an abstract class which will grill the food that is being brought into it
 * @author Suliman Esmail
 * @since 6/13/2022
 * @version 0.1
 *
 */


public abstract class GrillingFood extends CookingFood implements Grillable{

    protected int quantity;

    protected String CheckFood;
    protected String GrillMarks;

    /**
     * GrillingFood is creating a constructor with the aspects of GrillingFood and the ones they extended from CookingFood;
     * @param foodName is from the CookingFood class we extended from
     * @param NumOfMinsToCook is from the CookingFood class we extended from
     * @param GrillMarks is being initialized into this.GrillMarks
     * @param CheckFood is being initialized into this.CheckFood
     * @param quantity is being initialized into this.quantity
     */
    public GrillingFood(String foodName, int NumOfMinsToCook, String GrillMarks, String CheckFood, int quantity) {
        super(foodName, NumOfMinsToCook);
        this.GrillMarks = GrillMarks;
        this.CheckFood = CheckFood;
        this.quantity = quantity;

    }
    /**
     *   this interface grill() is grilling the food that is being called in foodName
     */
    @Override
    public void grill() {
        this.setFoodName("Grilled " + foodName);


    }
    /**
     *    @return Returns the current String value of the GrillMarks
     */
    public String getGrillMarks() {
        return GrillMarks;
    }

    /**
     *    @param grillMarks is being initialized into GrillMarks
     *    @custom.ensure GrillMarks = grillMarks;
     *
     */

    public void setGrillMarks(String grillMarks) {
        GrillMarks = grillMarks;
    }

    /**
     *    @return Returns the current Integer value of the quantity
     */

    public int getQuantity() {
        return quantity;
    }

    /**
     *    @param quantity  is being initialized into this.quantity
     *    @custom.ensure this.quantity = quantity;
     *
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *    @return Returns the current String value of the CheckFood
     */

    public String getCheckFood() {
        return CheckFood;
    }


    /**
     *    @param checkFood Is being initialized into this.checkFood
     *    @custom.ensure this.checkFood = checkFood;
     *
     */
    public void setCheckFood(String checkFood) {
        CheckFood = checkFood;
    }
}