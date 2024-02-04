package edu.bu.met.cs665.beverage;

/**
 * Main Abstract super class for coffee drinks.
 */
public abstract class Beverage {

  public BrewMethod brewMethod;

  public String type = "";
  /**
   * Price for a coffee drink.
   */
  private double price = 2.00;

  /**
   * Gets the price for the drink.
   *
   * @return the price of the coffee drink.
   */
  public double getPrice() {
    return price;
  }

  /**
   * Gets the brew message for the drink.
   *
   * @return the brew message string.
   */
  public String getBrewMessage() {
    return brewMethod.brewBeverage(type);
  }
}
