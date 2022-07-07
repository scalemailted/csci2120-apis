package MetalShopAPI.Material;

import MetalShopAPI.Interfaces.Breakable;
import MetalShopAPI.Interfaces.Consumable;
import MetalShopAPI.Interfaces.Flammable;
import MetalShopAPI.Interfaces.Stackable;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An absract class for setting stock type. What is the material made of? This can
 * be used to categorize different pieces of stock.
 *
 */

public abstract class StockType extends StockBase implements Consumable, Flammable, Breakable, Stackable {
    protected String material;

    /**
     *
     * @param stockQty Amount of the piece of stock being created.
     * @param stockName name of stock. (sheet good, flat stock, ETC).
     * @param material (Steel, wood, ETC.)
     */
    public StockType(int stockQty, String stockName,String material) {
        super(0, null);
        this.material = material;
        this.stockQty = stockQty;
        this.stockName = stockName;
    }

    @Override
    public abstract int breakIt();


    @Override
    public abstract int consume();



    @Override
    public abstract int explode();

    /**
     * @requires obj of type Stackable
     * @param add obj being passed in.
     * @ensures Quantity is increase by one or set to 0 is number is < 0.
     */
    @Override
    public void stack(Stackable add) {

        if (add instanceof StockType) {
            StockType qty = (StockType) add;
            if (qty.getStockQty() >= 0) {
                this.setStockQty(qty.getStockQty());
                this.stockQty += 1;
            } else{
                this.stockQty = 0;
            }
        }
    }

    /**
     *
     * @return returns the current value for material.
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     *
     * @param material Requires a string passed in for type of material. (wood, metal, ETC.)
     * @ensures value is set to passed in String.
     */
    public void setMaterial(String material) {

        this.material = material;
    }
}
