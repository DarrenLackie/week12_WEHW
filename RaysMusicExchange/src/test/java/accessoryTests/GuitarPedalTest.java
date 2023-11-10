package accessoryTests;

import accessories.Cable;
import accessories.GuitarPedal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarPedalTest {

    GuitarPedal guitarPedal;

    @Before
    public void before() {
        guitarPedal = new GuitarPedal("Big Muff Distortion", 45, 75);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Big Muff Distortion", guitarPedal.getDescription());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(45, guitarPedal.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(75, guitarPedal.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(30, guitarPedal.calculateMarkUp(), 0.1);
    }
}
