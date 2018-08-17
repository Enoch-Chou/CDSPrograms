package Chapters.chapter3.CircumferenceAndVolume;

public class CircumferenceAndVolume {
	public CircumferenceAndVolume(double x) {
		radius = x;
	}
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	public double getVolume() {
		return Math.PI * Math.pow(radius, 3) * 4/3;
	}
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	private double radius;
}
