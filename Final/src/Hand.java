
public class Hand {
	private int card1;
	private int card2;
	private int card3;
	private int card4;
	
	

	private int total;
	
	public Hand(int card1, int card2, int total) {
		this.card1 = card1;
		this.card2 = card2;
		this.total = total;
		
	}
	
	public Hand() {
		card1 = 0;
		card2 = 0;
		card3 = 0;
		card4 = 0;

		total = 0;
	}

	public int getCard1() {
		return card1;
	}

	public void setCard1(int card1) {
		this.card1 = card1;
	}

	public int getCard2() {
		return card2;
	}

	public void setCard2(int card2) {
		this.card2 = card2;
	}

	public int getTotal() {
		total = card1 + card2;
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

	public int getCard3() {
		return card3;
	}

	public void setCard3(int card3) {
		this.card3 = card3;
		total = total + card3;
	}

	public int getCard4() {
		return card4;
	}

	public void setCard4(int card4) {
		this.card4 = card4;
	}
	
	
	
	
	

	
	
	

}
