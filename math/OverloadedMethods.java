import java.util.Scanner;

public class OverloadedMethods {

	public static void greeting() {
		System.out.println("Dear user, welcome to New Wave.");
	}
	public static void greeting(String n) {
		System.out.println("Dear " + n + ", welcome to New Wave.");
	}

	public static int max( int a, int b) {
		if (a > b)
			return a;
		return b;
	}
	
	public static int max( int a, int b, int c ) {
		return max(max(a,b), c);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Overloaded methods, enter your choice:");
		System.out.println("1 - Greeting");
		System.out.println("2 - Max");
		System.out.println("3 - Average");
		System.out.println("4 - Add");
		int choice = s.nextInt(); 
		
		if (choice == 1) {
			greeting();
			System.out.println("Enter a name");
			String name = s.next();
			greeting(name);
		}
		if (choice == 2)
		{
			
		}
		if( choice == 3) {
			
		}
	
		
		
		
		
		
	}
	
}
