package edu.bu.met.cs665.beverage;

/**
 * A class representing an Espresso coffee. It is a very strong coffee.
 * It extends the coffee Beverage superclass, which implementes the Beverage Interface.
 */
public class Espresso extends Beverage {
  /*
   * Public constructor for the class. Instantiating the brewMethod class and type.
   */
  public Espresso() {
    type = "Espresso";
    brewMethod = new PullCoffee();
  }

  /**
   * Overriding the class' toString method to print something more readable.
   *
   * @return the string value of the class name.
   */
  @Override
  public String toString() {
    return type;
  }
}
