package shopTests;

import accessories.Accessory;
import accessories.GuitarStrings;
import instruments.DrumKit;
import instruments.Guitar;
import instruments.Instrument;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument guitar;
    Instrument drumkit;
    Accessory guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Ash", "Black", InstrumentType.GUITAR, 450, 895, 6);
        drumkit = new DrumKit("Oak", "Purple", InstrumentType.PERCUSSION, 700, 1250, 5);
        guitarStrings = new GuitarStrings("Ernie Ball regular", 2.29, 5.99);
    }

    @Test
    public void shopStartsWithNoStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItemToStock(){
        shop.addItem(guitar);
        shop.addItem(drumkit);
        shop.addItem(guitarStrings);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addItem(guitar);
        shop.addItem(drumkit);
        shop.addItem(guitarStrings);
        assertEquals(3, shop.getStock().size());
        shop.removeItem(guitarStrings);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addItem(guitar);
        shop.addItem(drumkit);
        shop.addItem(guitarStrings);
        assertEquals(998.7, shop.calculatePotentialProfit(), 0.1);
    }
}
