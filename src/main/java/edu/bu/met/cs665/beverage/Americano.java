package edu.bu.met.cs665.beverage;

/**
 * A class representing an Americano coffee. It is a longer pull and weaker than espresso.
 * It extends the coffee Beverage superclass, which implementes the Beverage Interface.
 */
public class Americano extends Beverage {
  /*
   * The type of coffee beverage.
   */
  private String type = "Americano";

  /*
   * Public constructor for the class. Instantiating the brewMethod class and type.
   */
  public Americano() {
    type = "Americano";
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
