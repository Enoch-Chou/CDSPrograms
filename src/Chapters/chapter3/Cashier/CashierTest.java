package Chapters.chapter3.Cashier;
import java.util.Scanner;

public class CashierTest {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the amount due in dollars and cents: $"); //enter how much needs to pay
		double amountDue = console.nextDouble();
		double amountReceived = console.nextDouble();
		Cashier Jerry = new Cashier(amountDue, amountReceived);
		System.out.println("Give the customer"); //change
		System.out.printf("%2d%9s%n", Jerry.getDollars(), "dollars,"); //dollars
		System.out.printf("%2d%10s%n", Jerry.getQuarters(), "quarters,"); //quarters
		System.out.printf("%2d%7s%n", Jerry.getDimes(), "dimes,"); //dimes
		System.out.printf("%2d%9s%n", Jerry.getNickels(), "nickels,"); //nickels
		System.out.printf("%2d%8s%n", Jerry.getPennies(), "pennies"); //pennies
	}
}
