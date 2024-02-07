import java.util.Scanner;
public class BonusCalc {

	public static int bonus(int score) {
		if (score >= 1000) {
			return score * 2;
		}
		else if (score >= 500 || score < 1000) {
			return  score;
		}
		else if (score < 500) {
			return 50;
		}
		return score;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the score.");
		int sc = s.nextInt();
		
		System.out.println("The bonus is " + bonus(sc));
		
	}

}
