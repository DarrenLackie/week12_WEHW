package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp(){
        return sellingPrice - buyingPrice;

    }
}
