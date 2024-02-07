import java.util.Scanner;
import java.util.Random;

public class whileLoops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int guess;
		int count = 1;
		int num = r.nextInt(100);
		
		System.out.println("guess a number between 1 and 100");
		guess = 0;
		
		while (guess != num) {
			guess = s.nextInt();

			if (guess > num) {
				System.out.println("your number is too high. Try again");
				count++;
			}
			else if (guess < num) {
				System.out.println("your number is too low. Try again");
				count++;
			}
			
			
			else if (guess == num) {
				System.out.println("You are correct");
				
				System.out.println("it took you " + count + " attempts");
			}
			
			
				
		}
		
		
		
		
		
	}

}
