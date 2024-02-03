package edu.bu.met.cs665.beverage;

public abstract class CoffeeBeverage implements Beverage{
    private double price = 2.00;

    private String brewMessage;

    public double getPrice() {
        return price;
    }

    public String getBrewMessage() {
        return brewMessage;
    }
}
