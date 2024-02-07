import java.util.Scanner;

public class SetFive {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  int floor, orchestra, balcony, bSold, fSold, oSold, totalCost, total;
		  
		  System.out.println("How many Floor tickets were sold?");
		  floor = s.nextInt();
		  
		  System.out.println("How many orcestra tickets were sold?");
		  orchestra = s.nextInt();
		  
		  System.out.println("How many Balcony tickets were sold?");
		  balcony = s.nextInt();
		  
		  fSold = floor * 30;
		  bSold = balcony * 15;
		  oSold = orchestra * 25;
		  
		  totalCost = fSold + bSold + oSold;
		  total = floor + orchestra + balcony;
		  
		  System.out.println("There were " + total + " tickets sold, with a total revenue of $" + totalCost);
		  System.out.println("There were " + balcony + " Balcony tickets sold, with a revenue of $" + bSold);
		  System.out.println("There were " + floor + " Floor tickets sold, with a revenue of $" + fSold);
		  System.out.println("There were " + orchestra + " Orchestra tickets sold, with a revenue of $" + oSold);
		  
		  
		  
	}

}
