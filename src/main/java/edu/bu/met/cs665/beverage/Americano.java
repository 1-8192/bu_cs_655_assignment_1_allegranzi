package edu.bu.met.cs665.beverage;

/**
 * A class representing an Americano coffee. It is a longer pull and weaker than espresso.
 * It extends the coffee Beverage superclass, which implementes the Beverage Interface.
 */
public class Americano extends CoffeeBeverage {

  /**
   * Return the brew message.
   *
   * @return The specific brew message string.
   */
  public String getBrewMessage() {
    return "Brewing your Americano coffee";
  }

  /**
   * Overriding the class' toString method to print something more readable.
   *
   * @return the string value of the class name.
   */
  @Override
  public String toString() {
    return "Americano";
  }
}
