/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: BeverageVendingMachine.java
 * Description: Clas representing a beverage vending machine.
 */

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverage.Americano;
import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.BlackTea;
import edu.bu.met.cs665.beverage.Espresso;
import edu.bu.met.cs665.beverage.GreenTea;
import edu.bu.met.cs665.beverage.LatteMacchiato;
import edu.bu.met.cs665.beverage.YellowTea;
import edu.bu.met.cs665.condiments.Condiment;
import edu.bu.met.cs665.condiments.Milk;
import edu.bu.met.cs665.condiments.Sugar;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class representing a beverage vending machine.
 */
public class BeverageVendingMachine implements VendingMachine {
  /**
   * The Beverage.
   */
  Beverage selectedBeverage;

  /**
   * Selected Condiments.
   */
  ArrayList<Condiment> condiments = new ArrayList<>();

  /**
   * Scanner instance used to record user input.
   */
  Scanner inputScanner = new Scanner(System.in);

  /**
   * Takes an order from a customer for a beverage.
   */
  public void registerOrder() {
    String order = "";

    do {
      System.out.println("Would you like coffee or tea?");
      order = inputScanner.nextLine();
    } while (!order.equalsIgnoreCase("Coffee") && !order.equalsIgnoreCase("Tea"));

    if (order.equalsIgnoreCase("tea")) {
      System.out.println("Would you like Black Tea, Green Tea, or Yellow Tea?");
      String teaChoice = inputScanner.nextLine();

      switch (teaChoice.toLowerCase()) {
        case "black tea":
          selectedBeverage = new BlackTea();
          break;
        case "green tea":
          selectedBeverage = new GreenTea();
          break;
        case "yellow tea":
          selectedBeverage = new YellowTea();
          break;
        default:
          System.out.println("Thats is not a type of tea. We will make you a black tea.");
          selectedBeverage = new BlackTea();
          break;
      }
    } else if (order.equalsIgnoreCase("coffee")) {
      System.out.println("Would you like an Americano, Espresso, or Latte Macchiato?");
      String coffeeChoice = inputScanner.nextLine();

      switch (coffeeChoice.toLowerCase()) {
        case "americano":
          selectedBeverage = new Americano();
          break;
        case "espresso":
          selectedBeverage = new Espresso();
          break;
        case "latte macchiato":
          selectedBeverage = new LatteMacchiato();
          break;
        default:
          System.out.println("Thats is not a type of coffee. We will make you an espresso.");
          selectedBeverage = new Espresso();
          break;
      }
    }

    System.out.println("Thank you. You have selected " + selectedBeverage.toString());
  }

  /**
   * Prepares the beverage order by adding condiments if necessary.
   */
  public void prepareOrder() {
    String milkCount = "";
    String sugarCount = "";

    System.out.println("would you like to add milk or sugar?");
    String input = inputScanner.nextLine();

    if (!input.equalsIgnoreCase("no")) {
      System.out.println("How many milks would you like to add? (3 max)");
      milkCount = inputScanner.nextLine();

      System.out.println("How many sugars would you like to add? (3 max)");
      sugarCount = inputScanner.nextLine();
    }

    if (!milkCount.isEmpty() && Integer.parseInt(milkCount) > 3) {
      milkCount = "3";
      System.out.println("We can only add in 3 milks, so that's all you get :-(");
    }

    if (!sugarCount.isEmpty() && Integer.parseInt(sugarCount) > 3) {
      sugarCount = "3";
      System.out.println("We can only add in 3 sugars, so that's all you get :-(");
    }

    try {
      if (!milkCount.isEmpty()) {
        for (int i = 0; i < Integer.parseInt(milkCount); i++) {
          condiments.add(new Milk());
        }
      }

      if (!sugarCount.isEmpty()) {
        for (int i = 0; i < Integer.parseInt(sugarCount); i++) {
          condiments.add(new Sugar());
        }
      }
    } catch (Exception e) {
      System.out.println("ran into an issue preparing your drink " + e.getMessage());
    }

    System.out.println(selectedBeverage.getBrewMessage());
    if (!milkCount.isEmpty()) {
      System.out.println("Adding in " + milkCount + " milks.");
    }
    if (!sugarCount.isEmpty()) {
      System.out.println("Adding in " + sugarCount + " sugars.");
    }
  }

  /**
   * Calcualtes the total for the order including condiments.
   *
   * @return the total price for the order.
   */
  public double calculateOrderTotal() {
    try {
      return Double.sum(selectedBeverage.getPrice(), condiments.stream()
                  .mapToDouble(Condiment::getPrice).sum());
    } catch (Exception e) {
      System.out.println("We ran into an issue calculating your total. Enjoy the drink on us!");
      return 0.00;
    }
  }
}
