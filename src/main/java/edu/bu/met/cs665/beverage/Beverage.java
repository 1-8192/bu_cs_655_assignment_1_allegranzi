package edu.bu.met.cs665.beverage;

/**
 * Interface class for beverages used in beverage machines.
 */
public interface Beverage {
  /**
   * Basic method used by class that implement the interface. Prints out a drink specific
   * brew message.
   *
   * @return message string.
   */
  String getBrewMessage();

  /**
   * Retrieves the beverage price.
   *
   * @return the price for the beverage.
   */
  double getPrice();
}
