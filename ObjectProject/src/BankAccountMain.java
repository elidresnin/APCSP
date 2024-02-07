import java.util.*;

public class BankAccountMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BankAccount elon = new BankAccount(101101, 21810000000.0);
		BankAccount mansor = new BankAccount(1111, -500000);
		
		System.out.println(elon.getBalence());
		
		System.out.println(mansor.getBalence());
		
		elon.withdraw(50000000.0);
		
		System.out.println(elon.getBalence());
		
		mansor.deposit(10000000.0);
		System.out.println(mansor.getBalence());
		
		elon.withdraw(-100000000.0);
		
		System.out.println(elon.getBalence());
		
		mansor.deposit(-100000);
		
		System.out.println(mansor.getBalence());
		
		mansor.withdraw(9600000.0);
		
		System.out.println(mansor.getBalence());
		
		
		
		
		
		
		
		
		

	}

}
