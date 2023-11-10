package instrumentTests;

import instruments.DrumKit;
import instruments.InstrumentType;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Plastic", "Black", InstrumentType.KEYBOARDS, 550, 750, "Roland");
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Plastic", keyboard.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", keyboard.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARDS, keyboard.getType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(550, keyboard.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(750, keyboard.getSellingPrice(), 0.1);
    }

    @Test
    public void canGetNumberOfShells() {
        assertEquals("Roland", keyboard.getBrand());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200, keyboard.calculateMarkUp(), 0.1);
    }




}
