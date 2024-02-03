package edu.bu.met.cs665.beverage;

public class GreenTea extends TeaBeverage{
    private String brewMessage = "Brewing your Green Tea.";

    public String getBrewMessage() {
        return brewMessage;
    }

    @Override
    public String toString() {
        return "Green Tea";
    }
}
