import java.util.Scanner;

public class SetTwo {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		  double currentSalary, bonusPercent, bonusAmount ;
		  
		  System.out.println("What is the current salary?");
		  currentSalary = s.nextDouble();
		  
		  System.out.println("What is the percentage of the bonus? (Enter as a Decimal)");
		  bonusPercent = s.nextDouble();
		  
		  bonusxAmount = currentSalary * (bonusPercent + 1);
		  

		  
		  System.out.println("The bonus is $" + String.format("%.2f", bonusAmount));
		  
	}

}
