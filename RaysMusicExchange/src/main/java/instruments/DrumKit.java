package instruments;

public class DrumKit extends Instrument {

    public int numberOfShells;

    public DrumKit(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfShells) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfShells = numberOfShells;
    }

    public int getNumberOfShells() {
        return numberOfShells;
    }

    public String play(){
        return "Badoom Tschhssshh";
    }
}
