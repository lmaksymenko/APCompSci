
public abstract class TaxableItem implements Item
{
  private double taxRate; //private instance variable
 
  public TaxableItem(double rate)  {   //constructor
      taxRate = rate;  
  }
 
  public abstract double getListPrice(); //
 
  /*** 
   * <<< Complete for Part 1 >>> 
   * Implement the method purchasePrice. The method calculates 
   * and returns the price of the item including the tax.
   */ 
  
  public double purchasePrice() {
	  double finalPrice = getListPrice() + (getListPrice()*taxRate);
	  return finalPrice;
  }
 
}

