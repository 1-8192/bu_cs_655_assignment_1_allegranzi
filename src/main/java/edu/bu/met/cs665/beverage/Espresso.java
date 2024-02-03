package edu.bu.met.cs665.beverage;

public class Espresso extends CoffeeBeverage{
    private String brewMessage = "Brewing your espresso coffee";

    public String getBrewMessage() {
        return brewMessage;
    }

    @Override
    public String toString() {
        return "Espresso";
    }
}
