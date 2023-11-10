package instrumentTests;

import instruments.DrumKit;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void before(){
        drumKit = new DrumKit("Maple", "Natural", InstrumentType.PERCUSSION, 1000, 2000, 4);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Maple", drumKit.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Natural", drumKit.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drumKit.getType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(1000, drumKit.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(2000, drumKit.getSellingPrice(), 0.1);
    }

    @Test
    public void canGetNumberOfShells() {
        assertEquals(4, drumKit.getNumberOfShells());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1000, drumKit.calculateMarkUp(), 0.1);
    }




}
