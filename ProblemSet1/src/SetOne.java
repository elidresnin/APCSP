
import java.util.Scanner;

public class SetOne {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  double currentPrice, newPrice, percentIncrease, priceDifference;
		  
		  System.out.println("What is the price of the toy?");
		  currentPrice = s.nextDouble();
		  
		  System.out.println("What is the percentage increase? (Enter as a Decimal)");
		  percentIncrease = s.nextDouble();
		  
		  newPrice = currentPrice * (percentIncrease + 1);
		  
		  priceDifference = newPrice - currentPrice;
		  
		  System.out.println("The new price is $" + String.format("%.2f", newPrice));
		  System.out.println("The price difference is $" + String.format("%.2f", priceDifference));
		  
		  
		  

	}

}
