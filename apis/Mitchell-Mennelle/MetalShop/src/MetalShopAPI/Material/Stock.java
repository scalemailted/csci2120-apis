package MetalShopAPI.Material;

import MetalShopAPI.Interfaces.Namable;
import MetalShopAPI.Interfaces.Typeable;

public class Stock extends StockType implements Typeable, Namable {

    public Stock(int stockQty, String stockName, String material) {
        super(stockQty, stockName, material);
        this.stockName = stockName;
        this.material = material;
        this.stockQty = stockQty;
    }

    @Override
    public int breakIt() {
        if(this.stockQty > 0){
            this.setStockQty(this.stockQty - 2);
        }
        else{
            this.stockQty = 0;
        }
        return this.stockQty;
    }

    @Override
    public int consume() {
        if(this.stockQty > 0) {
            this.setStockQty(this.getStockQty() - 1);
        }
        else{
            this.stockQty = 0;
        }
        return this.stockQty;
    }

    @Override
    public int explode() {
        this.setStockQty(0);
        return this.stockQty;

    }
    public String toString(){
        String text = String.format(" %d/ %s/ %s",stockQty,stockName,material);
        return text;
    }

    @Override
    public String name(String n) {
        this.setStockName(n);
        return this.getStockName();
    }

    @Override
    public String type(String s) {
        this.setMaterial(s);
        return this.getMaterial();
    }
}
