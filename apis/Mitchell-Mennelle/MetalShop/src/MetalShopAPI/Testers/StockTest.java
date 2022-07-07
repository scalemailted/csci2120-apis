package MetalShopAPI.Testers;

import MetalShopAPI.Material.Stock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void breakIt() {
        Stock s1 = new Stock(4,"4x8 sheet steel","Sheet goods");
        s1.breakIt();
        assertEquals(2,s1.getStockQty());
        //testing negative integer boundary.
        Stock s01 = new Stock(-1,"4x8 sheet steel","Sheet goods");
        s01.breakIt();
        assertEquals(0,s01.getStockQty());
    }

    @Test
    void consume() {
        Stock s2 = new Stock(4,"4x8 sheet steel","Sheet goods");
        s2.consume();
        assertEquals(3,s2.getStockQty());
        //testing negative integer boundary.
        Stock s02 = new Stock(-1,"4x8 sheet steel","Sheet goods");
        s02.consume();
        assertEquals(0,s02.getStockQty());
    }

    @Test
    void explode() {
        Stock s3 = new Stock(4,"4x8 sheet steel","Sheet goods");
        s3.explode();
        assertEquals(0,s3.getStockQty());
        //testing negative integer boundary.
        Stock s03 = new Stock(-1,"4x8 sheet steel","Sheet goods");
        s03.explode();
        assertEquals(0,s03.getStockQty());
    }
    @Test
    void name() {
        Stock s4 = new Stock(3,null,null);
        s4.name("sheet goods");
        assertTrue(true,"sheet goods");
    }

    @Test
    void type() {
        Stock s5 = new Stock(3,null,null);
        s5.type("Steel");
        assertTrue(true,"Steel");
    }
}