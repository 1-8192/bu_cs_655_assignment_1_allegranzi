package edu.bu.met.cs665.vendingMachine;

public interface VendingMachine {

    boolean registerOrder();

    double calculateOrderTotal();

    void prepareOrder();
}
