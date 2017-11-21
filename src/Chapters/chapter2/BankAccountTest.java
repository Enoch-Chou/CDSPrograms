//Enoch Chou,Mr. Heiser, Honors Computer Programming Program 6
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount C = new BankAccount(1000.0); //object
		System.out.println("You have a balance of $" + C.getBalance()); //output and methods
		C.Deposit(200.0);
		System.out.println("After a deposit of $200 you have $" + C.getBalance());
		C.Withdraw(500.0);
		System.out.println("After a withdrawal of $500 you have $" + C.getBalance());
		C.Withdraw(400.0);
		System.out.println("After a withdrawal of $400 you have $" + C.getBalance());
		C.addInterest(10);
		System.out.println("After the added interest of 10% you have $" + C.getBalance());
		BankAccount momsSavings = new BankAccount(1000.0);
		momsSavings.addInterest(10);
		System.out.println("After the added interest of 10% you have $" + momsSavings.getBalance());
		
	}
	
}
