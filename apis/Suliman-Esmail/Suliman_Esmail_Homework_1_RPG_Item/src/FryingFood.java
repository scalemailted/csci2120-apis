/**
 * FryingFood is extending FryingFood to make an abstract class which will fry the food that is being brought into it
 * @author Suliman Esmail
 * @since 6/13/2022
 * @version 0.1
 *
 */


public abstract class FryingFood extends CookingFood implements Fryable{

    protected int quantity;
    protected String CheckFood;
    protected String Crust;

    /**
     * The FryingFood method is extending CookingFood to create a constructor with its aspects
     *
     * @param foodName                is from the CookingFood class we extended from
     * @param NumOfMinsToCook         is from the CookingFood class we extended from
     * @param Crust                   is being initialized into this.Crust
     * @param CheckFood               is being initialized into this.CheckFood
     * @param quantity                is being initialized into this.quantity
     */

    public FryingFood(String foodName, int NumOfMinsToCook, String Crust, String CheckFood, int quantity) {
        super(foodName, NumOfMinsToCook);
        this.Crust = Crust;
        this.CheckFood = CheckFood;
        this.quantity = quantity;

    }
    /**
     *   this interface fry() is frying the food that is being called in foodName
     */
    @Override
    public void fry() {
        this.setFoodName("Fried " + foodName);


    }
    /**
     *    @return Returns the current String value of the Crust
     */
    public String getCrust() {
        return Crust;
    }
    /**
     *    @param crust is being initialized into Crust
     *    @custom.ensure Crust = crust;
     *
     */
    public void setCrust(String crust) {
        Crust = crust;
    }
    /**
     *    @return Returns the current Integer value of the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     *    @param quantity Is being initialized into this.quantity
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