import java.util.Scanner;

public class forLoop {
	public static void main(String[] args) {
		System.out.println("what problem would you like to solve?");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();

		if (choice == 1) {
			
			for(int j = 1; j < 500 + 1; j++)
			{
				if (j % 5 == 0 || j % 7 == 0)
					System.out.print(j + " ");
			}

			if (choice == 2) {
				System.out.println("enter 10 numbers");
				int sum = 0; 
				for (int i = 0; i < 10; i += 1){ 
					sum += s.nextInt(); 
				} 
				System.out.println("The total sum is: " + sum );
			}
		}
		if (choice == 3) {


			double q;
			double sumPos = 0, sumNeg = 0, countPos = 0, countNeg = 0, h;

			int n = 10;
			for (int i = 0; i < n; i++) {
				System.out.println("Please enter number");
				h = s.nextDouble();
				if (h>0) {
					q = h/10;
					System.out.println(q);
				}
				if (h<0) {
					double w1 = h/10;	
					System.out.println(w1);

				}
			}

			System.out.println("Average of positive numbers is " + sumPos/countPos);
			System.out.println("Average of negative numbers is " + sumNeg/countNeg);

		}
		if (choice == 4) {
			System.out.println("what factorial do you want");
			int t;
			t=s.nextInt();
			int i,a=1;  
			for(i=1;i<=t;i++){    
				a=a*i;    
			}    
			System.out.println("Factorial of "+t+" is: "+a);   
		}
		if (choice == 5) {
			for (int i = 1; 1<=30; i++)
				System.out.println((Math.pow(2,i)));
		}






	}

	
}
