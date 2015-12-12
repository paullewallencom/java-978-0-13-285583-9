// This program calculates the sale price of an
// item that is regularly priced at $59, with
// a 20 percent discount subtracted.

public class Discount
{
	public static void main( String[] args )
	{
		// Variables to hold the regulsr price, the
		// amount of a dicount, and the sale price.
		double regularPrice = 59.0;
		double discount;
		double salePrice;

		// Calculate the amount of a 20% dicount.
		discount = regularPrice * 0.2;

		// Calculate the sale price by subtracting
		// the discount from the regular price.
		salePrice = regularPrice - discount;

		// Display the reuslts.
		System.out.println( "Regular price: $" + regularPrice );
		System.out.println( "Discount amount $" + discount );
		System.out.println( "Sale price: $" + salePrice );
	}
}