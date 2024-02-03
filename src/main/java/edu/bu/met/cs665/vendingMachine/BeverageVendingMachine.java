package edu.bu.met.cs665.vendingMachine;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.CoffeeBeverage;
import edu.bu.met.cs665.beverage.TeaBeverage;
import edu.bu.met.cs665.condiments.Condiment;

import java.util.Scanner;

public class BeverageVendingMachine implements VendingMachine {
    Beverage selectedBeverage;
    Condiment condimentArray[] = new Condiment[6];
    Scanner inputScanner = new Scanner(System.in);

    public boolean registerOrder() {
        String order = "";

        do {
            System.out.println("Would you like coffee or tea?");
            order = inputScanner.nextLine();
        } while (!order.equals("coffee") && !order.equals("tea"));

        if (order.equals("tea")) {
            selectedBeverage = new TeaBeverage();
        } else if (order.equals("coffee")) {
            selectedBeverage = new CoffeeBeverage();
        }
        return true;
    };

    public void prepareOrder() {
        if (selectedBeverage.toString().equals("coffee")) {
            System.out.println("brewing coffee.");
        } else if (selectedBeverage.toString().equals("tea")) {
            System.out.println("brewing tea.");
        } else {
            System.out.println("Something went very wrong.");
        }
    };

    public double calculateOrderTotal(){
        return 1.25;
    };

    public void serveItem() {
        System.out.println("test1");
    };
}
