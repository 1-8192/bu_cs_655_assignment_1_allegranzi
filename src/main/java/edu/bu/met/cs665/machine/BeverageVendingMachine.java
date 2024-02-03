package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverage.*;
import edu.bu.met.cs665.condiments.Condiment;
import edu.bu.met.cs665.condiments.Milk;
import edu.bu.met.cs665.condiments.Sugar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class representing a beverage vending machine.
 */
public class BeverageVendingMachine implements VendingMachine {
  Beverage selectedBeverage;
  ArrayList<Condiment> condiments = new ArrayList<>();
  Scanner inputScanner = new Scanner(System.in);

  public boolean registerOrder() {
      String order = "";

      do {
          System.out.println("Would you like coffee or tea?");
          order = inputScanner.nextLine();
      } while (!order.equals("coffee") && !order.equals("tea"));

      if (order.equals("tea")) {
          System.out.println("Would you like Black Tea, Green Tea, or Yellow Tea?");
          String teaChoice = inputScanner.nextLine();

          switch (teaChoice) {
              case "Black Tea":
                  selectedBeverage = new BlackTea();
                  break;
              case "Green Tea":
                  selectedBeverage = new GreenTea();
                  break;
              case "Yellow Tea":
                  selectedBeverage = new YellowTea();
                  break;
              default:
                  System.out.println("Thats is not a type of tea. We will make you a black tea.");
                  selectedBeverage = new BlackTea();
                  break;
          }
      } else if (order.equals("coffee")) {
          System.out.println("Would you like an Americano, Espresso, or Latte Macchiato?");
          String coffeeChoice = inputScanner.nextLine();

          switch (coffeeChoice) {
              case "Americano":
                  selectedBeverage = new Americano();
                  break;
              case "Espresso":
                  selectedBeverage = new Espresso();
                  break;
              case "Latte Macchiato":
                  selectedBeverage = new LatteMacchiato();
                  break;
              default:
                  System.out.println("Thats is not a type of coffee. We will make you an espresso.");
                  selectedBeverage = new Americano();
                  break;
          }
      }

      System.out.println("Than you. You have selected " + selectedBeverage.toString());
      return true;
  };

    public void prepareOrder() {
        String milkCount = "";
        String sugarCount = "";

        System.out.println("would you like to add milk or sugar?");
        String input = inputScanner.nextLine();

        if (!input.equals("no")) {
            System.out.println("How many milks would you like to add? (3 max)");
            milkCount = inputScanner.nextLine();

            System.out.println("How many sugars would you like to add? (3 max)");
            sugarCount = inputScanner.nextLine();
        }

        if (!milkCount.isEmpty() && Integer.valueOf(milkCount) > 3) {
            milkCount = "3";
            System.out.println("We can only add in 3 milks, so that's all you get :-(");
        }

        if (!sugarCount.isEmpty() && Integer.valueOf(sugarCount) > 3) {
            sugarCount = "3";
            System.out.println("We can only add in 3 sugars, so that's all you get :-(");
        }

        try {
            if (!milkCount.isEmpty()) {
                for (int i = 0; i < Integer.valueOf(milkCount); i++) {
                    condiments.add(new Milk());
                }
            }

            if (!sugarCount.isEmpty()) {
                for (int i = 0; i < Integer.valueOf(sugarCount); i++) {
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
    };

    public double calculateOrderTotal(){
        return Double.sum(selectedBeverage.getPrice(), condiments.stream().mapToDouble(Condiment::getPrice)
                .sum());
    };
}
