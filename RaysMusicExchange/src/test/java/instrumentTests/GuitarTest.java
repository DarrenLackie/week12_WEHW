package instrumentTests;

import instruments.DrumKit;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Ash", "Black", InstrumentType.GUITAR, 450, 895, 6);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Ash", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(450, guitar.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(895, guitar.getSellingPrice(), 0.1);
    }

    @Test
    public void canGetNumberOfShells() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(445, guitar.calculateMarkUp(), 0.1);
    }




}

