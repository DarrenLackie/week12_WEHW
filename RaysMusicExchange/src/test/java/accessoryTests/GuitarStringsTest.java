package accessoryTests;

import accessories.GuitarPedal;
import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Ernie Ball Regular", 3.5, 6);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Ernie Ball Regular", guitarStrings.getDescription());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(3.5, guitarStrings.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(6, guitarStrings.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.5, guitarStrings.calculateMarkUp(), 0.1);
    }
}
