
public class Vehicle extends TaxableItem
{
         // <<<< complete for part 2 >>>>
	
	private double dealerCost; //private instance variables
	private double dealerMarkup;
	
	public Vehicle(double cost, double markup, double tax) { //constructor
		super(tax);
		dealerCost = cost;
		dealerMarkup = markup;
	}
	
	public double getListPrice() { //returns prices of elements
		return dealerCost + dealerMarkup;
	}
	
	public void changeMarkup(double newMarkup) { //changes markup value
		dealerMarkup = newMarkup;
	}
}
