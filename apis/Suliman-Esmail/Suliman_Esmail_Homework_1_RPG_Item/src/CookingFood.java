/**
 * CookingFood class is used to get the name of the food that will be cooked and the number of minutes for the food to cook
 * @author Suliman Esmail
 * @since 6/13/2022
 * @version 0.1
 *
 */


public abstract class CookingFood {
    protected String foodName;
    protected int NumOfMinsToCook;

    /**
     @param foodName Is the value being initialized into this.foodName.
     @param numOfMinsToCook Is the value being initialized into this.NumOfMinsToCook.

     @custom.ensure  this.foodName = foodName;
     @custom.ensure  this.NumOfMinsToCook = numOfMinsToCook;
     */
    public CookingFood(String foodName, int numOfMinsToCook) {
        this.foodName = foodName;
        this.NumOfMinsToCook = numOfMinsToCook;

    }

    /**
     *
     *    @return Returns the current Integer value of the NumOfMinsToCook
     */
    public int getNumOfMinsToCook() {
        return NumOfMinsToCook;
    }

    /**
     *
     * @param numOfMinsToCook is being initialized into NumOfMinsToCook
     */
    public void setNumOfMinsToCook(int numOfMinsToCook) {
        NumOfMinsToCook = numOfMinsToCook;
    }

    /**
     *    @return Returns the current String value of the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     *    @param foodName is initialized into this.foodname;
     *    @custom.ensure this.foodName = foodName;
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

}
