package edu.bu.met.cs665.beverage;

/**
 * A class representing a Latte Macchiato coffee. It is a longer pull and weaker than espresso
 * and includes milk. It extends the coffee Beverage superclass, which implementes the
 * Beverage Interface.
 */
public class LatteMacchiato extends CoffeeBeverage {

  /**
   * Return the brew message.
   *
   * @return The specific brew message string.
   */
  public String getBrewMessage() {
    return "Brewing your Latte Macchiato coffee";
  }

  /**
   * Overriding the class' toString method to print something more readable.
   *
   * @return the string value of the class name.
   */
  @Override
  public String toString() {
    return "Latte Macchiato";
  }
}
