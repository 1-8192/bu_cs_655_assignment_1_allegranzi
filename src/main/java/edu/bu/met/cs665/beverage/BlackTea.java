package edu.bu.met.cs665.beverage;

public class BlackTea extends TeaBeverage{
    private String brewMessage = "brewing your black tea";

    public String getBrewMessage() {
        return brewMessage;
    }

    @Override
    public String toString() {
        return "Black Tea";
    }
}
