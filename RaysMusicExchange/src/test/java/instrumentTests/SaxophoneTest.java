package instrumentTests;

import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Brass", "Brassy", InstrumentType.BRASS, 600, 995, "Alto");
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brassy", saxophone.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(600, saxophone.getBuyingPrice(), 0.1);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(995, saxophone.getSellingPrice(), 0.1);
    }

    @Test
    public void canGetSaxType() {
        assertEquals("Alto", saxophone.getTypeOfSax());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(395, saxophone.calculateMarkUp(), 0.1);
    }




}

