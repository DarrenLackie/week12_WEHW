package accessoryTests;

import accessories.Cable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CableTest {

    Cable cable;

    @Before
    public void before() {
        cable = new Cable("XLR", 5, 15);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("XLR", cable.getDescription());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(5, cable.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(15, cable.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, cable.calculateMarkUp(), 0.1);
    }




}
