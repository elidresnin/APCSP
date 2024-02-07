
import java.util.Scanner;

public class SetThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int acUnits, unitsReturned, unitsSold, acInventory;
		
		System.out.println("How many AC Units are in stock at the begining of the month?");
		acUnits = s.nextInt();
		
		System.out.println("How many AC units were sold this month?");
		unitsSold = s.nextInt();
		
		System.out.println("How many AC units were returned this month?");
		unitsReturned = s.nextInt();
		
		acInventory = acUnits - unitsSold + unitsReturned;
		
		System.out.println("There are " + acInventory + " units in stock.");
	}

}
