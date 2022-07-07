package MetalShopAPI.Material;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An abstract class for setting basic stock attributes.
 *
 */

public abstract class StockBase {
    protected int stockQty;
    protected String stockName;

    /**
     *
     * @param stockQty Amount of an item of stock.
     * @param stockName Name of the piece of stock being created.
     */
    public StockBase(int stockQty, String stockName) {
        this.stockQty = stockQty;
        this.stockName = stockName;
    }

    /**
     *
     * @return Returns the current stock quantity.
     */
    public int getStockQty() {
        return this.stockQty;
    }

    /**
     * @ensures obj StockQty = this.StockQty
     * @param stockQty Sets the instance variable to passed in value.
     */
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    /**
     *
     * @return returns the currently stored stock name.
     */
    public String getStockName() {
        return this.stockName;
    }

    /**
     * @ensures this.stockName = passed in stockName
     * @param stockName passed in.
     */

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
