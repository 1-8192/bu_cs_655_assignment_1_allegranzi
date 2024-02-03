package edu.bu.met.cs665.beverage;

public class LatteMacchiato extends CoffeeBeverage{
    private String brewMessage = "Brewing your Latte Macchiato coffee";

    public String getBrewMessage() {
        return brewMessage;
    }

    @Override
    public String toString() {
        return "Latte Macchiato";
    }
}
