package instruments;

public class Saxophone extends Instrument {

    public String typeOfSax;

    public Saxophone(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, String typeOfSax) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.typeOfSax = typeOfSax;
    }

    public String getTypeOfSax() {
        return typeOfSax;
    }

    public String play(){
        return "Baker Street";
    }
}
