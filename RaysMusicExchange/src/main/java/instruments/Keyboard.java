package instruments;

public class Keyboard extends Instrument {

    private String brand;

    public Keyboard(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, String brand) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String play(){
        return "plonk, plonk, I'm the sound of a keyboard";
    }
}
