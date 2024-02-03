package edu.bu.met.cs665.beverage;

/**
 * A class representing Yellow Tea. It is a great tea.
 * It extends the Tea Beverage superclass, which implementes the Beverage Interface.
 */
public class YellowTea extends TeaBeverage {
  /**
   * Return the brew message.
   *
   * @return The specific brew message string.
   */
  public String getBrewMessage() {
    return "Brewing your Yellow Tea";
  }

  /**
   * Overriding the class' toString method to print something more readable.
   *
   * @return the string value of the class name.
   */
  @Override
  public String toString() {
    return "Yellow Tea";
  }
}

