package edu.bu.met.cs665.beverage;

/**
 * Interface class for beverages used in beverage machines.
 */
public interface BrewMethod {
  /**
   * Basic method used by class that implement the interface. Prints out a drink specific
   * brew message.
   *
   * @return message string.
   */
  String brewBeverage(String type);
}
