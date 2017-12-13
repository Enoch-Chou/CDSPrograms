package Chapters.chapter3;
public class Converter {
	public Converter(double x) {
		meters = x;
	}
	public double convertToMiles() {
		return meters/1609;
	}
	
	public double convertToInches() {
		return meters * (1/0.305);
	}
	public double convertToFeet() {
		return meters * (1/0.025);
	}
	private double meters;
}
