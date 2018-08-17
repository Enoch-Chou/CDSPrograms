package Chapters.chapter5.ThreeNumbers;


public class ThreeNumbers {
	public ThreeNumbers(double x,double y,double z) {
		smallest = x;
		middle = y;
		largest = z;
	}
	
	public double getMiddle() {
		if ((smallest < middle && middle < largest) || (largest < middle && middle < smallest)) {
			return middle;
		}
		else if ((middle < smallest && smallest < largest) || (largest < smallest && smallest < middle)) {
			return smallest;
		}
		return largest;
	}
	public double getLargest() {
		return Math.max(smallest, Math.max(middle, largest));
	}
	public double getSmallest() {
		return Math.min(smallest,Math.min(middle, largest));
	}
	private double smallest;
	private double middle;
	private double largest;
}
