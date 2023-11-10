package shop;

import interfaces.ISell;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(item);
    }

    public double calculatePotentialProfit(){
        double profit = 0.0;
        for(ISell item : stock){
            profit += item.calculateMarkUp();
        }
        return profit;
    }
}
