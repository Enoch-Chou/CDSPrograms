package Chapters.chapter2;

//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class BankAccount {
	public BankAccount(double x) { //constructor sets balance to input
		balance = x;
	}
	public void Deposit(double y) { //method adds y to balance
		balance = balance + y;
	}
	public void Withdraw(double z) { //method adds z to balance
		balance = balance - z;
	}
	public double getBalance() { //method returns balance
		return balance;
	}
	public void addInterest(double rate) { //method adds interest rate that's inputted
		balance = balance * (1 + (rate / 100));
	}
	
	private double balance;
	
}
