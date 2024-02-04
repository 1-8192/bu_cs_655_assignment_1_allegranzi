/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: TestBeverageVendingMachine.java
 * Description: The test class for BeverageVendingMachine.
 */
package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverage.Espresso;
import edu.bu.met.cs665.condiments.Condiment;
import edu.bu.met.cs665.condiments.Milk;
import edu.bu.met.cs665.condiments.Sugar;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for TestBeverageVendingMachine. Most of the class methods rely on user input, so I focused on
 * testing the order total calculation method.
 */
public class TestBeverageVendingMachine {

  private final BeverageVendingMachine vendingMachine = new BeverageVendingMachine();

  /**
   * Checks order calculation method.
   */
  @Test
  public void testCalculateOrderTotal() {
    vendingMachine.selectedBeverage = new Espresso();
    List<Condiment> condiments = Arrays.asList(new Milk(), new Sugar());
    vendingMachine.condiments = new ArrayList<>(condiments);
    // assertEquals with a double is deprecated since double math is tricky. Adding in a delta as per:
    // https://stackoverflow.com/questions/5939788/junit-assertequalsdouble-expected-double-actual-double-epsilon
    assertEquals(3.0, vendingMachine.calculateOrderTotal(), 0.01);
  }

  /**
   * Testing that if calculation causes exception, the method returns 0.0.
   */
  @Test
  public void testCalculateOrderTotalException() {
    vendingMachine.selectedBeverage = new Espresso();
    vendingMachine.condiments = null;
    // assertEquals with a double is deprecated since double math is tricky. Adding in a delta as per:
    // https://stackoverflow.com/questions/5939788/junit-assertequalsdouble-expected-double-actual-double-epsilon
    assertEquals(0.00, vendingMachine.calculateOrderTotal(), 0.01);
  }
}
