package Chapters.chapter3.Cashier;

public class Cashier {
	public Cashier(double x, double y) {
		amountDue = x;
		amountReceived = y;
	}
	public int getDollars() {
		return (int) ((amountReceived-amountDue)/DOLLAR_VALUE);
	}
	public int getQuarters() {
		return (int) (((amountReceived-amountDue)%DOLLAR_VALUE)/QUARTER_VALUE);
	}
	public int getDimes() { 
		return (int) ((((amountReceived-amountDue)%DOLLAR_VALUE)%QUARTER_VALUE)/DIME_VALUE);
	}
	public int getNickels() {
		return (int) (((((amountReceived-amountDue)%DOLLAR_VALUE)%QUARTER_VALUE)%DIME_VALUE)/NICKEL_VALUE);
	}
	public int getPennies() {
		return (int) (((((((amountReceived-amountDue)%DOLLAR_VALUE)%QUARTER_VALUE)%DIME_VALUE)%NICKEL_VALUE)/PENNY_VALUE)+.5);
	}
	private double amountDue;
	private double amountReceived;
	private static final double DOLLAR_VALUE = 1.00;
	private static final double QUARTER_VALUE = 0.25;
	private static final double DIME_VALUE = 0.10;
	private static final double NICKEL_VALUE = 0.05;
	private static final double PENNY_VALUE = 0.01;
}
