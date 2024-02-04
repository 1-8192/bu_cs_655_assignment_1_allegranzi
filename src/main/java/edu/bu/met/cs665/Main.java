/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Main.java
 * Description: The Main executable class for the Fully Automatic Beverage Machine program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.machine.BeverageVendingMachine;

/**
 * This is the Main executable class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    // Instantiating the beverage machine.
    BeverageVendingMachine bevMachine = new BeverageVendingMachine();

    // Guiding user through CLI inputs to place an order.
    System.out.println(FullyAutomatedBeverageMachineConstants.WELCOME_MESSAGE);
    bevMachine.registerOrder();
    System.out.println(FullyAutomatedBeverageMachineConstants.ORDER_TAKEN);

    // Preparing order with condiments.
    bevMachine.prepareOrder();

    // Calculating order total and completing interaction.
    double total = bevMachine.calculateOrderTotal();
    if (total != 0.00) {
      System.out.println(FullyAutomatedBeverageMachineConstants.TOTAL_MESSAGE + total);
    }
    System.out.println(FullyAutomatedBeverageMachineConstants.BYE_MESSAGE);
  }
}
