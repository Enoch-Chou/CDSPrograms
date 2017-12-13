package Chapters.chapter3;

public class DataSet {
	public DataSet(int a, int b, int c, int d) {
		num1 = a;
		num2 = b;
		num3 = c;
		num4 = d;
	}
	public void addValue() {
		largest = Math.max(num1, Math.max(num2, Math.max(num3, num4)));
		smallest = Math.min(num1, Math.min(num2,Math.min(num3, num4)));
	}
	public int getLargest() {
		return largest;
	}
	public int getSmallest() {
		return smallest;
	}
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int largest;
	private int smallest;
}
