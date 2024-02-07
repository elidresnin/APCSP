
public class BankAccount {
	private int id;
	private double balence;
	
	public BankAccount(int id, double balence) {
		this.id = id;
		this.balence = balence;
		
	}
	
	public BankAccount() {
		id = 1;
		balence = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}
	public void withdraw(double amount) {
		if (amount <= balence && amount > 0) {
			balence -= amount;
		}
		
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balence += amount;
		}
		
	}
	

}
