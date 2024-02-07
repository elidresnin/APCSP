import java.util.Scanner;
public class setThree {

	static boolean checkPerfectSquare(double x)  
	{ 

		double sq = Math.sqrt(x); 

		return ((sq - Math.floor(sq)) == 0); 
	} 



	public static double getOrderTotal(int nb,int bp, double n)
	{
		return (nb + bp * n); 



	}

	public static double workHours(int x, double y, double z) {
		return (x * y * z);
		
	}
	
	
	
	
	
	static double getOrderTotal; 


	static int dogYears(int years)
	{
		return (int)((13+(years-1)*16/3.0)+.5);

	}
	static int x;
	static int y;


	public static void compareWages() {
		System.out.println("you called compare wages");
		Scanner s = new Scanner(System.in);
	}
	static double aPay;
	static double bPay;
	static int aHours;
	static int bHours;
	static double totalPayA;
	static double totalPayB;
	int morePay;
	static int noOvertimeA;
	static int noOvertimeB;
	static double overTimeA; 
	static double overTimeB;

	static double totalWages;
	static double pay;
	static int hoursWorked, overtime, noOvertime;

	public static void main(String[] args) { 

		Scanner s = new Scanner(System.in);

		System.out.println("choose what problem to solve");
		System.out.println("Enter a choice 1 to 5 ");
		System.out.println("1 Perfect Square ");
		System.out.println("2 dogYears ");
		System.out.println("3 Total Wages ");
		System.out.println("4 Compare Wages ");
		System.out.println("5 Books ");
		int choice = s.nextInt();

		int bp;
		int nb;

		if (choice == 1) {
			System.out.print("Enter any number:");
			Scanner scanner = new Scanner(System.in);
			double num = scanner.nextDouble(); 

			if (checkPerfectSquare(num)) 
				System.out.print(num+ " is a perfect square number"); 
			else
				System.out.print(num+ " is not a perfect square number");


		}
		if (choice == 2) {
			System.out.println("what is your dog's age?");
			x = s.nextInt();
			y = dogYears(x);
			System.out.println("your dog's age is " + y);
		}
		if (choice == 3) {
			System.out.println("how many hours did you work this week?");
			hoursWorked = s.nextInt();
			if (hoursWorked > 40) {
				System.out.println("what is your hourly pay?");
				pay = s.nextDouble();
				System.out.println("hours worked = " + hoursWorked + " pay = " + pay + " wages = " + workHours(hoursWorked, pay, 1.5));
			}
			else {
				System.out.println("what is your hourly pay?");
				pay = s.nextDouble();
				System.out.println("hours worked = " + hoursWorked + " pay = " + pay + " wages = " + workHours(hoursWorked, pay, 1));
			}			
	
			
			
		}
		if (choice == 4) {
				System.out.println("how many hours did worker A and B work?");
				aHours = s.nextInt();
				bHours = s.nextInt();
				System.out.println("how much pay did they get?");
				aPay = s.nextInt();
				bPay = s.nextInt();
	
				if (aHours > 40) {
					System.out.println("worker A wages = " + workHours(aHours, aPay, 1.5));
					totalPayA = workHours(aHours,aPay, 1.5 );
				}
				if (bHours > 40) {
					System.out.println("worker B wages = " + workHours(bHours, bPay, 1.5));
					totalPayB = workHours(bHours,bPay, 1.5 );
				}
				if (aHours <= 40) {
					System.out.println("worker A wages = " + workHours(aHours, aPay, 1));
					totalPayA = workHours(aHours,aPay, 1 );
				}
				if (bHours <= 40) {
					System.out.println("worker B wages = " + workHours(bHours, bPay, 1));
					totalPayB = workHours(bHours,bPay, 1 );
				}
				if (totalPayA > totalPayB) {
					System.out.println("Worker A has more pay");
				}
				if (totalPayB > totalPayA) {
					System.out.println("Worker B has more pay");

				}
				if (totalPayA == totalPayB) {
					System.out.println("both workers have the same pay");
				}
					
			}
			if (choice == 5) {
				System.out.println("how many be prepared books and next best books?");
				bp = s.nextInt();
				nb = s.nextInt();
				getOrderTotal(bp, nb, 1);
				if (getOrderTotal(bp, nb ,1) == 2) {
					System.out.println("be prepared books is " + bp + ", next best books = " + nb + " your total price is 39.95" );

				}
				if (getOrderTotal(bp, nb ,1)== 1)	{
					System.out.println("be prepared books is " + bp + ", next best books = " + nb + " your total price is 21.95");
				}

				if (getOrderTotal(bp, nb ,1) >= 3 && getOrderTotal(bp, nb ,1) < 12) {
					System.out.println("be prepared books = " + bp + ", next best books = " + nb + " your total price is " + (getOrderTotal(bp, nb, 16.95)));
				}
				if (getOrderTotal(bp, nb ,1) >=12) {
					System.out.println("be prepared books = " + bp + ", next best books = " + nb + " Your total price is " + (getOrderTotal(bp, nb, 16)));
				}		


				
				
				
			}
			
	}
	
}








