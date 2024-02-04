package edu.bu.met.cs665.beverage;

public class PullCoffee implements BrewMethod{

  /**
   * Prints out an informative message about how the coffee is being brewed.
   *
   * @return message string.
   */
  public String brewBeverage(String coffeeType) {
    return "Pulling your " + coffeeType + " cofee. Enjoy the aroma";
  };
}
