package Chapters.chapter3;

public class Pair {
	public Pair(int aFirst, int aSecond) {
		num1 = aFirst;
		num2 = aSecond;
	}
	public int getSum() {
		return num1 + num2;
	}
	public int getDifference() {
		return num1 - num2;
	}
	public int getProduct() { 
		return num1 * num2;
	}
	public double getAverage() {
		return (num1 + num2)/2.0;
	}
	public int getDistance() { 
		return Math.abs(num1 - num2);
	}
	public int getMaximum() {
		return Math.max(num1, num2);
	}
	public int getMinimum() { 
		return Math.min(num1,num2);
	}
	private int num1;
	private int num2;
}
