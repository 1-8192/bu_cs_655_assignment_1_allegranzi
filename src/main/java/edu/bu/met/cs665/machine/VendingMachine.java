package edu.bu.met.cs665.machine;

/**
 * Interface for vending machines. Could be food or beverage vending machines.
 */
public interface VendingMachine {
  /**
   * Takes an order from a customer.
   *
   * @return boolean flag whether the order went well or not.
   */
  boolean registerOrder();

  /**
   * Calculates the order total by adding in selections.
   *
   * @return the total for the order.
   */
  double calculateOrderTotal();

  /**
   * Prepares the order for the client.
   */
  void prepareOrder();
}
