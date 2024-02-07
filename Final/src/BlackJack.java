import java.util.*;
public class BlackJack {
	
	static int AiTurn() {

		int AiHand = ((int)(Math.random()*10+1)) + (12);
		int rng = ((int) (Math.random()*10+1));
		while(true) {
			if(AiHand>21) {
				return 0;
			}
			if(AiHand < 13) {
				AiHand += ((int)(Math.random()*10+1));
				if(AiHand>21) {
					return 0;
				}

			}
			else if(AiHand>13 && rng>5) {
				AiHand += ((int)(Math.random()*10+1));
				if(AiHand > 21) {
					return 0;
				}
			}
			else {
				return AiHand;
			}
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner gary = new Scanner(System.in);

		int hand =  ((int)(Math.random()*10+1)) + ((int)(Math.random()*10+1));


		while(true) {
			System.out.println("Your Hand has: " + hand + " points");
			System.out.println("The dealer has " + AiTurn() + " points");

			System.out.println("1. Hit or 2. Stay");
			int choice = gary.nextInt();

			if(choice == 1) {

				hand += (int)(Math.random()*11+1);
				if(hand > 21) {
					hand = -1;
					System.out.println("Bust");
					break;
				}

			}
			else if(choice == 2) {


				if(AiTurn() > hand) {
					System.out.println("You lose");
					break;
				}
				else if(AiTurn() < hand) {
					System.out.println("You Win");
					break;

				}
				else if(AiTurn() == hand) {
					System.out.println("Tie");
					break;
				}
			}

		}
	}
		
		
		
	
	
	

}
