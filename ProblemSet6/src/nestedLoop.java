import java.util.Scanner;
public class nestedLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What program would you like to use?");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		int choice = s.nextInt();
		
		if (choice == 1) {
			System.out.println("Enter a value.");
			int n = s.nextInt();
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print("* ");
				}
			System.out.println();
			}
		}
		if (choice == 2) {
			System.out.println("Enter a value for M");
			int m = s.nextInt();
			System.out.println("Enter a value for N");
			int n = s.nextInt();
			
			for(int t = 0; t < m; t++) {
				for(int x = 0; x < n; x++) {
					System.out.print("* ");
				}
			System.out.println();
			}
		}
		if (choice == 3) {
			for(int u = 0; u <= 10; u++) {
				for(int v = 0; v <= 10; v++) {
					System.out.print(v * 10);
				}
				System.out.println();
			}

		}

	}
}
