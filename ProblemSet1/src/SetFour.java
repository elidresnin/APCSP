import java.util.Scanner;

public class SetFour {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  double length, width, area, totalCost, pricePerFoot;
		  
		  System.out.println("What is the length of the room?");
		  length = s.nextDouble();
		  
		  System.out.println("What is the width of the room?");
		  width = s.nextDouble();
		  
		  System.out.println("What is the price per square foot? (in Dollars)");
		  pricePerFoot = s.nextDouble();
		  
		  
		  area = length * width;
		  totalCost = area * pricePerFoot;
		  
		  
		  
		  System.out.println("Width = " + width);
		  System.out.println("Length = " + length);
		  System.out.println("Area = " + area);
		  System.out.println("Total cost = $" + totalCost);

	}

}
