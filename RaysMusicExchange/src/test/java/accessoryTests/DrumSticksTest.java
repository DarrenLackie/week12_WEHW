package accessoryTests;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Vic Firth 5B", 5, 9);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Vic Firth 5B", drumSticks.getDescription());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(5, drumSticks.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(9, drumSticks.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4, drumSticks.calculateMarkUp(), 0.1);
    }




}
