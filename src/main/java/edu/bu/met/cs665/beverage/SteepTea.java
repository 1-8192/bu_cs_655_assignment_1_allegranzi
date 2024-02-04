package edu.bu.met.cs665.beverage;

public class SteepTea implements BrewMethod{

  /**
   * Prints out an informative message about how the tea is being brewed.
   *
   * @return message string.
   */
  public String brewBeverage(String teaType) {
    return "Steeping your " + teaType + " tea. Patience is golden.";
  };
}
