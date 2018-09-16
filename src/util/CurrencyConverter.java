package util;

public class CurrencyConverter {

	public static final double iofTax = 6.00;
	public static double currencyPrice;

	public static double calculateTotalPurchasePrice(double amountToPurchase) {

		double totalPurchasePrice = (amountToPurchase * currencyPrice);
		
		totalPurchasePrice += (totalPurchasePrice * iofTax) / 100.00; 
		
		return totalPurchasePrice;
		
	}
}
