package Chapters.Semester1Review;

public class CompoundInterest {
	public CompoundInterest(double initial, int interest, int year) {
		p = initial;
		r = (float) interest / 100 ;
		n = year;
	}
	public String getAmount() {
		String str = String.format("$%1.2f", p * Math.pow(1+r, n));
		return str;
	}
	public void incrementYear() {
		n += 1;
	}
	private double p;
	private double r;
	private int n;
}
