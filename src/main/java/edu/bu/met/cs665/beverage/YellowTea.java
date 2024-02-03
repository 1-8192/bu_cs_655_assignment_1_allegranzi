package edu.bu.met.cs665.beverage;

public class YellowTea extends TeaBeverage{
    private String brewMessage = "Brewing your Yellow Tea";

    public String getBrewMessage() {
        return brewMessage;
    }

    @Override
    public String toString() {
        return "Yellow Tea";
    }
}
