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
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    BeverageVendingMachine bevMachine = new BeverageVendingMachine();
    System.out.println(FullyAutomatedBeverageMachineConstants.WELCOME_MESSAGE);

    bevMachine.registerOrder();

    System.out.println("We've taken your order.");

    bevMachine.prepareOrder();

    double total = bevMachine.calculateOrderTotal();

    if (total != 0.00) {
      System.out.println("Your total is: " + total);
    }
    System.out.println("Thank you for using the Hot Bev 5000 Fully Automatic Beverage Machine");
  }
}
