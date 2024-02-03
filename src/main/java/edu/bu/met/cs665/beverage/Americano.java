package edu.bu.met.cs665.beverage;

public class Americano extends CoffeeBeverage{
    private String brewMessage = "Brewing your Americano coffee";

    public String getBrewMessage() {
        return brewMessage;
    }

    @Override
    public String toString() {
        return "Americano";
    }
}
